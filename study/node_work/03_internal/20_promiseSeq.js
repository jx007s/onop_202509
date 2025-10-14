// promises 순서대로 작업실행
console.log('시작')
const fs = require('fs')

//promises : 비동기함수 실행 후 리턴을 객체로  받음
// 리턴 객체의 then(),  catch() 로 후속작업함
let rr1 = fs.promises.readFile('../fff/bbb.txt')

let rr2 = rr1.then((data)=>{ 
    console.log(1,data.toString())  
    return fs.promises.readFile('../fff/bbb.txt')
})

rr2.then((data)=>{ 
    console.log(2,data.toString())  
    return fs.promises.readFile('../fff/bbb.txt')
})
.then((data)=>{ 
    console.log(3,data.toString())  
    return fs.promises.readFile('../fff/bbb.txt')
})
.then((data)=>{ 
    console.log(4,data.toString())  
    console.log('끝')
})