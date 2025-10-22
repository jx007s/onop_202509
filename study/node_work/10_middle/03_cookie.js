const express = require('express')
const cookieParser = require('cookie-parser')
const mod01 = require('./coo/01_mod.js')
const app = express()

// cookie 사용
app.use(cookieParser())

let me = null
//document.cookie
app.get('/',(req,res)=>{
    res.send(`<h1>쿠키 서버</h1>
        <a href='/m1'>m1</a>
        <a href='/make'>make</a>
        <a href='/view'>view</a>
        <a href='/modify'>modify</a>
        <a href='/delete'>delete</a>
        `)
})

app.get('/m1',mod01.fn_1)

app.get('/make',(req, res)=>{

    //쿠키생성 및 클라이언트 저장
    res.cookie('pid','aaa')
    res.cookie('pname','원빈')
    res.send('쿠키 생성')
})

app.get('/view',mod01.view)

app.get('/modify',mod01.modify)

app.get('/delete',(req, res)=>{

    //쿠키삭제
    res.clearCookie('pname')
    res.send('쿠키 삭제')
})

app.listen(80,()=>{
    console.log("cookie 서버 시작")
})