const express = require('express')
const nunjucks = require('nunjucks')
const examRouter = require('./routes/examRouter')
const app = express()

// template
nunjucks.configure('views',{
    autoescape: true,
    express: app
})

app.use('/', examRouter)

app.listen(80,()=>{
    console.log('서버 시작')
})