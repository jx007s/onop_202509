var {a,c, fn_2} = require('./08_pp')
console.log(`a : ${a}`)
//console.log(`b : ${b}`)  require 하지 않은 변수 접근 불가
console.log(`c : ${c}`)
fn_2()

var {c,d, fn_3} = require('./09_qq')
console.log(`a : ${a}`)
console.log(`c : ${c}`)  // 중첩된 경우 변수 이름의 규칙에 따라 변수 값 변경 (let, const 인 경우 에러발생)
console.log(`d : ${d}`)
fn_3()