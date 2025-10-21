const express = require('express')
const app = express()

/*
use : 
1. proxy 
2. 데이터 전달
3. 에러처리 (500, 404)

next :
route, use - 다음 함수로 진입
메세지 전달 - req 에 key,value 추가
*/


// use : 모든 요청에 처리되는 미들웨어
// req : 요청객체
// res : 응답객체
// next : 다음 미들웨어로 요청 전달 - 실행하지 않으면 이하 구문 (get, post 과 같은 route 포함) 실행불가
app.use((req,res, next)=>{
    console.log(`use 실행 1 ${req.path} , ${req.query.id}`)

    // route 하기 전 유효한 접근인지 확인 - proxy  처리
    if(req.path=='/admin' && req.query.id!='aaa'){
        res.send(`
            <script>
                alert('잘못된 접근입니다')
                location.href='/'
            </script>
            `)
    }else{
        next()
    }
    
})

// 공통데이터 처리 - 이하 구문에서 req를 이용하여 데이터 전달
app.use((req,res, next)=>{
    console.log('use 실행 2')
    req.myMsg = 'use2메세지'
    next()
})

app.get('/',(req, res)=>{
    console.log(`get('/') 실행 -----`)
    res.send(`
        <h1>use 홈이지롱 ${req.myMsg}</h1>
        <a href='/asdf'>asdf</a>
        <a href='/admin?id=aaa'>관리자</a>
        <a href='/cwewecw'>없는페이지</a>
        <a href='/qwer'>에러발생 페이지</a>
        `)
})

// get(route) 처리에서도 next 사용 가능
app.get('/asdf',(req, res, next)=>{
    console.log(`get('/asdf')  실행 -----1`)
    //res.send(`asdf 이지롱 1 ${req.myMsg}`)  next() 실행할 경우  res.send()로 전송시 에러발생
    next()  // 다음 route로 next()  ==> 다음 app.get('/asdf') 호출
})

app.get('/admin',(req, res)=>{
    console.log(`get('/admin') 실행 -----`)
    res.send(`관리자 페이지 이지롱  ${req.myMsg}`)
})

app.get('/asdf',(req, res)=>{  //next() 에 의해 호출
    console.log(`get('/asdf') 실행 -----2`)
    res.send(`asdf 이지롱 2  ${req.myMsg} <br/>`)  //최종 처리에서 send 처리한다
})

//에러를 발생하는 페이지
app.get('/qwer',(req, res)=>{  
    console.log(`get('/qwer') 실행 -----`)
    const err = new Error('테스트용 에러 발생')
    throw err   //에러 발생
    res.send(`qwer 이지롱  ${req.myMsg} <br/>`)  //실행하지 못함
})

// 에러처리
app.use((err, req,res, next)=>{  // err 에러를 받아와 처리
    console.log('use 실행 3')
    res.status(500).send(`500 : 에러처리 =>  ${err.message}`) //500 상태코드와 메시지 전송

})

// 404 에러처리
app.use((req,res, next)=>{
    console.log('use 실행 4')
    res.status(404).send(`404 : 요청한 페이지를 찾을 수 없어요`) //404 상태코드와 메시지 전송

})

app.listen(80,()=>{
    console.log("use 서버 시작")
})