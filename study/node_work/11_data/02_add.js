const express = require('express')
const path = require('path')
const app = express()

//post처리
app.use(express.urlencoded({extended:true}))
//json처리
app.use(express.json())

app.get('/',(req,res)=>{
    res.sendFile(path.join(__dirname,'views/add.html'))
})

// post(json) 수신 : 
app.post('/calc',(req,res)=>{
    let {no1, no2} = req.body
    console.log('calc',no1, no2)
    let tot = eval(no1) + eval(no2)
    res.json({ret : tot})
})


app.listen(80,()=>{
    console.log("add 서버 시작")
})


/*
더하기 서버를 구현하세요
서버 : 두개의 수를 post 로 받음
클라이언트 : input으로 두개의 수를 입력받아 fetch로 서버에게 비동기 통신 후
결과 내용을 json 형태로 받아 출력 

*/