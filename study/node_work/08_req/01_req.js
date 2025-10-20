const http = require('http')
http.createServer((req, res)=>{

    
    res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
    res.write("<h1>여기는 강사서버입니다.</h1>")
    res.write(`<div>url : ${req.url}</div>`)
    res.write(`<div>method : ${req.method}</div>`)
    res.write(`<div>headers : ${req.headers}</div>`)
    res.write(`<div>httpVersion : ${req.httpVersion}</div>`)
    res.write(`<div>socket : ${req.socket}</div>`)
    //referer : 현재 요청이 어디서 왔는지 확인
    res.write(`<div>headers['referer'] : ${req.headers['referer']}</div>`)
    res.write(`<div><a href="/">01_req</a></div>`)
    res.end("<div>req종료</div>")
}).listen(80,()=>{
    console.log("req 서버 실행  , 대기")
})