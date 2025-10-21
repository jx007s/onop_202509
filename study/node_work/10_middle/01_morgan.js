const express = require('express')
const morgan = require('morgan')
const fs = require('fs')
const path = require('path')
const app = express()

//morgan 미들웨어 설정
// 클라이언트의 로그기록 설정
let type = 'combined'   //표준
//::ffff:192.168.0.78 - - [21/Oct/2025:05:51:10 +0000] "GET / HTTP/1.1" 304 - "-" "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/141.0.0.0 Safari/537.36"

type = 'common'     //ip, 날짜, 메서드, URL, 상태 , 바이트
//::ffff:192.168.0.78 - - [21/Oct/2025:06:08:06 +0000] "GET /qwer HTTP/1.1" 200 20

type = 'dev'        //개발자
//GET /qwer 304 5.168 ms - -

type = 'short'        //간단 로그
//::ffff:192.168.0.78 - GET /qwer HTTP/1.1 304 - - 6.232 ms

const fPath = path.join(__dirname, 'my.log')
const myStream = fs.createWriteStream(fPath, {flags:'a'}) // append 모드로 stream

//파일에 로그 작성
app.use(morgan(type,{stream:myStream}))  

app.get('/',(req,res)=>{
    res.send(`<h1>morgan 서버</h1>`)
})
app.get('/qwer',(req,res)=>{
    res.send(`<h1>morgan qwer</h1>`)
})
app.listen(80,()=>{
    console.log("morgan 서버 시작")
})

