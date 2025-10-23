const express = require('express')
const path = require('path')

//Router 객체 생성
const router = express.Router()

//post처리
router.use(express.urlencoded({extended:true}))


const myMM = (aaa, bbb)=>{

    // 현재 파일을 require 하여 사용할 경우
    // myMM = (aaa, bbb)   aaa, bbb 의 매개변수로 외부에서 변수 대입
    // 파일업로드 multer 를 bbb 로 대입받음


    //url 맵핑
    router.get('/',(req,res)=>{
        // 외부에서 대입받은 변수 aaa, bbb 사용
        res.send(`갤러리야 ${aaa}, ${bbb}, ${req.query.pid}`)
    })

    router.post('/spring',(req,res)=>{
        res.send(`봄이야 ${aaa}, ${bbb}, ${req.body.pid}`)
    })

    router.get('/summer/:pid',(req,res)=>{
        res.send(`여름이야 ${aaa}, ${bbb}, ${req.params.pid}`)
    })

    router.post('/fall',bbb.single('ff'),(req,res)=>{
        console.log(`ff : `,req.file)             //파일업로드 처리가 가능
        res.send(`가을이야 ${aaa}, ${req.body.pid}`)
    })

    // 생성된 router 리턴
    return router

}

//router 외부 모듈로 설정
module.exports = myMM