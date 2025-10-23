const express = require('express')
const path = require('path')


//Router 객체 생성
const router = express.Router()

//url 맵핑
router.get('/kor',(req,res)=>{
    res.send('인문계열 국어 입니다')
})

router.get('/eng',(req,res)=>{
    res.send('인문계열 영어 입니다')
})

router.get('/ger',(req,res)=>{
    res.send('인문계열 독어 입니다')
})

router.get('/bok',(req,res)=>{
    res.send('인문계열 복어 입니다')
})
router.get('/high',(req,res)=>{
    res.send('인문계열 고등어 입니다')
})


//router 외부 모듈로 설정
module.exports = router