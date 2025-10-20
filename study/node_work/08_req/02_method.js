const http = require('http')

http.createServer((req, res)=>{

    let id = req.url.split('/')[2]
    console.log(req.url)
    console.log(req.method)
    console.log(`id : ${id}`)
    

    let data = '잘못된URL'
    if(req.url=='/board' && req.method=='GET'){
        data = '목록 보기'

    }else if(req.url.startsWith('/board/') && req.method=='GET'){
        data = `상세 보기 - ${id}`

    }else if(req.url=='/board' && req.method=='POST'){
        data = '글쓰기'

    }else if(req.url=='/board' && req.method=='PUT'){
        data = '글수정'
        
    }else if(req.url=='/board' && req.method=='DELETE'){
        data = '글삭제'
    }
    
    res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
    res.write("<h1>여기는 method서버입니다.</h1>")
    res.end(`<div>${data}</div>`)
}).listen(80,()=>{
    console.log("method 서버 실행  , 대기")
})