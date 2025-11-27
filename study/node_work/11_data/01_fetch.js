const express = require('express')
const path = require('path')
const app = express()
const multer = require('multer')
const cors = require('cors')

//cors  적용
app.use(
    cors({
        origin:"http://192.168.0.78:7777",   //클라이언트 주소를 ip로 직접작성해야 프론트앤드서버를 정확히 인지함
                                             // 타 컴퓨터에서 접근시 에러 발생 제한
                                             //http://192.168.0.78:7777 로 하지 말것
        credentials:true
    })
)

// FormData 처리
const qwer = multer()

//post처리
app.use(express.urlencoded({extended:true}))
//json처리
app.use(express.json())

app.get('/',(req,res)=>{
    res.sendFile(path.join(__dirname,'views/fetchHome.html'))
})

app.get('/test1',(req,res)=>{
    res.send('강사 서버응답 test1')
})

app.get('/test2',(req,res)=>{
    console.log('test2',req.query)
    res.send('get test2')
})

// post(json) 수신 : 
// app.use(express.json())  + app.use(express.urlencoded({extended:true}))  필요
app.post('/test3',(req,res)=>{
    console.log('test3',req.body)
    res.send('post test3')
})

// FormData  수신 : 
// multer  + app.use(express.urlencoded({extended:true}))  필요
app.post('/test4',qwer.none(),(req,res)=>{
    console.log('test4',req.body)
    res.send('post test4')
})

app.get('/test5',(req,res)=>{
    console.log('test5')
    let data = [
        {pid:'aaa', age:45, mil:true},
        {pid:'bbb', age:37, mil:false},
        {pid:'ccc', age:29, mil:true},
        {pid:'ddd', age:16, mil:false}
    ]
    res.json(data)  /* json 형태의 문자열로 내보내기 (객체로 전송할 수 없음)

    `[
        {"pid":"aaa","age":45,"mil":true},
        {"pid":"bbb","age":37,"mil":false},
        {"pid":"ccc","age":29,"mil":true},
        {"pid":"ddd","age":16,"mil":false}
    ]`
    */
})


app.listen(5000,()=>{
    console.log("fetch 서버 시작")
})


/*
더하기 서버를 구현하세요
서버 : 두개의 수를 post 로 받음
클라이언트 : input으로 두개의 수를 입력받아 fetch로 서버에게 비동기 통신 후
결과 내용을 json 형태로 받아 출력 

*/