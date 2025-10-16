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

/*

   04_login2.js

    id,    pw, 이름
    aaa, 1111,  장동건
    bbb, 2222,  장서건
    ccc, 3333,  장남건
    
    로그인 성공시
    장동건님 안녕하세요 메세지 출력
*/