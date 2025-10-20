const http = require('http')
const fs = require('fs')
const path = require('path')
const {URL} = require('url')

let imgArr = "bmp,jpg,gif,png,jpeg".split(",")

http.createServer((req, res)=>{

    let service = ''
    let header = `{'content-type':'text/html; charset=UTF-8'}`

    try {

        //경로를 URL 로 가져옴
        const myUrl = new URL(req.url, `http://${req.headers.host}`)

        //경로만 (파라미터 이하 분리)
        let fPath = myUrl.pathname
        // 파일명만 추출
        let fName = path.basename(fPath)
        //확장자
        const ext = path.extname(fName).toLowerCase().slice(1)
        
        console.log(req.url)
        console.log(fName)
        console.log(ext)

        
        if(fName ==''){
           
           service = fs.readFileSync(`./views/06_server.html`).toString()
        }else if(fName =='aaa'){
           
           service = fs.readFileSync(`./views/06_aaa.html`).toString()

        }else if(fName =='bbb'){
            let param = myUrl.searchParams
            let no1 = eval(param.get('no1'))
            let no2 = eval(param.get('no2'))
            service = fs.readFileSync(`./views/06_bbb.html`).toString()
            service = service.replaceAll('{{no1}}', no1)
                            .replaceAll('{{no2}}', no2)
                            .replaceAll('{{tot}}', no1+no2)

        }else if(imgArr.includes(ext)){  //이미지 파일
        
            service = fs.readFileSync(`./fff/${fName}`)
            header = `{'content-type':'image/jpeg'}`
            
        }


        //파일을 읽어와 데이터 전송
        res.writeHead(200,header)
        res.end(service)

     } catch (error) {
        //에러 발생시 화면 처리
        res.writeHead(200,header)
        res.end(error.message)
    }    


}).listen(8080,()=>{
    console.log("8080 서버 실행  , 대기")
})