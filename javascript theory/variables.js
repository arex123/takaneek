// // //javascript is loosely typed language, any variable can have data types

// // let a = "abc"
// // console.log(a);

// let arr = [5,4,45,5]
// // console.log(arr);
// // for(var i=0;i<arr.length;i++)
// // {
// //     arr[i]+= 2;
// // }
// // console.log(arr);

// arr = arr.map(function(value){
// return value+2;
// });
// console.log(arr);

// //remove odd ele from arr

// let arr1 = [1,2,3,3,4,5,6,7];

// for(var i=0;i<arr1.length;i++)
//     {
//         if(arr1[i]%2==1)
//         {
//             if(arr1[i+1]==arr1[i])
//             {
//                 arr1.splice(i,1);
//                 i--;
//             }
//             else{
//                 arr1.splice(i,1);
//             }
//         }
//     }
// console.log(arr1);


//how to copy one array to another array
// let copyofarr1 = [...arr1]
// console.log(copyofarr1);

// copyofarr1 = copyofarr1.filter(function(value){
// return value%2 ==0;
// });
// console.log(copyofarr1);

//use of filter function
// let arr = [66,2,3,3,6,7,8,4,4,5,9];

// arr = arr.filter(function(value){
// return value%2==0;
// });
// console.log(arr);

//use of sort
// let arr = [2,5,5,3,4,1];
// console.log(arr.sort(function(a,b){
//     console.log(a);
//  if(a>b){
//      return 1;
//          }   
//  else if(a==b){
//      return 0;
//               }
//      else{
//          return -1;
//          }
    
// }));

//include:it checks if a perticular element is present or not
let arr = [2,5,5,3,4,1];
console.log(arr.includes(6)); // it will print false as 6 is not present in arr

let check = arr.includes(2); // arr.includes(2) will return true as 2 is present in array arr

console.log(check); 











