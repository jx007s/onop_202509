const fs = require('fs')

//           스트림으로 파일읽기 (파일경로  ,     highWaterMark: 버퍼크기 - 기본값 64kb)          
const rs = fs.createReadStream('../fff/octopus.txt',{highWaterMark:16})
                                    //1,320 b

//const rs = fs.createReadStream('../fff/없는파일명으로하면에러로진입.txt',{highWaterMark:16})

let cnt = 1
let arr = []

// 'data' : 데이터 전송
rs.on('data', (chunk)=>{   // 1,320 / 16 => 82.5 번 실행
    console.log(cnt++, chunk, chunk.length, chunk.toString())
    arr.push(chunk)  //배열에 추가
})

// 스트림 전송 완료
rs.on('end', ()=>{  
    let buf = Buffer.concat(arr)
    console.log('완료', buf)
    console.log(buf.toString())
})


// 스트림 에러발생시
rs.on('error', (err)=>{  
    
    console.log('에러발생 : ', err)
    
})