const fs = require('fs')

/*
1-> 10000000  짝수들과 짝수들의 합을 기록한 파일을 생성하세요 
fff/billion.txt 로 저장

*/


// 스트림쓰기객체 생성
const ws = fs.createWriteStream('../fff/billion.txt')

ws.on('finish',()=>{
    console.log('파일쓰기 종료')
})
let tot = 0
for (let i = 1; i <= 10000000; i+=2) {
    i += i%2
    tot += i
    ws.write(`${i}\n`)
}
//console.log(tot)
ws.write(`${tot}\n`)

ws.end()