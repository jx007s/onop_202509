const express = require('express')
const path = require('path')
const fs = require('fs')
const app = express()
const session = require('express-session')

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


app.use(express.urlencoded({extended:true}))

app.use((req,res,next)=>{
    let fPath = path.join(__dirname,'views/alert.html')
    req.alert = fs.readFileSync(fPath,'utf8').toString()
    next()
})

app.get('/',(req, res)=>{
    
    if(req.session.pname){
        res.send(`${req.session.pname}님 안녕하세요 <a href='logout'>로그아웃</a>`)
    }else{
        res.sendFile(path.join(__dirname,'views/logMain.html'))
    }
    
})


//로그인 처리
app.post('/',(req, res)=>{
    
    const {pid, pw} = req.body
    //console.log(pid, pw)
    let msg = '로그인 실패'
    if(pid=='aaa' && pw == '1111'){
        req.session.pname='장동건'
        msg = '로그인 성공'
    }

    let ttt = req.alert.replaceAll('{{title}}','로그인처리')
                        .replaceAll('{{msg}}',msg)

    res.send(ttt)
})


//로그아웃 처리
app.get('/logout',(req, res)=>{

    let msg = `${req.session.pname}님 로그아웃되었습니다`

     req.session.destroy((err)=>{
        if(err){
            console.log('전체 삭제시 에러발생')
        }
    })

    let ttt = req.alert.replaceAll('{{title}}','로그아웃')
                        .replaceAll('{{msg}}',msg)

    res.send(ttt)
})

app.listen(80,()=>{
    console.log('login 서버 실행')
})

///로그아웃을 구현해 주세요
