// 동기 방식 : 함수 종료후 다음 단계진행
console.log('시작')
const fs = require('fs')

let data = fs.readFileSync('../fff/bbb.txt')
console.log(1,data.toString())
data = fs.readFileSync('../fff/bbb.txt')
console.log(2,data.toString())
data = fs.readFileSync('../fff/bbb.txt')
console.log(3,data.toString())
data = fs.readFileSync('../fff/bbb.txt')
console.log(4,data.toString())

console.log('끝')