/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    let ansArr=[]
    let sr=0,er=matrix.length-1,sc=0,ec=matrix[0].length-1
    let count = matrix.length*matrix[0].length
    while(count>0){
        console.log("sr: ",sr,"er:",er,"sc:",sc,"ec:",ec)
        console.log(count)
        
        for(let i=sc;i<=ec;i++){
            ansArr.push(matrix[sr][i])
            count--
        }
        if(count==0)
            break
        sr+=1;
        for(let i=sr;i<=er;i++){
            ansArr.push(matrix[i][ec])
            count--
        }
        if(count==0)
            break
        
        ec-=1;

        for(let i=ec;i>=sc;i--){
            ansArr.push(matrix[er][i])
            count--
        }
        if(count==0)
            break

        er-=1;

        for(let i=er;i>=sr;i--){
            ansArr.push(matrix[i][sc])
            count--
        }

        sc+=1;

    }
    return ansArr
};