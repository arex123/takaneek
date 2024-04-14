/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index. */

/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    // let mem = Array(nums.length+1).fill(null)
    // return recursion(0,nums,mem)

    let jumpTill=nums[0]
    for(let i=1;i<nums.length;i++){

        if(i>jumpTill){
            return false
        }

        jumpTill = Math.max(jumpTill,nums[i]+i)

    }

    return true

    
};
function recursion(i,nums,mem){

    if(i==nums.length-1){
        return true
    }

    if(mem[i]!=null)
        return mem[i]

    let result=false
    for(let j=1;j<=nums[i];j++){
        result = result || solve(i+j,nums,mem)
    }

    return mem[i]=result

}

/*


0 1 2 3 4
3,2,1,0,4
        i
jt=3


 */