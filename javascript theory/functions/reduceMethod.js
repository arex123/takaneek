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

try{

    // let newRes = [].reduce((accum,currVal)=>accum+currVal)
    // console.log(newRes)
}catch(e){
    // console.log("Error",e.name,e.message)
}




//sparse array: array contains empty spaces like, [1,3,,43], or array having indexes with empty or undefined value
//dense array: array in witch all indexes are completely filled,every index has a defiend value

let res = [,2,,4].reduce((acc,curr)=>acc+curr)
console.log(res)


















