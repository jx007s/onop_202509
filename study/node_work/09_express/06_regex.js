const express = require('express')
const path = require('path')
const app = express()

app.get('/',(req, res)=>{
    res.sendFile(path.join(__dirname,'views/06_regex.html'))
})

app.get('/qqq',(req, res)=>{
    res.send('qqq 입니다')
})

// 정규식으로  routing
// 정규식에서 / 을 문자열로 넣기 위해 \/ 으로 표현
app.get(/^\/aaa/,(req, res)=>{
    res.send('/aaa 시작 입니다')
})

app.get(/^\/bbb\/([0-9]+)$/,(req, res)=>{
    res.send(`/bbb 입니다 id는 숫자만 가능 : ${req.params[0]}`)
})

// 정규식으로 /bbb/ccc
app.get(/^\/bbb\/ccc$/,(req, res)=>{
    res.send(`/bbb/ccc 입니다.`)
})

app.get('/bbb/ddd',(req, res)=>{
    res.send(`/bbb/ddd 입니다.`)
})

app.listen(80,()=>{
    console.log("regex 서버 시작")
})