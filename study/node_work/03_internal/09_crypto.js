const crypto = require('crypto')

console.log('[단방향]')

// 64         : 64byte 크기로 만든다.  
// (e,b)=>{}  : 콜백함수  e(err) :  에러 발생시 에러객체
//                       b(buf) : 정상작업 객체


//비동기
/*
crypto.randomBytes(64, (e,b)=>{  
    let ttt = b.toString('base64')  //base64 기준
    console.log(`salt : ${ttt}`)    //salt : 암호키

    //salt : ttt 를 이용하여 평서문 -> 암호화
    //crypto.pbkdf2(평서문,salt, 반복횟수, 출력바이트, 암호화기법, 콜백함수)
    let aa = '1234'
    crypto.pbkdf2(aa ,ttt, 10000, 64, 'sha512', (ee, kk)=>{
        console.log(`평문 : ${aa} ,  암호화 : ${kk.toString('base64')}`)
    })
})*/

//동기식
let ttt = crypto.randomBytes(64).toString('base64')  //base64 기준
console.log(`salt : ${ttt}`) 

//salt : ttt 를 이용하여 평서문 -> 암호화
//crypto.pbkdf2Sync(평서문,salt, 반복횟수, 출력바이트, 암호화기법)
let aa = '1234'
let kk = crypto.pbkdf2Sync(aa ,ttt, 10000, 64, 'sha512')
console.log(`평문 : ${aa} ,  암호화 : ${kk.toString('base64')}`)



console.log('[양방향]')
const algorithm = 'aes-256-cbc'                         //알고리즘
const key = 'qwertyuioplkjhgfdsazxcvbnm567890'          //key - 32byte 를 맞춰준다
const iv = '1234567890123456'                           //초기화벡터 - 16byte 를 맞춰준다

//암호화객체 생성                  알고리즘,  key,초기화백터
const cip = crypto.createCipheriv(algorithm, key, iv)
aa = 'onop' //평서문
let rr = cip.update(aa,'utf8','base64')
console.log(`암호문1 : ${rr}`)  //정상출력 못함
rr += cip.final('base64')
console.log(`암호문2 : ${rr}`)  //정상출력

//복호화객체 생성
const deCip = crypto.createDecipheriv(algorithm, key, iv)
let rr2 = deCip.update(rr,'base64','utf8')
console.log(`복호문1 : ${rr2}`)  //정상출력 못함
rr2 += deCip.final('utf8')
console.log(`복호문2 : ${rr2}`)
