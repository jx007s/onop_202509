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


tt = './sub55.mjs'
import {cc,dd} from tt
console.log(cc,dd) 

console.log('dynamic2 끝---')

