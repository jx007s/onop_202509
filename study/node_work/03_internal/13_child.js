const cp = require('child_process')

//console.log(cp)
/*
let rr = cp.exec('dir') //외부실행할 객체 생성

//console.log(rr)

한글깨짐
rr.stdout.on('data',(data)=>{
    console.log(data)
})*/

console.log('인코딩---------------------------------------------------')

rr = cp.spawn('cmd.exe',['/c','chcp 65001 & dir'])  // chcp 65001 : 터미널 인코딩을 UTF-8로 변경
//rr = cp.spawn('powershell.exe',['/c','dir'])  // Powershell 이용시 UTF8로 설정

rr.stdout.setEncoding('utf8')   //한글처리

rr.stdout.on('data',(data)=>{
    console.log('정상:',data)
})

rr.stderr.on('data',(data)=>{
    console.log('에러',data)
})
/*
exec : 명령어 문자열 실행, 결과를 버퍼로 처리
execFile : 실행파일 실행
spawn : 명령어 문자열 실행, 스트림기반으로 처리
fork : IPC(메세지)통신
*/