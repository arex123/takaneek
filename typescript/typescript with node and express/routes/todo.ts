import { Router } from "express";

const router = Router()
import { Todo } from "../models/todo";

const todo:Todo[] = []

router.get('/',(req,res,next)=>{
    res.status(200).json(todo)
})

router.post('/todo',(req,res,next)=>{
    let newTodo:Todo={
        id: new Date().toDateString(),
        text: req.body.text
    }
    todo.push(newTodo)

    res.status(201).json({
        success:true,
        newTodo
    })
})


router.delete('/todo',(req,res,next)=>{
    let id = req.body.id
    let flag=0
    for(let i=0;i<todo.length;i++){
        if(todo[i].id==id){
            delete todo[i]
            flag=1
            break
        }
        
    }

    if(flag==1){

        res.status(200).json({
            success:true
        })
    }else{
        res.status(404).json({
            success:false,
            message:"Item not found"
        })

    }
})

router.put('/todo/:id',(req,res,next)=>{
    let id = req.params.id
    let newText = req.body.newText
    let flag=0
    for(let i=0;i<todo.length;i++){
        if(todo[i].id==id){
            todo[i].text = newText
            flag=1
            break
        }
        
    }

    if(flag==1){

        res.status(200).json({
            success:true
        })
    }else{
        res.status(404).json({
            success:false,
            message:"Item not found"
        })

    }
})

export default router