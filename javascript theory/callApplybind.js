let name = {
    name:'Aditya'
    ,
    lastName:'kumar',
    printFullName:function(){
        console.log(this.name," ",this.lastName)
    }
}

// name.printFullName() //output: Aditya kumar


let name2 = {
    name:'rahul',
    lastName:'singh',
    
}

//now if we want to print name2's full name, 
 //one way is to declare that printFullname in name2 also
 //another way is FUNCTION BORROWING, with the help of call method

//  name.printFullName.call(name2) //output: rahul singh


/***************************************************************************************************************/

//another example of call method
function printFullName(){
    console.log(this.name," ",this.lastName)
}


//now we want to print obj1's full name, 
let obj1 = {
    name:'light',
    lastName:'yagami'
}

//we have a function for printing full name, we will pass obj1 to printFullname using call mehthod

printFullName.call(obj1)




/*************************************************/



//passing argument in call method

function printFullNamewithState(city,country){
    console.log(this.name," ",this.lastName," is from ",city,", ",country)
}


//now we want to print obj1's full name, 
let obj2 = {
    name:'light',
    lastName:'yagami'
}

//we have a function for printing full name with its place, we will pass obj2 to printFullname with city and country as a argument using call mehthod

// printFullNamewithState.call(obj1,"kanto","japan")


/**********************************************************************************************/

//Apply method

//the difference between call and apply method is how we pass arguments in apply method


// example:
// printFullNamewithState.call(obj1,"kanto","japan")
printFullNamewithState.apply(obj1,["kanto","japan"]) //we pass arguments in array in apply method











/**********************************************************************************************/

//bind method
//it looks like call() but it binds method with object and return copy of that method so that it can be called later

let printMyName = printFullName.bind(name2,"tokyo","japan")
console.log(printMyName) //this will console the printFullName method
printMyName() //now calling returned method
