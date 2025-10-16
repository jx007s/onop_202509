const http = require('http')
const fs = require('fs')

http.createServer((req, res)=>{

    try {
        //파일을 읽어와 데이터 전송
        const data = fs.readFileSync('./home.html')
        res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
        res.end(data)

    } catch (error) {
        //에러 발생시 화면 처리
        res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
        res.end('죄송합니다. 빠른시일내에 복구하겠습니다.')
    }    
    

}).listen(80,()=>{
    console.log("80 서버 실행  , 대기")
})