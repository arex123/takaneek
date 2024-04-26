/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {
    let obj={}
    for(let i=0;i<nums.length;i++){
        if(obj.hasOwnProperty(nums[i]) && Math.abs(obj[nums[i]]-i)<=k){
            return true
        }else{
            obj[nums[i]]=i
        }
    }
    return false
};