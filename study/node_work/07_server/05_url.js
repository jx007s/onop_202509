const http = require('http')
const fs = require('fs')
const path = require('path')
const {URL} = require('url')

http.createServer((req, res)=>{

    try {

        let service = '/index'

        if(req.url !='/favicon.ico'){
            //console.log('req', req)
            console.log('method : ',req.method)
            console.log('url : ',req.url)
            //console.log('headers : ',req.headers)
            console.log('httpVersion : ',req.httpVersion)
            //console.log('socket : ',req.socket)
            console.log('statusCode : ',req.statusCode)

            // 기본서버인 경우 :  `http://${req.headers.host}`가 필요 (기본서버는 상대 URL만 제공하기 때문)
            const myUrl = new URL(req.url, `http://${req.headers.host}`)
            //console.log(myUrl)
            console.log('href : ',myUrl.href)
            console.log('origin : ',myUrl.origin)
            console.log('protocol : ',myUrl.protocol)
            //console.log('username : ',myUrl.username)
            //console.log('password : ',myUrl.password)
            console.log('host : ',myUrl.host)
            console.log('pathname : ',myUrl.pathname)
            console.log('dirname : ',path.dirname(myUrl.pathname) )
            console.log('basename : ',path.basename(myUrl.pathname) )
            console.log('searchParams : ',myUrl.searchParams)
            console.log('hash : ',myUrl.hash)

            if(myUrl.pathname.trim()!='/'){
                service = myUrl.pathname.trim()
            }
        }

        console.log('service ', service)

        if(service.startsWith('/fff')){  //이미지폴더

            const data = fs.readFileSync(`.${service}`)
            res.writeHead(200,{'content-type':'image/jpeg'})
            res.end(data)
        }
        else if(service.endsWith('.css')){  //css 파일

            const data = fs.readFileSync(`.${service}`)
            res.writeHead(200,{'content-type':'text/css'})
            res.end(data)

        }else if(service=='/now'){  // url : now

            function dateToStr(ddd){
                let res = `${ddd.getFullYear()}-${ddd.getMonth()+1}-${ddd.getDate()}`
                res+=` (${'일월화수목금토'[ddd.getDay()]}) ${ddd.getHours()}:${ddd.getMinutes()}`
                return res
            }

            let data = fs.readFileSync(`./views/now.html`).toString()
            
            // 파일로 받은 문자열을 변수로 치환
            //const data = dateToStr(new Date())
            data = data.replaceAll("{{msg}}", dateToStr(new Date()) )
            
            res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
            res.end(data)

        }else{
            //파일을 읽어와 데이터 전송
            const data = fs.readFileSync(`./views${service}.html`)
            res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
            res.end(data)
        }
        
        

    } catch (error) {
        //에러 발생시 화면 처리
        res.writeHead(200,{'content-type':'text/html; charset=UTF-8'})
        res.end('죄송합니다. 빠른시일내에 복구하겠습니다.')
    }    
    

}).listen(80,()=>{
    console.log("80 서버 실행  , 대기")
})

/*

    06_server.js 를 이용하여
    port : 8080 으로 서버를 실행하세요

    메인페이지
    url : aaa , bbb  두개로 진입
    aaa : 3 개의 이미지 보이게 할 것
    bbb : param에서 2개의 수를 받아 연산하여 html 페이지에 출력

*/