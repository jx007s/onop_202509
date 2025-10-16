const http = require('http')
//console.log(http)

// 서버 생성
let server = http.createServer(

    //콜백함수 : 서버에 접근하였을때의 이벤트 처리
    (req, res)=>{
        //req : 요청객체
        //res : 응답객체

        // 접속하는 클라이언트에게 전달
        // 정상처리 : 200
        res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
        res.end("여기는 강사서버입니다.")
    }

)
//console.log(server)


//서버 실행
server.listen(80,()=>{
    console.log("서버 실행  , 대기")
})
