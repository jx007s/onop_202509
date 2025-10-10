console.log('dynamic2 시작---')

if(true){           //동적처리 불가
   //import {aa, bb} from './sub33.mjs' - 에러발생
   //await import {aa, bb} from './sub33.mjs' - 에러발생
    
}

// import {aa, bb} from './sub33.mjs'  - 동기화
//var sub33 = import('./sub33.mjs')   // Promise { <pending> } 발생 - 비동기화 (넌블로킹)
//console.log(sub33.aa, sub33.bb)     // undefined undefined

var sub33 = await import('./sub33.mjs')   // await 를 이용하여 동기화(블로킹)
//console.log(sub33.aa, sub33.bb)     // 폴리 용감하고 빠르죠

if(false){       //동적처리
    var sub33 = await import('./sub44.mjs')   // await 를 이용하여 동기화(블로킹)  
}
 console.log(sub33.aa, sub33.bb)     // 동적처리에 따른 결과 확인


let tt = './sub66.mjs'
// import {cc,dd} from tt     에러발생 await import() 로 처리해야 함
// console.log(cc,dd) 


var sub55 = await import(tt)
console.log(sub55.cc, sub55.dd)

console.log('dynamic2 끝---')



/*
js: 주식
mjs : 후식

module_아침 --> 아침 식사 메뉴
module_점심 --> 점심 식사 메뉴
module_저녁 --> 저녁 식사 메뉴

현재 시간을 이용하여 메뉴 출력
아침 : 00~10
점심 : 10~16
저녁 : 나머지

*/

