const EventEmitter = require('events')

//console.log(EventEmitter)
//이벤트 객체 생성
const myE = new EventEmitter()
//console.log(myE)

//이벤트 생성
myE.on('ev1', ()=>{
    console.log('ev1 실행 1')
})
// 같은이름으로 이벤트 생성시 호출할때 둘다 실행
myE.on('ev1', ()=>{
    console.log('ev1 실행 2')
})
// on == addListener
myE.addListener('ev1', ()=>{
    console.log('ev1 실행 3')
})


// once - 최초 호출시에만 실행
myE.once('ev1', ()=>{
    console.log('ev1 실행 once')
})


myE.on('ev2', ()=>{
    console.log('ev2 실행 1')
})

// once - 최초 호출시에만 실행
myE.once('ev2', ()=>{
    console.log('ev2 실행 once')
})

myE.emit('ev1') //이벤트 호출
console.log('--------------')
myE.emit('ev1') //이벤트 호출 --once 실행 안함
console.log('--------------')
myE.emit('ev1') //이벤트 호출 --once 실행 안함
console.log('--------------')
myE.emit('ev2') //이벤트 호출
console.log('--------------')
myE.emit('ev2') //이벤트 호출 --once 실행 안함

//3 : ev1 호출에 실행되는 이벤트 갯수 - once 제외
console.log(`listenerCount('ev1'):`,myE.listenerCount('ev1')) 

//1 : ev2 호출에 실행되는 이벤트 갯수 - once 제외
console.log(`listenerCount('ev2'):`,myE.listenerCount('ev2')) 

console.log('_eventsCount:',myE._eventsCount)  //2 : 이벤트 갯수