const express = require('express')
const path = require('path')
const app = express()

for(const tt of 'human,manage,art'.split(',')){
    app.use(`/${tt}`,require(`./univ/${tt}`))
}


//url 맵핑
app.get('/',(req,res)=>{
    res.sendFile(path.join(__dirname,'./views/routeUniv.html'))
})

app.listen(80,()=>{
    console.log("route 서버 시작")
})

/*

대학교 사이트를 구현하세요

onop 대학교

인문계열 - 국어, 영어, 독어, 복어, 고등어
경영계열 - 경영, 세무, 회계
예술계열 - 음악, 미술, 무용

각 계열 - route 파일처리
*/