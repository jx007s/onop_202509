const express = require('express')
const path = require('path')

const app = express()

// router  기능
app.get('/', (req, res)=>{
    //파일 로드
     res.sendFile(__dirname+'\\views\\index.html')
})

// router  기능
app.get('/info', (req, res)=>{
    res.send('/info 페이지 입니다.')
})

// router  기능
app.get('/history', (req, res)=>{
    //절대주소만 가능
    //res.sendFile('D:\\public\\onop\\2025_09\\public\\study\\node_work\\09_express\\views\\history.html')
    //res.sendFile(__dirname+'\\views\\history.html')
    res.sendFile(path.join(__dirname,'views/history.html'))
})

// 배열로 여러 url route
app.get(['/notice','/fnq'], (req, res)=>{
    res.send(`배열 ${req.path} 페이지 입니다.`)
})

// 정규표현식처리 : / 내용 /  
// 정규표현식  /qna or /event
app.get(/\/qna|\/event/, (req, res)=>{
    res.send(`정규식 ${req.path} 페이지 입니다.`)
})

// :prod  (동적url)  정규표현식
app.get('/gall/:prod', (req, res)=>{
    console.log('method',req.method)
    console.log('url',req.url)              //경로 + 쿼리  GET
    console.log('path',req.path)            //경로      /gall?season=spring&nowPage=3
    console.log('query',req.query)          //쿼리      { season: 'spring', nowPage: '3' }
    console.log('params',req.params)        // 동적경로 변수  { prod: 'tv' }
    console.log('headers',req.headers)      //header 개체 {host:'192.168.0.78' , referer: 'http://192.168.0.78/'...}
    console.log(`get('referer')`,req.get('referer'))    //header 특정 요소 http://192.168.0.78/
    console.log('ip',req.ip)                // 요청한 클라이언트 ip : ffff:192.168.0.78
    console.log('ips',req.ips)              // proxy 설정시 IP 배열
    console.log('hostname',req.hostname)    // host 이름  
    console.log('protocol',req.protocol)    // http
    console.log('secure',req.secure)        // https 여부  false
    console.log('originalUrl',req.originalUrl)  //원본url /gall?season=spring&nowPage=3
    console.log('baseUrl',req.baseUrl)      //라우터 마운트 경로 
    console.log('route',req.route)          //매칭된 라우트 정보
    res.send('갤러리 페이지 입니다.')
})


app.listen(80,()=>{
    console.log('express 80 서버 실행')
})
// npm i express  : express 모듈 설치 (서버 운용 평이)
// npm i -g nodemon : js 파일 변경시 자동 서버 재시작 모듈
// nodemon 01_app.js  으로 실행시 자동재시작 반영 ,   node 01_app.js 이나 npm start는 자동재시작 안함

// node 01_app.js는 개발 완성 후 배포시 사용