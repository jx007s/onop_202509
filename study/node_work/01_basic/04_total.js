//let ff3 = require('./03_func')  export 가 없어서 에러발생
//ff3.fn_1()

//모듈로 사용하는 것이 아닌 페이지 결합으로 사용됨
require('./03_func')  //작성된 실행구문이 동작함
/*
fn_1() 시작
         fn_2() 시작
                 fn_3() 시작
                 fn_3() 끝
         fn_2() 끝
fn_1() 끝
*/
let ff5 = require('./05_mm')  /*
                                const aaa = '정우성'
                                module.exports = aaa
                                을 받아와 ff5 에 대입
                                ff5 = '정우성'
*/
console.log(ff5)
console.log(require('./06_nn'))
let ff7 = require('./07_oo')
/*
module.exports = 123.456  
module.exports = '아기상어'
module.exports = '엄마상어'  /// 마지막 1개만 내보냄
*/
console.log(ff7)
let ff8 = require('./08_pp')
console.log(ff8)
console.log(ff8.a)
console.log(ff8.b)
console.log(ff8.c)
console.log(ff8.d)
ff8.fn_2()

let ff9 = require('./09_qq')
console.log(ff9)
console.log(ff9.a)
console.log(ff9.b)
console.log(ff9.c)
console.log(ff9.d)
ff9.fn_3()


/* 02_module 폴더 구성 후 
    module1
    회원 목록 - 5명
    aaa, 정우성
    bbb, 정좌성
    ccc, 정남성
    ddd, 정중성
    eee, 정북성

    module2
    현재 회원 지정

    index 
    현재 회원의 정보 출력
    

*/

