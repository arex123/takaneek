class Stack{
    constructor(){
        this.top=-1
        this.stack=[]
    }
    
    push(ele){
        this.top=this.top+1
        // this.stack=this.stack.push(ele)
        this.stack[this.top]=ele
    }
    pop(){
        if(this.top==-1){
            return
        }
        this.stack.pop()
        this.top=this.top-1
    }
    
    peek(){
        return this.stack[this.top]
    }
    
    isEmpty(){
        if(this.top==-1){
            return true
        }
        return false
    }
}

let x = new Stack()
// x.push(4)
// x.push(14)
// x.push(-5)
// x.push(65)
// x.pop()
// x.peek()
// console.log(x.stack)
// console.log(x.peek())
console.log(x.isEmpty())