/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function(s, t) {

    let i=0;
    let j=0;
    while(j<t.length && i<s.length){
        if(s[i]==t[j]){
            i++
        }

        j++
    }
    console.log(i,j)
    return i>=s.length
};