class Queue{
    constructor(){
        this.q=[]
        this.front=-1
        this.rear=-1
    }
    
    enqueue(val){
        if(this.front==-1 && this.rear==-1){
            this.front++
            this.rear++
        }else{
            this.rear++
        }
        this.q[this.rear] = val
    }
    
    dequeue(){
        if(this.front==this.rear){
            this.front=-1
            this.rear=-1
        }else{
            this.front++
        }
    }
    
    is_empty(){
        return this.front==-1
    }
    
    get_first_element(){
        if(this.front!=-1){
            return this.q[this.front]
        }else{
            return null
        }
    }
}

// let q = new Queue()
// console.log(q.is_empty(),q.get_first_element())
// q.enqueue(20)
// q.enqueue(6)
// console.log(q.is_empty(),q.get_first_element())
// q.enqueue(43)
// q.dequeue()
// q.dequeue()
// q.dequeue()
// q.dequeue()
// console.log(q,q.is_empty(),q.get_first_element())