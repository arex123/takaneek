/*
Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index. */

/**
 * @param {number[]} nums
 * @return {number}
 */
var jump = function(nums) {
    // let mem=Array(nums.length).fill(null)
    // return solve(0,nums,mem)

    //bottom up approach
    let min=0
    let jumpTill=nums[0]
    for(let i=1;i<nums.length;i++){


        if(nums[i]+i>jumpTill){
            min=min+1
        }

        jumpTill = Math.max(jumpTill,nums[i]+i)

    }
    return min

};
function solve(i,nums,mem){
    if(i==nums.length-1){
        return 0
    }
    if(mem[i]!=null)
        return mem[i]
    let min=Number.MAX_VALUE
    for(let j=1;j<=nums[i];j++){
        let res = solve(i+j,nums,mem)
        min=Math.min(min,res)
    }

    // console.log(min)
    return mem[i]=min+1

}
/*

mem=
[,,3,2,]
0 1 2 3 4
2,3,1,1,4
i
min=*,j=1

0 1 2 3 4
2,3,1,1,4
  i
min=3,j=3




0 1 2 3 4
2,3,1,1,4
    i
min=2,j=1

0 1 2 3 4
2,3,1,1,4
      i
min=1,j=1

0 1 2 3 4
2,3,1,1,4
        i
min=*,j=1


 */