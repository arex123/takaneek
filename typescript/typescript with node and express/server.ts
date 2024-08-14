// const express = require('type')
import express from "express"
import bodyParser from "body-parser"

const app = express()

import todoRouter from './routes/todo'
app.use(bodyParser.json())
app.use(todoRouter)

app.listen(3004)


