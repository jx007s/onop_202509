console.log('main 실행 1')
setTimeout(()=>console.log('Timeout 실행'),0)
setImmediate(()=>console.log('Immediate 실행'))
process.nextTick(()=>console.log('nextTick 실행 1 '))
Promise.resolve().then(()=>console.log('Promise 실행 2'))
Promise.resolve().then(()=>console.log('Promise 실행 3'))
process.nextTick(()=>console.log('nextTick 실행 4'))

console.log('main 실행 2')