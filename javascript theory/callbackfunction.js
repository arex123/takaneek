/*

https://www.google.com/url?sa=i&url=https%3A%2F%2Fmedium.com%2F%40igorwojda%2Fparameter-vs-argument-1741acab53ec&psig=AOvVaw0vIr1oWAqUz0kr69MvJ8sV&ust=1712917648746000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCLDDhtL5uYUDFQAAAAAdAAAAABAE


A callback is a function passed as an argument to another function

This technique allows a function to call another function

A callback function can run after another function has finished
*/

//getting cheese then creating doh then making pizza with doh
function getCheese(callback){
    setTimeout(()=>{
        let cheese="🧀"
        console.log("got the cheese",cheese)
        callback(cheese)
    },2000)
}

function makeDoh(cheese,callback){
    
    setTimeout(()=>{
        let doh = cheese+"🌾"
        console.log("here is your doh",doh)
        callback(doh)
    },2000)
}

function makePizza(doh,callback){
    setTimeout(()=>{
        let pizza = "🍕"
        callback(pizza)
    },2000)
}

getCheese((cheese)=>{
    makeDoh(cheese,(doh)=>{
        makePizza(doh,(pizza)=>{
            console.log("here is your pizza sir",pizza)
        })
    })
})
