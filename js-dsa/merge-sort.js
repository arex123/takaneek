/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArray = function(nums) {
    mergeSort(nums,0,nums.length-1)
    return nums
};

function mergeSort(nums,st,end){

   if(st==end){
       return 
   }
   let mid = Math.floor((st+end)/2)
   let leftArr=mergeSort(nums,st,mid) 
   let rightArr=mergeSort(nums,mid+1,end)

   mixArr(nums,st,mid,end)
  
}

function mixArr(nums,st,mid,end){
   let left = st,right=mid+1
   let newArr = []
   let size = end-st+1
   while(left<=mid && right<=end){
       if(nums[left]<nums[right]){
           newArr.push(nums[left++])
       }else{
           newArr.push(nums[right++])
       }
   }

   while(left<=mid){
       newArr.push(nums[left++])
   }
   while(right<=end){
       newArr.push(nums[right++])
   }
   
   let p=0
   for(let i=st;i<=end;i++){
       nums[i]=newArr[p++]
   }
}