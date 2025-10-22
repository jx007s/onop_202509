const express = require('express')
const path = require('path')
const app = express()

//post처리
app.use(express.urlencoded({extended:true}))

app.get('/',(req,res)=>{
    res.sendFile(path.join(__dirname,'views/fetchHome.html'))
})

app.get('/test1',(req,res)=>{
    res.send('fetch서버응답 test1')
})

app.get('/test2',(req,res)=>{
    console.log('test2',req.query)
    res.send('get test2')
})

app.listen(80,()=>{
    console.log("fetch 서버 시작")
})
