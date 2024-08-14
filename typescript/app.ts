const num1Ele = document.getElementById('num1') as HTMLInputElement;
const num2Ele = document.getElementById('num2') as HTMLInputElement;
const btn = document.querySelector('button')!

// let numResArr:number[] = [] ,// or
let numResArr:Array<number>=[]
let textResArr:string[]=[]


function add(num1:number | string,num2:number | string){
    if(typeof num1 =='number' && typeof num2 == 'number'){
        return num1+num2
    }else if(typeof num1=='string' && typeof num2=='string'){
        console.log((num1+num2).length)
        return num1 + num2
    }
    return +num1 + +num2
}

btn.addEventListener('click',()=>{
    const n1 = num1Ele.value
    const n2 = num2Ele.value
    const res = add(+n1,+n2)
    const strres = add(n1,n2)
    // console.log("str: ",strres)

    numResArr.push(res as number)
    textResArr.push(strres as string)

    console.log("numResArr: ",numResArr)
    console.log("textResArr: ",textResArr)
    // console.log("result : ",res,strres)
    
})


type aliasForObj = {val:number;timestamp:Date}
//or

interface aliasForObj1{
    val:number,
    timestamp:Date
}

function objectRes(obj:aliasForObj1){
    console.log("obj o/p: ",obj.val)
}
objectRes({val:23,timestamp:new Date()})

// console.log(add('2','8'))


const promiseGeneric = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve("working ")
    },1000)
})

promiseGeneric.then(data=>console.log(data)).catch(e=>console.log(e))