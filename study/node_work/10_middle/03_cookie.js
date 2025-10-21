const express = require('express')
const app = express()


app.get('/',(req,res)=>{
    res.send(`<h1>쿠키 서버</h1>
        <a href='/ddd/eee/rrr/qwer'>/ddd/eee/rrr/qwer</a>
        <a href='/fff/aaa.html'>fff/aaa.html</a>
        <a href='/bbb.html'>bbb.html</a>
        <a href='/poiu.html'>poiu.html</a>
        `)
})

app.listen(80,()=>{
    console.log("static 서버 시작")
})