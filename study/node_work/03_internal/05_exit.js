console.log('main 실행 1')
for (let i = 0; i <10; i++) {
    if(i==5){
        console.log('종료')
        process.exit()    // 프로세스 종료
    }
    console.log(i)
}
console.log('main 실행 2')  //실행하지 않음