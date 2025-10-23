const express = require('express')
const path = require('path')

//Router 객체 생성
const router = express.Router()

//url 맵핑
router.get('/',(req,res)=>{
    res.send('제품 메인이야')
})

router.get('/tv',(req,res)=>{
    res.send(`테레비전에 내가 나왔으면`)
})

//router 외부 모듈로 설정
module.exports = router