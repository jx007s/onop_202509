let mems = {
    aaa:{pw:"1111",  pname:"장동건"},
    bbb:{pw:"2222",  pname:"장서건"},
    ccc:{pw:"3333",  pname:"장남건"}
}


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

    let me
    while(true){

        try {
            me = null
            let pid = await myInput("아이디:")
            if(pid in mems){
                me = mems[pid]
            }
            let pw = await myInput("암호:")
            
            if(!(me && me.pw==pw)){
                throw new Error('잘못된 로그인 정보')
            }

            break
        } catch (error) {
            console.log(error.message)
        }
       
    }
    console.log(`${me.pname}님 안녕하세요`)
    
})()