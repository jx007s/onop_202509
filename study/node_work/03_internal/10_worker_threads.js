const wo_th = require('worker_threads')
//console.log(wo_th)
console.log(`wo_th->isMainThread : ${wo_th.isMainThread}`) //메인스레드인지 확인

if(wo_th.isMainThread){  //현재스레드가 메인일때 

    //worker 스레드 생성 -- 현재 파일기준으로 처리
    // 메인스레드로 해야만 무한 루프에 빠지지 않음
    const worker1 = new wo_th.Worker(__filename)
    //console.log(worker1)
    console.log(`worker1->isMainThread : ${worker1.isMainThread}`)

}else{  // 메인이 아닐때
    //parentPort -- 워커<->메인 메세지 통신
    console.log(`wo_th->parentPort : ${wo_th.parentPort}`) 
    
}
