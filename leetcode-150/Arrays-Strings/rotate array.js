/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4] */

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    if(k==0)
        return 
    let l = nums.length
    k = k % l

    reverse(0,l-k-1,nums)
    reverse(l-k,l-1,nums)
    reverse(0,l-1,nums)
    
};

var reverse = function(st,end,nums){
    while(st<end){
        let temp = nums[st]
        nums[st] = nums[end]
        nums[end] = temp
        st++
        end--
    }
}

/**
1 2 3 4 5 6 7

4 3 2 1 5 6 7

4 3 2 1 7 6 5

5 6 7 1 2 3 4

k = k % 

 */