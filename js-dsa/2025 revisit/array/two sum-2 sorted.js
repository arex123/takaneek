//the array is sorted and for sorted mostly binary search
//LC - 167
/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(num, target) {
    let st=0,end=num.length
    while(st<end){
        if(num[st]+num[end]==target){
            return [st+1,end+1]
        }else if(num[st]+num[end]<target){
            st++
        }else{
            end--
        }
    }
    return [-1,-1]
};