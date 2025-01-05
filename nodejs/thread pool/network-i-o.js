const https =require('node:https')

const max_calls = 10
const date = new Date()
for(let i=0;i<max_calls;i++){
    https.request('https://google.com',(res)=>{
        res.on('data',()=>{})
        res.on('end',()=>{
            console.log(`Request ${i+1} `,Date.now()-date)
        })
    }).end()
}

/*
in above all num of calls whether 1 or 16 time is almost same till some limit though but in thread pool section even 10th time 
time for all operation starts becoming double

conclusion:
so although crypto.pbkdf2 and https.request are async, https.request method does not seem to use thread pool
*/