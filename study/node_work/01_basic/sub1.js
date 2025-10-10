const sub2 = require('./sub2')
console.log(`sub1 파일 입니다. ${sub2}`)
// 순환 구조 일 경우 무한반복을 차단하기 위해 참조대상을 빈객체로 처리

function fn1(){
    console.log(`fn1 입니다. ${sub2}`)
}
module.exports = fn1