const express = require('express')
const app = express()
const path = require('path')

// 'fff'  디렉토리를 정적구조로 제공
//  'fff' 이하 디렉토리 접근시 정적으로 가능
//  '/fff' 로 시작하는 주소일경우 , 상대주소 'fff' 에 접근하여 정적처리
app.use('/fff',express.static('fff'))
//  '/public' 로 시작하는 주소일경우 , 상대주소 'assets' 에 접근하여 정적처리
// 같은 경로로 중첩된 경우
//public/small03.jpg - 중첩인 경우 선행된 static  설정 파일이 적용 (assets의 파일이 호출)
app.use('/public',express.static('assets'))
app.use('/public',express.static('ggg'))

// 현재 root 위치의 정적 페이지 경로
// url '/poiu.html' 접근시   ===>  현재경로/mmm/poiu.html  로 정적처리
app.use(express.static('mmm'))
/*

/qwer  : 라우팅 - 정상
/fff/aaa.html  : static  - 정상
/bbb.html : 에러발생

*/
app.get('/',(req,res)=>{
    res.send(`<h1>static 서버</h1>
        <a href='/ddd/eee/rrr/qwer'>/ddd/eee/rrr/qwer</a>
        <a href='/fff/aaa.html'>fff/aaa.html</a>
        <a href='/bbb.html'>bbb.html</a>
        <a href='/poiu.html'>poiu.html</a>
        `)
})
app.get('/ddd/eee/rrr/qwer',(req,res)=>{
    res.sendFile(path.join(__dirname,'views/qwer.html'))
})
app.listen(80,()=>{
    console.log("static 서버 시작")
})