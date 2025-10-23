const express = require('express')
const path = require('path')
const app = express()

const multer = require('multer')

const upEE = multer({
    storage : multer.diskStorage({
        destination : (req,file, cb)=> cb(null, 'dst/')  ,
        filename:(req,file, cb)=>{
            const ext = path.extname(file.originalname) //확장자명
            cb(null, path.basename(file.originalname,ext)+Date.now()+ext)
        }
    }),
    //파일크기 - 단일파일 : array인 경우 각 파일크기 제한 임 (전체크기 합산이 아님)
    limits :{ fileSize : 5 * 1024 * 1024},  // byte
})

// 01_info 모듈 가져오기
const infoRT = require('./rrr/01_info')
const prodRT = require('./rrr/02_prod')
const gallRT = require('./rrr/03_gall')

// 모듈을 이용한 route
app.use('/', infoRT)
app.use('/prod', prodRT)
app.use('/gall', gallRT(100, upEE))  // 03_gall.js 의  myMM(aaa,bbb) 를 실행하여 router 리턴
                                        // 파일업로드 에 필요한 multer를 매개변수(bbb)로 보냄

app.get('/history',(req,res)=>{
    res.send(`난 연혁이야`)
})

// 그룹화
//  /notice  같은 url 에 해당하는 method 묶기
app.route('/notice')
.get((req,res)=>{
    res.send(`/notice get 이야`)
})
.post((req,res)=>{
    res.send(`/notice post 야`)
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
