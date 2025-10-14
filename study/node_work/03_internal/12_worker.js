const {parentPort,isMainThread, workerData} = require('worker_threads')
console.log(`worker->isMainThread : ${isMainThread}`)
console.log(`worker->workerData : `, workerData)    //main에서 보낸 초기화 정보

//메세지 수신시 실행 - 이벤트
parentPort.on('message',(msg)=>{
    console.log(`${workerData.pname} 수신 : `, msg)
})

// worker-> main 메세지 전송
parentPort.postMessage(`${workerData.pname} 가 보냄 _ 앤더슨은 왜 그랬대?`)

if(workerData.age>=50){
    throw new Error(`${workerData.pname} 에러발생`)  // 에러발생과 함께 쓰레드 종료(장동건 종료)
}

if(workerData.pname=='정우성'){
    console.log(`${workerData.pname} 정상종료시도 `)
    parentPort.close()  // 스레드 종료 (정우성 종료)
}
