// 비동기 방식 : 각 함수 시작 이후 종료시점까지 대기하지 않음
console.log('시작')
const fs = require('fs')

fs.readFile('../fff/bbb.txt',(err,data)=>{ console.log(1,data.toString()) })
fs.readFile('../fff/bbb.txt',(err,data)=>{ console.log(2,data.toString()) })
fs.readFile('../fff/bbb.txt',(err,data)=>{ console.log(3,data.toString()) })
fs.readFile('../fff/bbb.txt',(err,data)=>{ console.log(4,data.toString()) })

console.log('끝')