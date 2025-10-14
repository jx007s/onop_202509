const {parentPort,isMainThread, workerData} = require('worker_threads')
console.log(`worker->isMainThread : ${isMainThread}`)
console.log(`worker->workerData : `, workerData)    //main에서 보낸 초기화 정보

//메세지 수신시 실행 - 이벤트