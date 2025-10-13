const os = require('os')
//console.log(os)
console.log(`arch() : ${os.arch()}`)            // x64
console.log(`platform() : ${os.platform()}`)    // win32
console.log(`type() : ${os.type()}`)            //  Windows_NT
console.log(`uptime() : ${os.uptime()}`)        // 운영체제 부팅 후 시간
console.log(`hostname() : ${os.hostname()}`)    //컴퓨터 이름
console.log(`release() : ${os.release()}`)      //운영체제 버전
console.log(`homedir() : ${os.homedir()}`)      //홈 디렉토리(사용자계정홈)
console.log(`tmpdir() : ${os.tmpdir()}`)        //임시파일저장경로
console.log(`cpus() : `,os.cpus())              //cpu 코어정보
console.log(`freemem() : `,os.freemem())        //사용가능 메모리
console.log(`totalmem() : `,os.totalmem())      //전체 메모리