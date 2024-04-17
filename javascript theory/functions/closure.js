
//how to solve sequence of function call
let res = sum(1)(2)(3)(4)(5)
function sum(val){
    let total=val
    function innerSum(a){
        // console.log('a: ',a)
        if(typeof a===undefined)
            return total
        total+=a
        return innerSum
    }
    return innerSum
}
console.log(res())