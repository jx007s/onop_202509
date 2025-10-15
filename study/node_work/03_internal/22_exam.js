const fs = require('fs').promises
const iconv = require('iconv-lite')
// npm i iconv-lite 필요

function stCalc(st){
    let tot = 0
    for(let j of st.split(',').slice(1)){
        tot += eval(j)
    }
    return st+','+tot+','+parseInt(tot/3)
}

fs.readFile('../fff/exam.txt').then((data)=>{
    let ttt = '이름,국어,영어,수학,총점,평균\r\n'
    for (const dd of data.toString().split('\r\n')) {
        ttt+=stCalc(dd)+"\n"
    }

    //쓰기
    fs.writeFile('../fff/examRes.csv',ttt)

    // 쓰기 인코딩 처리
    //fs.writeFile('../fff/examRes.csv',ttt,{encoding:'utf-8'})
    //에러발생 : euc-kr을 모름
    //fs.writeFile('../fff/examRes.csv',ttt,{encoding:'euc-kr'})

    //euc-kr 적용하려면 iconv-lite 필요
    //const enTTT = iconv.encode(ttt, 'euc-kr')
    //인코딩 한 내용을 쓰기한다
    //fs.writeFile('../fff/examRes.csv',enTTT)
})



