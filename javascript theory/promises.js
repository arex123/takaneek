/*
Promise: It is an object that represent eventual completion of an async operation

It is created to avoid callback hell(nesting of callback function which makes it 
harder to read and manage)

A promise object have 3 states: Pending,Fulfilled,Rejected

We can create our own promise using Promise() constructor example is below
after creating we can use promise using 
then()=>which gets called when promise is resolve
catch()=>it gets called when promise is rejected
finally()=>it gets executed after then/catch, it surely will get executed

all there methods then,catch,finally takes callback function

*/

//example booking a flight ticket
let flight = new Promise(function(resolve,reject){
    let isBoarded = true //lets say the result will be positive
    if(isBoarded){
        resolve("Flight is in the air")
    }else{
        reject("Flight is cancelled")
    }
})

flight.then((data)=>{
    console.log(data) //flight is in the air
}).catch((data)=>{
    console.log(data)//Flight is cancelled
}).then(()=>{
    console.log("finished")
})


/*Converting example of callback funtion to promise, creating pizza */
/*Steps:
1:get cheese
2:make doh
3:make pizza

every task takes around 2 seconds to complete
*/


function getCheese(){

    return new Promise(function(resolve,reject){
        setTimeout(()=>{
            let cheese="🧀"
            console.log("got the cheese",cheese)
           resolve(cheese)
        },2000)
    })
}

function makeDoh(cheese){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            let doh = cheese+"🌾"
            console.log("here is your doh",doh)
            // resolve(doh) //lets say cheese was bad and try to call reject
            reject("Chesse was so bad")
        },2000)
    })
}

function makePizza(doh){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            let pizza = "🍕"
            resolve(pizza)
        },2000)
    })
}


getCheese().then(cheese=>{
    return makeDoh(cheese)
}).then(doh=>{
    return makePizza(doh)
}).then(pizza=>{
    console.log("here is your pizza: ",pizza)
}).catch((error)=>{
    console.log(error)
}).finally(()=>{
    console.log("finished")
})