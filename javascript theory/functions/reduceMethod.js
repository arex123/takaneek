/*
Reduce(): 
- It is a method given by Js, for arrays
- It is a higher order function, (HIGHER ORDER FUNCTION: a function that takes functions as an argument "or" returns function as result)
- It executes a reducer function for each element of array
- and a reducer function is a function that takes an argument, performs an action, returns a new result
- reduce() returns single accumulated value
- It is used for data manipulation


sparse array: array contains empty spaces like, [1,3,,43], or array having indexes with empty or undefined value
dense array: array in witch all indexes are completely filled,every index has a defiend value

*/
// Write, Edit and Run your Javascript code using JS Online Compiler
// let res={}

//  let tobj="hello".split("").reduce((accumulator,currentval,index) => {
//     //  console.log(accumulator,currentval,index)
//     accumulator[currentval]=(accumulator[currentval] || 0)+1
//     return accumulator
//  } ,res)

// console.log(tobj);

// let initialObj = {}

// let assdf = [1,2,3,1,1,9].reduce((val,res)=> res+=val )

//val=3
// let assdf = [1,2,3,1,1,9].reduce((val,res,index)=>{
// let assdf = [].reduce((val,res,index)=>{
//     console.log(res,val,index)
//     res+=val
//     return res
// })
// console.log(assdf)

// let result = nums.reduce((accumulator,currVal,index)=>{
//     if(accumulator[target-currVal]!=undefined){
//         return [accumulator[target-currVal],index] 
//     }
//     accumulator[currVal]=index
// },initialObj)

/*using reduce method to print element of array*/
// let a = [1,25,0,3,-4].reduce((accum,currVal,index)=>{
//     console.log(accum,currVal,index)
//     console.log(currVal+accum)

// },12)

// let val=12
// console.log(val+12)
// console.log(val+undefined)
// console.log(val/null)


/*
Exceptions
TypeError
Thrown if the array contains no elements and initialValue is not provided.
*/

try {

    // let newRes = [].reduce((accum,currVal)=>accum+currVal)
    // console.log(newRes)
} catch (e) {
    // console.log("Error",e.name,e.message)
}




//sparse array: array contains empty spaces like, [1,3,,43], or array having indexes with empty or undefined value
//dense array: array in witch all indexes are completely filled,every index has a defiend value

let res = [, 2, , 4].reduce((acc, curr) => acc + curr)
// console.log(res)


/**Function sequential piping
The pipe function takes a sequence of functions and returns a new function. When the new function is called with an argument, the sequence of functions are called in order, which each one receiving the return value of the previous function. */

//combine a function into one function so that result of current function will be argument of next function

//first find sum then find multiply then subtract

let log = (x) => console.log(x)

let sum = (x) => {
    return x + 2
}
let multiply = (x) => {
    return x * 2
}
let subtract = (x) => {
    return x - 2
}
let sumAndMultiply = (x) => {
    return 5 + x * 2
}
let minusAndMultiply = (x) => {
    return x - 2
}
let divFun = (x) => {
    return x / 2
}
// let result=div(minusAndMultiply(sumAndMultiply(subtract(multiply(sum(2,3)))))) 
//above line became so nested we can do this is more clear way using "pipe with reduce method" or i say "Function sequential piping"

function piping(...functions) {
    return (arg) => functions.reduce((acc, currFn) => currFn(acc) , arg)
}

let newRes = piping(sum, multiply, subtract, sumAndMultiply, minusAndMultiply, divFun)(2)


// console.log(newRes)


/* asyn pipe: running promises in sequence */
// Compare this with pipe: fn(acc) is changed to acc.then(fn),
// and initialValue is ensured to be a promise
const asyncPipe =
  (...functions) =>
  (initialValue) =>
    functions.reduce((acc, fn) => acc.then(fn), Promise.resolve(initialValue));

// Building blocks to use for composition
const p1 = async (a) => a * 5;
const p2 = async (a) => a * 2;
// The composed functions can also return non-promises, because the values are
// all eventually wrapped in promises
const f3 = (a) => a * 3;
const p4 = async (a) => a * 4;

asyncPipe(p1, p2, f3, p4)(10).then(console.log); // 1200






















