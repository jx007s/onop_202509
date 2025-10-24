const express = require('express')
const nunjucks = require('nunjucks')
const path = require('path')
const examRouter = require('./routes/examRouter')
const app = express()


// template
nunjucks.configure('views',{
    autoescape: true,
    express: app
})

//정적파일
app.use('/fff', express.static(path.join(__dirname, 'fff')))

//route
app.use('/', examRouter)

app.listen(80,()=>{
    console.log('서버 시작')
})