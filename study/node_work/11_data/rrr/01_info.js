const express = require('express')
const path = require('path')

//Router 객체 생성
const router = express.Router()

//url 맵핑
router.get('/',(req,res)=>{
    res.sendFile(path.join(__dirname,'../views/routeMain.html'))
})

router.get('/hello',(req,res)=>{
    res.send(`안녕 곧 점심이야`)
})


//router 외부 모듈로 설정
module.exports = router