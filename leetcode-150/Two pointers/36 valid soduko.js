/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function(board) {

    //checking horizontally
    for(let i=0;i<board.length;i++){
        let set={}
        for(let j=0;j<board[0].length;j++){
            if(board[i][j]!="." && set.hasOwnProperty(board[i][j])){
                return false
            }
            set[board[i][j]]=1
        }

    }

    //vertically
     for(let i=0;i<board[0].length;i++){
        let set={}
        for(let j=0;j<board.length;j++){
            if(board[j][i]!="." && set.hasOwnProperty(board[j][i])){
                return false
            }
            set[board[j][i]]=1
        }

    }

    //checking in 3*3 matrix
    for(let i=0;i<board.length;i+=3){
        for(let j=0;j<board[0].length;j+=3){

            let set = {}
            for(let k=i;k<i+3;k++){
                for(let l=j;l<j+3;l++){
                    if(board[k][l]!="." && set.hasOwnProperty(board[k][l])){
                        return false
                    }
                    set[board[k][l]]=1
                }
            }

        }
    }

    return true



};