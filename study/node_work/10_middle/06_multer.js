const express = require('express')
const path = require('path')
const app = express()
const multer = require('multer')

//post처리
app.use(express.urlencoded({extended:true}))

app.get('/',(req, res)=>{
    res.sendFile(path.join(__dirname,'views/mulForm.html'))
})

/*
enctype="multipart/form-data" 로 전송시 처리 못함 : 에러발생
app.post('/single',(req, res)=>{
    console.log("/single---------------")
    console.log(`pname : ${req.body.pname}`)  처리못함
    console.log(`ff : ${req.body.ff}`)
    res.send('single 파일 처리')
})*/



// enctype="multipart/form-data" 로 전송시 파일 처리 객체 생성
const qwer = multer({

    //저장
    storage : multer.diskStorage({
        //req : 요청정보
        //file : 업로드된 파일
        // cb : 콜백함수 - 실행
        // dst/업로드파일명
        destination : (req,file, cb)=>{   //저장폴더
            cb(null, 'dst/')  //cb(err 혹은 null, 저장폴더)
        },
        filename:(req,file, cb)=>{          //저장될때 파일명
            // 파일명이 같을 경우 덮어쓰기로 저장됨
            //cb(null, file.originalname)     //cb(err 혹은 null, 파일명)
            //file.originalname  업로드된 파일의 이름

            const ext = path.extname(file.originalname) //확장자명
            //Date.now() : timestamp
            cb(null, path.basename(file.originalname,ext)+Date.now()+ext)
        }
    }),

    //파일크기 - 단일파일 : array인 경우 각 파일크기 제한 임 (전체크기 합산이 아님)
    limits :{ fileSize : 5 * 1024 * 1024},  // byte

    //파일필터링
    fileFilter: (req,file, cb)=>{ 
        const allowedTypes = ['image/jpeg','image/png']

        // file.mimetype : 업로드파일 형식
        if(allowedTypes.includes(file.mimetype)){
            //파일허용
            cb(null, true)

        }else{
            //파일거부
            cb(new Error('파일형식거부'), false)
        }
    }
})




//enctype="multipart/form-data" 처리
//qwer.single('ff')  필드:ff 가 file 
app.post('/single',qwer.single('ff'),(req, res)=>{
    console.log("/single---------------")
    console.log(`pname : ${req.body.pname}`)    //일반필드 : req.body.필드
    //console.log(`ff : ${req.body.ff}`)        //파일필드 접근불가
    console.log(`ff : `,req.file)             //파일필드
    res.send('single 파일 처리')
})


//enctype="multipart/form-data" 처리
//qwer.none('ff')  파일 업로드시 에러발생, 파일이 없을 경우에는 정상실행
app.post('/none',qwer.none('ff'),(req, res)=>{
    console.log("/none---------------")
    console.log(`pname : ${req.body.pname}`)    //일반필드 : req.body.필드
    //console.log(`ff : ${req.body.ff}`)        //파일필드 접근불가
    console.log(`ff : `,req.file)             //파일필드
/* req.file 의 요소
 {
    fieldname: 'ff',
    originalname: 'NJVF0286.JPG',
    encoding: '7bit',
    mimetype: 'image/jpeg',
    destination: 'dst/',
    filename: 'NJVF02861761112443520.JPG',
    path: 'dst\\NJVF02861761112443520.JPG',
    size: 4590853
  }
*/

    res.send('none 파일 처리')
})


//qwer.array('ff') multiple 에 의한 여러파일 업로드
app.post('/array',qwer.array('ff'),(req, res)=>{
    console.log("/array---------------")
    console.log(`pname : ${req.body.pname}`)    //일반필드 : req.body.필드
    
    //console.log(`ff : `,req.file)             //파일필드 - 단일파일
    console.log(`ff : `,req.files)             //파일필드 - 파일여러개
    res.send('array 파일 처리')
})

//qwer.array('ff',3) 파일갯수제한 : 3개까지 가능 3개초과시 에러발생
app.post('/array3',qwer.array('ff',3),(req, res)=>{
    console.log("/array3---------------")
    console.log(`pname : ${req.body.pname}`)    //일반필드 : req.body.필드
    
    //console.log(`ff : `,req.file)             //파일필드 - 단일파일
    console.log(`ff : `,req.files)             //파일필드 - 파일여러개
    res.send('array갯수제한 3 파일 처리')
})


//qwer.fields 에서 사용할 배열 - 파일업로드 필드 지정
// maxCount : 파일갯수 제한
const arr = [
    {name:'ff1', maxCount:1},
    {name:'ff2'},
    {name:'ff3', maxCount:3},
    {name:'ff4'}
]


//qwer.fields(배열) 여러 필드에 대한 업로드
app.post('/fields',qwer.fields(arr),(req, res)=>{
    console.log("/fields---------------")
    console.log(`pname : ${req.body.pname}`)    //일반필드 : req.body.필드
    
    console.log(`ff : `,req.files)             //파일필드 - 파일여러개
    res.send('fields 파일 처리')
})


app.get('/download',(req, res)=>{
    //파일 다운로드 : res.download(파일경로) 
    res.download(path.join(__dirname,'fff/qqq/octopus.txt'))
})


//multer 에서 발생한 예외처리 - 가장하단에서 처리
app.use((err,req,res,next)=>{
    console.log('예외처리')
    res.status(500).send(`500 : 에러처리 =>  ${err.message}`) //500 상태코드와 메시지 전송
})

app.listen(80,()=>{
    console.log('multer 서버 실행')
})