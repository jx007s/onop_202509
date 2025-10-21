const express = require('express')
const path = require('path')
const app = express()


app.use(express.urlencoded({extended:true}))

let me = null

app.get('/',(req, res)=>{
    
    if(me){
        res.send(`${me}님 안녕하세요 <a href='logout'>로그아웃</a>`)
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
        msg = '로그인성공'
        me = '장동건'
    }
    res.send(`
        <script>alert('${msg}')
            location.href='/'
        </script>
    `)
})


//로그아웃 처리
app.get('/logout',(req, res)=>{

    let msg = me
    me = null

    res.send(`
        <script>alert('${msg}님 로그아웃되었습니다')
            location.href='/'
        </script>
    `)
})

app.listen(80,()=>{
    console.log('login 서버 실행')
})

///로그아웃을 구현해 주세요
