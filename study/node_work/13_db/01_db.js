const mysql = require('mysql2')

/*
user : onop
pw : 123456
db : onop_db
url : localhost
*/

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

// 쿼리문 실행
conn.query('select * from exam',(err,res)=>{
    if(err){
        console.log('sql 실패 : ', err.message)
    }else{
        console.log('sql 성공 : ', res)
    }
})

//연결종료
conn.end()