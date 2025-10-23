const express = require('express')
const path = require('path')


//Router 객체 생성
const router = express.Router()

for (const e of 'kk,ss,hh'.split(',')) {
    router.get(`/${e}`,(req,res)=>{
        res.sendFile(path.join(__dirname,`../views/univ/${e}.html`))
    })
}

//router 외부 모듈로 설정
module.exports = router