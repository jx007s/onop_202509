const readline = require('readline')

function myInput(ttt){

    //콘솔창에서 입출력 처리
    const rr = readline.createInterface(
        {input:process.stdin, output:process.stdout}
    )

    return new Promise((resolve)=>{
        rr.question(ttt, (answer)=>{
            rr.close()
            resolve(answer)
        })
    })
}

(async () => {
    while(true){

        try {
            let pid = await myInput("아이디:")
            
            let pw = await myInput("암호:")
            
            if(pid!='aaa' || pw!='1234'){
                throw new Error('잘못된 로그인 정보')
            }

            break
        } catch (error) {
            console.log(error.message)
        }
       
    }
    console.log('로그인성공')
    
})()