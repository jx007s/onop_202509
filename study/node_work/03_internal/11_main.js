const {isMainThread, Worker} = require('worker_threads')
console.log(`main->isMainThread : ${isMainThread}`)

//워커생성
const wk1 = new Worker('./12_worker.js',{
    workerData:{pname:'장동건',age:53}   //workerData : 워커 생성시 초기화 정보: 최초1회만 가능
})

const wk2 = new Worker('./12_worker.js',{
    workerData:{pname:'정우성',age:48}   //workerData : 워커 생성시 초기화 정보
})

wk1.postMessage('wk1 잘지내지?')  //main -> wk1으로 메세지 전송