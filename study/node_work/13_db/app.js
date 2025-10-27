const express = require('express')
const nunjucks = require('nunjucks')
const path = require('path')
const examRouter = require('./routes/examRouter')
const app = express()

app.use(express.urlencoded({extended:true}))
app.use(express.json())

// template
nunjucks.configure('views',{
    autoescape: true,
    express: app
})

//정적파일
app.use('/fff', express.static(path.join(__dirname, 'fff')))
app.use('/assets', express.static(path.join(__dirname, 'assets')))

//route
app.use('/', examRouter)

app.listen(80,()=>{
    console.log('서버 시작')
})