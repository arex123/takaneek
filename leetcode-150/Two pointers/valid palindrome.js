/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let ns=extractAlpha(s)
    let i=0,j=ns.length-1
    while(i<j){
        if(ns[i]!=ns[j]){
            return false
        }
        i++
        j--
    }

    return true
};

var extractAlpha=function(s){
    let ns=""
    for(let i=0;i<s.length;i++){
        if(/[a-z]/.test(s[i]) || /[A-Z]/.test(s[i]) || /[0-9]/.test(s[i])){
            ns+=s[i].toLowerCase()
        }
    }
    return ns
}

