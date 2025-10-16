const http = require('http')
//console.log(http)

// 서버 생성1
let server = http.createServer(

    //콜백함수 : 서버에 접근하였을때의 이벤트 처리
    (req, res)=>{
        res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
        res.end("80 강사서버입니다.")
    }

)
//서버 실행1
server.listen(80,()=>{
    console.log("80 서버 실행  , 대기")
})

//서버 생성2
let server2 = http.createServer(

    //콜백함수 : 서버에 접근하였을때의 이벤트 처리
    (req, res)=>{
        res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
        res.end("8082 강사서버입니다.")
    }
)
//서버 실행2
server2.listen(8082,()=>{
    console.log("8082 서버 실행  , 대기")
})

//서버 생성 및 실행 3
http.createServer(

    //콜백함수 : 서버에 접근하였을때의 이벤트 처리
    (req, res)=>{
        res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
        res.end("8083 강사서버입니다.")
    }
).listen(8083,()=>{
    console.log("8083 서버 실행  , 대기")
})
