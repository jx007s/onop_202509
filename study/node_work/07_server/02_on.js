const http = require('http')
//console.log(http)

// 서버 생성
let server = http.createServer(

    //콜백함수 : 서버에 접근하였을때의 이벤트 처리
    (req, res)=>{
 
        res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
        res.end("여기는 강사서버입니다.")
    }

)

//서버 실행
server.listen(80)

// 정상일때 이벤트
server.on('listening',()=>{
    console.log("서버 실행 이벤트로 확인")
})

// 에러발생시 이벤트 - 주로 서버를 2개 실행시도 할 때 발생
server.on('error',(err)=>{
    console.log("서버 에러발생", err.message)
})