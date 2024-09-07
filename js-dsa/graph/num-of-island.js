/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function(grid) {
    // let vis =Array.from(Array(grid.length),()=>new Array(grid[0].length).fill(false))
    let count=0
    for(let i=0;i<grid.length;i++){
        for(let j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
                traverse(grid,i,j)
                count++
            }
            
        }
    }
    return count
};

function traverse(grid,i,j){

    if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]==0){
        return
    }

    grid[i][j]=0
    traverse(grid,i+1,j)
    traverse(grid,i,j+1)
    traverse(grid,i-1,j)
    traverse(grid,i,j-1)

}
