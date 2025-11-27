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


let data = [
        {pid:'aaa', age:45, mil:true},
        {pid:'bbb', age:37, mil:false},
        {pid:'ccc', age:29, mil:true},
        {pid:'ddd', age:16, mil:false}
    ]
    


app.get('/bkMem',(req,res)=>{
    res.json(data)
    
})

app.get('/bkMem/:no',(req,res)=>{
    console.log('상세',req.params.no)
    res.json(data[req.params.no])
})

// post(json) 수신 : 
// app.use(express.json())  + app.use(express.urlencoded({extended:true}))  필요
app.post('/bkMem',qwer.none(),(req,res)=>{
    console.log('쓰기',req.body)
    data.push(req.body)
    res.send('쓰기 성공')
})

// FormData  수신 : 
// multer  + app.use(express.urlencoded({extended:true}))  필요
app.put('/bkMem',(req,res)=>{
    console.log('put',req.body)
    const no = Number(req.body.no)

    const modData = data[no] 
    modData.pid = req.body.pid
    modData.pw = req.body.pw
    modData.age = req.body.age
    modData.marriage = req.body.marriage
    
    res.send('수정 성공')
})

app.delete('/bkMem/:no',(req,res)=>{
    console.log('delete',req.params.no)
    const no = Number(req.params.no)
    data.splice(no,1)  // no 위치에서 1개 삭제
    res.send('삭제 성공')
})


app.listen(5000,()=>{
    console.log("reactFetch 서버 시작")
})

