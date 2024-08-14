"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const router = (0, express_1.Router)();
let todo = [];
router.get('/', (req, res, next) => {
    res.status(200).json(todo);
});
router.post('/todo', (req, res, next) => {
    let newTodo = {
        id: new Date().toDateString(),
        text: req.body.text
    };
    todo.push(newTodo);
    res.status(201).json({
        success: true,
        newTodo
    });
});
router.delete('/todo/:id', (req, res, next) => {
    const id = req.params.id;
    const index = todo.findIndex(item => item.id == id);
    if (index !== -1) {
        todo.splice(index, 1);
        return res.status(200).json({ success: true });
    }
    else {
        return res.status(404).json({
            success: false,
            message: "Item not found"
        });
    }
});
router.put('/todo/:id', (req, res, next) => {
    let id = req.params.id;
    let newText = req.body.newText;
    let todoIdx = todo.findIndex((item) => item.id == id);
    if (todoIdx >= 0) {
        todo[todoIdx] = {
            id: id,
            text: newText
        };
        return res.status(200).json({
            success: true,
            message: "successfuly updated",
            todo
        });
    }
    res.status(404).json({
        success: false,
        message: "Item not found"
    });
});
exports.default = router;
