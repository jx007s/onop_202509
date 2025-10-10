const sub1 = require('./sub1')
console.log(`sub2 파일 입니다. ${sub1}`)

function fn2(){
    console.log(`fn2 입니다. ${sub1}`)
}
module.exports = fn2