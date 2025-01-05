const crypto = require('node:crypto')

//1st example
/*
console.log("12")
const date = Date.now()
crypto.pbkdf2Sync('password','salt',100000,512,'sha512')
crypto.pbkdf2Sync('password','salt',100000,512,'sha512')
crypto.pbkdf2Sync('password','salt',100000,512,'sha512')
crypto.pbkdf2Sync('password','salt',100000,512,'sha512')
console.log("hash ",Date.now()-date)//hash  1377
*/
/** above is taking 1377ms to complete, as by using Sync version of pbkdf2   */


//2nd example
// console.log("size inc ",process.env.UV_THREADPOOL_SIZE)
process.env.UV_THREADPOOL_SIZE=5
const max_calls = 10

const date = Date.now()
for(let i=0;i<max_calls;i++){
    crypto.pbkdf2('password','salt',100000,512,'sha512',()=>{
        console.log("hash ",Date.now()-date)
    })
}
/** o/p

hash  367
hash  373
hash  373
hash  373
 
 In 2nd example 4 calls are taking almost same time which means its far less time then all 4 sync versions of pbkdf2 
 each call is running in libuv's thread pool, because nodejs's main thread ofloads these async task to them 

    MAIN THREAD : hey libuv, i need to read file contents but that is time consuming task. I don't want to block further code
from being executed during this time. can i offloads this task to you?

    LIBUV: sure main thread, unlike you who is single threaded, i have a pool of threads that i can use to run some of these
time consuming tasks. when the task is done, the file contents are retrieved and the associated callback function can be run.

libuv's thread pool has 4 thread as from 5th calls how time become double
so we can increase thread pool size by
process.env.UV_THREADPOOL_SIZE




https://www.youtube.com/watch?v=3JYNNf3Iljo
imp 5 = increasing the thread pool size can help with performance but that is limited by the number of available computer's cpu cors
*/