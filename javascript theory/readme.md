## How to take input in javascipt file from console

### in js file
    let input = process.args.slice(2) //this will return array of inputs

### how to send inputs like length 4 and breadth 5
- while running the js file add inputs in command, see below command
    
    node index.js 4 5


## create 2d array
    let arr = Array.from(Array(rows), () => Array(columns).fill(null));