const express = require('express')
const app = express()

// form data의 form-urlencoded 처리
app.use(express.urlencoded({extended:true}))

app.get('/board',(req, res)=>{
    res.send('목록보기')
})

app.get('/board/:id',(req, res)=>{
    res.send(`상세보기 ${req.params.id}`)  // req.params : 동적url 변수  /board/45          - get
                                          // req.query : url의 query  ?pid=bbb&age=34     -get
                                          // req.body : form-data     form 태그           - post, put, delete
})

app.post('/board',(req, res)=>{
    console.log(req.body)       // req.body : form-data
    res.send(`글쓰기 ${req.body.pid} ${req.body.pname} ${req.body.age}`)
})

app.put('/board',(req, res)=>{
    console.log(req.body)       // req.body : form-data
    res.send(`글수정 ${req.body.pid} ${req.body.pname} ${req.body.age}`)
})

app.delete('/board',(req, res)=>{
    console.log(req.body)   // req.body : form-data
    res.send(`글삭제 ${req.body.pid} ${req.body.pname} ${req.body.age}`)
})

app.listen(80,()=>{
    console.log('express restful 서버 실행')
})