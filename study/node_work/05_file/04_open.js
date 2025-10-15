const fs = require('fs').promises

/*
fs.open('../fff/jjj.txt','w') //  w : 쓰기
.then((fh)=>{

    return fh.write('파일내용 작성')  //파일 쓰기
    .then(()=>{
        fh.close() //파일닫기
    })
})
.then(()=>{
    console.log('파일쓰기 성공')
})
.catch((err)=>{
    console.log('에러',err)
})


fs.open('../fff/jjj.txt','a') //  a : 추가
.then((fh)=>{

    return fh.write('\n 추가된내용 작성')  //파일 쓰기
    .then(()=>{
        fh.close() //파일닫기
    })
})
.then(()=>{
    console.log('파일내용추가 성공')
})
.catch((err)=>{
    console.log('에러',err)
})

*/


fs.open('../fff/jjj.txt','r') //  r : 읽기
.then((fh)=>{

    let buf = Buffer.alloc(1024) //버퍼 생성

    //파일에서 데이터를 읽어와 buf 에 저장
    //           해당버퍼,버퍼의시작위치, 읽을수 있는 최대바이트수, 파일에서 읽기시작할 위치
    return fh.read(buf,     0,               buf.length,      0)
    .then((data)=>{  //cnt : 실제 읽은 바이트 수
        console.log('data.bytesRead : ', data.bytesRead)
        console.log('data.buffer : ', data.buffer)
        console.log('내용 : ', buf.toString('utf-8',0,data.bytesRead))
        fh.close() //파일닫기
    })
})
.then(()=>{
    console.log('파일읽기 성공')
})
.catch((err)=>{
    console.log('에러',err)
})
