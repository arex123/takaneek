/*

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
*/

/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    
    return s.split(" ").filter((val)=>val.trim().length>0).reverse().join(" ")

};