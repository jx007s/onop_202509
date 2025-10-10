var {v1, v2} = require('./ddd')
var {aa, bb} = require('./sub3')

if(v1){  // 변수로 import 실행유무 설정 -- 동적 처리
    var {aa, bb} = require('./sub4')
}

console.log(aa,bb)


var tt = `./sub${v2}`
var {cc,dd} = require(tt) //변수로 import 파일 설정 가능 -- 동적 처리
console.log(cc,dd)

