const {isMainThread, Worker} = require('worker_threads')
console.log(`main->isMainThread : ${isMainThread}`)

//워커생성
const wk1 = new Worker('./12_worker.js',{
    workerData:{pname:'장동건',age:53}   //workerData : 워커 생성시 초기화 정보: 최초1회만 가능
})

const wk2 = new Worker('./12_worker.js',{
    workerData:{pname:'정우성',age:48}   //workerData : 워커 생성시 초기화 정보
})

const wk3 = new Worker('./12_worker.js',{
    workerData:{pname:'원빈',age:45}   //workerData : 워커 생성시 초기화 정보
})


//main -> wk1으로 메세지 전송
wk1.postMessage('wk1 잘지내지?')  

//메세지 수신시 실행 - 이벤트: 각 worker마다 수신
wk1.on('message',(msg)=>{
    console.log(`main 수신(wk1) : `, msg)
})
//메세지 수신시 실행 - 이벤트
wk2.on('message',(msg)=>{
    console.log(`main 수신(wk2) : `, msg)
})
wk3.on('message',(msg)=>{
    console.log(`main 수신(wk3) : `, msg)
})

//에러발생시 수신
wk1.on('error',(e)=>{
    console.log(`main 에러확인(wk1) : `, e.message)
})
wk2.on('error',(e)=>{
    console.log(`main 에러확인(wk2) : `, e.message)
})
wk3.on('error',(e)=>{
    console.log(`main 에러확인(wk3) : `, e.message)
})

//worker 종료시 수신 
wk1.on('exit',(e)=>{ // e : 정상종료(0), 비정상혹은에러종료(1)
    console.log(`main 종료확인(wk1) : `, e)
})

wk2.on('exit',(e)=>{
    console.log(`main 종료확인(wk2) : `, e)
})
wk3.on('exit',(e)=>{
    console.log(`main 종료확인(wk3) : `, e)
})

setTimeout(() => {
    wk3.terminate() //main 에서 worker 종료(비정상 종료)
}, 2000);