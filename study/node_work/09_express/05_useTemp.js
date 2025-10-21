const express = require('express')
const fs = require('fs')
const path = require('path')
const app = express()

//전체 template 구성
app.use((req,res,next)=>{
    const fPath = path.join(__dirname,'views/template.html')
    req.ttt = fs.readFileSync(fPath, 'utf8')
    next()
})

let titleArr = {
    hello:'인사말',history:'연혁',location:'오시는길'
}

//header 구성
app.use((req,res,next)=>{
    //console.log(path.basename(req.path))
    req.ttt = req.ttt.replaceAll('{{title}}',titleArr[path.basename(req.path)])
    next()
})

//aside 구성
app.use((req,res,next)=>{
    let aside = ''
    for (const kk in titleArr) {
        aside += `<a href='/info/${kk}'>${titleArr[kk]}</a><br/>`    
    }
    
    req.ttt = req.ttt.replaceAll('{{aside}}',aside)
    next()
})

//footer 구성
app.use((req,res,next)=>{
    //파일을 읽어와 변경
    const fPath = path.join(__dirname,'views/myFooter.html')
    req.ttt = req.ttt.replaceAll('{{footer}}',fs.readFileSync(fPath, 'utf8'))
    next()
})


app.get('/',(req,res)=>{
    
    res.redirect('/info/hello')     //  리다이렉트 '/info/hello' 로 URL 이동
})

app.get('/info/hello',(req,res)=>{
    req.ttt = req.ttt.replaceAll('{{main}}','인사말 입니다')
    res.send(req.ttt)
})

app.get('/info/history',(req,res)=>{
    req.ttt = req.ttt.replaceAll('{{main}}','연혁 입니다')
    res.send(req.ttt)
})

app.get('/info/location',(req,res)=>{
    req.ttt = req.ttt.replaceAll('{{main}}','오시는길 입니다')
    res.send(req.ttt)
})

app.listen(80,()=>{
    console.log("useTemp 서버 시작")
})