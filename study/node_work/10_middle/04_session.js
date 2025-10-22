const express = require('express')
const session = require('express-session')

const app = express()

// session 사용 -> sid 를 cookie로 전송
app.use(session({
    secret:'qwer1234!@#$',  //인증키설정 (필수)-> 세션 무결성, 세션데이터 저장시사용
    resave:false,           // 세션 수정하지 않아도 자동저장 : true
                            // 세션 변경시에만 저장 : false
                            // 생략시 true
    saveUninitialized:false,    //초기화 되지 않은 세션 저장
                                // 생략시 true
    cookie:{
        secure:false,       // https 에서만 가능 :  true
                            // https, http 모두 가능 :  false (기본값)
        //maxAge:1000 * 5     // 5초후 만료
    },
    rolling : true          //요청마다 maxAge 갱신 - 요청이 없으면 5초뒤 session 만료       
}))

app.get('/',(req,res)=>{

    console.log('/ : req.session', req.session)
    console.log('/ : req.sessionID', req.sessionID)
    res.send(`<h1>session 서버</h1>
        
        <a href='/make'>make</a>
        <a href='/view'>view</a>
        <a href='/modify'>modify</a>
        <a href='/delete'>delete</a>
        <a href='/deleteAll'>deleteAll</a>
        <a href='/regenterate'>regenterate</a>
        `)
})

app.get('/make',(req, res)=>{

    req.session.pid = 'aaa'
    req.session.pname = '장동건'
    req.session.jum = [11,22,33]
    req.session.age = 57
    req.session.marriage = true

    res.send('세션 생성')
})

app.get('/view',(req, res)=>{

    res.send(`세션 보기 :  ${req.sessionID} <br/>
        ${req.session.pid},${req.session.pname},
        ${req.session.jum},${req.session.age},
        ${req.session.marriage}
        `)
})

app.get('/modify',(req, res)=>{
    req.session.pid = 'bbb'
    req.session.pname = '차은우'
    req.session.jum = [999,888,777]

    res.send('세션 수정')
})

//일부만 삭제
app.get('/delete',(req, res)=>{
    // seesionID는 변경되지 않음
    delete req.session.pname
    delete req.session.age
    res.send('세션 일부삭제')
})

app.get('/deleteAll',(req, res)=>{

    //sessionID 새로 변경
    req.session.destroy((err)=>{
        if(err){
            console.log('전체 삭제시 에러발생')
        }
    })
    res.send('세션 전체삭제')
})


app.get('/regenterate',(req, res)=>{

    //sessionID 새로 변경
    //전체삭제와 같은 기능
    req.session.regenerate((err)=>{
        if(err){
            console.log('초기화시 에러발생')
        }
    })
    res.send('세션 초기화')
})

app.listen(80,()=>{
    console.log("session 서버 시작")
})


/*
 session  을 이용하여 로그인을 구현하세요

*/