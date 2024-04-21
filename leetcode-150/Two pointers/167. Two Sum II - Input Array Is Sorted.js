/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {

    let i=0,j=numbers.length-1
    let res=[]
    while(i<j){
        if(numbers[i]+numbers[j]==target){
            res.push(i+1,j+1)
            break
        }

        if(numbers[i]+numbers[j]>target){
            j--
        }else{
            i++
        }
    }

    return res
    
};

/*

i=0,j=1
target

if(nums[i]+nums[j]>target){
    j--
}



 */