const express = require('express')
const path = require('path')
const Websocket = require('ws')
const http = require('http')
const app = express()

// Express routing
app.get('/',(req, res)=>{
    res.sendFile(path.join(__dirname,'views/07_websocket.html'))
})

//1. Express 기반 HTTP 서버 생성
const server = http.createServer(app)

//2. WebSocket 서버 생성 : http server 필요 혹은 {port :  포트번호} 로 해도 무방
const wss = new Websocket.Server({server})

console.log('WebSocket 서버 80 에서 실행')

//4. 클라이언트 접속
// ws 통신객체,  req : 요청객체
wss.on('connection',(ws, req)=>{
    console.log('클라이언트 연결 정보----')
    let ip = req.socket.remoteAddress
    console.log('ip : ',ip)
    console.log('url : ',req.url)
    console.log('user-agent : ',req.headers['user-agent'])
    console.log('origin : ',req.headers.origin)
    console.log('---------------------')


    // 5.1 클라이언트 -> 서버 수신
    ws.on('message',(msg)=>{
        console.log(`${ip} 로부터 받은 메세지 : ${msg}`)
    })

    // 5.2 서버 -> 클라이언트 송신
    ws.send('서버가 메세지를 보냅니다.')


    // 반복적으로 메세지 송신
    let cnt = 0
    let ss = setInterval(()=>{
        
        ws.send(`서버가 메세지를 보냅니다. ${cnt++}`)
    },2000)




    // 6. 에러발생시
    ws.on('err',(err)=>{
        console.log(`${ip} 에러발생 : ${err.message}`)
    })

    // 7. 연결 종료
    ws.on('close',()=>{
        console.log(`${ip} 연결종료`)  // 클라이언트의 브라우저 종료시 연결해제
    })

})

//3. 서버 실행
server.listen(80,()=>{
    console.log("Express + websocket 서버 시작")
})