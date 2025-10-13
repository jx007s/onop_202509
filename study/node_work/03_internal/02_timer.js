const t1 = setTimeout(()=>console.log('1.5초후 실행'),1500)
const t2 = setInterval(()=>console.log('1초마다 실행'),1000)
const t3 = setTimeout(()=>console.log('4초후 실행전 취소'),4000)

setTimeout(()=>{
    clearTimeout(t3),
    clearInterval(t2)
},3500)

const t4 = setImmediate(()=>console.log('즉시실행4'))
const t5 = setImmediate(()=>console.log('즉시실행5 취소'))
clearImmediate(t5)