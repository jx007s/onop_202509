const express = require('express')
const nunjucks = require('nunjucks')
const app = express()

nunjucks.configure('views', // views 폴더 이하 위치
    {
        autoescape: true,   // HTML 이스케이프 자동처리
        express: app        // express 요소 중 변수 app 에 설정
})

app.get('/',(req,res)=>{
    res.render("home.html") // 정적인경우 html 가능
                            // 동적 처리를 위해서는 njk  필요
})

app.get('/01_basic',(req,res)=>{
    res.render("01_basic.njk") // 정적인경우 html 가능
                                // 동적 처리를 위해서는 njk  필요
})

let ddd = {
    pname : '차은우',
    arr : [11,22,33],
    age : 27,
    mem : {pid:'aaa', tel:'1111'}
}

app.get('/02_data',(req,res)=>{
    res.render("02_data.njk", ddd) //  data 를 같이 전송 - 변수로 사용됨
})

app.listen(80,()=>{
    console.log("nunjucks 서버 시작")
})