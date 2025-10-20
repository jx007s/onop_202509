const express = require('express')
const path = require('path')
const app = express()


app.use(express.urlencoded({extended:true}))

let me = null

app.get('/',(req, res)=>{
    
    if(me){
        res.send(`${me}님 안녕하세요`)
    }else{
        res.sendFile(path.join(__dirname,'views/logMain.html'))
    }
    
})

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

app.listen(80,()=>{
    console.log('login 서버 실행')
})

///로그아웃을 구현해 주세요
