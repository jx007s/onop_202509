const express = require('express')
const path = require('path')


//Router 객체 생성
const router = express.Router()

//url 맵핑
let arr = {
    music : '음악',
    paint : '미술',
    dance : '무용'
}
for (const kk in arr) {
   router.get(`/${kk}`,(req,res)=>{
    res.send(`예술계열 ${arr[kk]} 입니다`)
})
    
}

//router 외부 모듈로 설정
module.exports = router