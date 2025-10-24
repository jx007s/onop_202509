const mysql = require('mysql2')

//db 연결객체 생성
const conn = mysql.createConnection({
    host:'localhost',
    user : 'onop',
    password:'123456',
    database:'onop_db'
})

//연결시도
conn.connect((err)=>{
    if(err){
        console.log('연결실패 : ', err.message)
    }else{
        console.log('연결성공 : ', conn.threadId)
    }
})


//연결종료
//conn.end()

module.exports = conn