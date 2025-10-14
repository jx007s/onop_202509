const fs = require('fs')

//덮어쓰기
fs.writeFile('../fff/ccc.txt','나는무너',(err)=>{
    if(err){
        console.log('writeFile 에러발생')
    }else{
        console.log('writeFile 성공')
    }
    
})

//내용추가
fs.appendFile('../fff/ddd.txt','나는고래',(err)=>{
    if(err){
        console.log('appendFile 에러발생')
    }else{
        console.log('appendFile 성공')
    }
    
})

fs.promises.writeFile('../fff/eee.txt','나는상어')
fs.promises.appendFile('../fff/fff.txt','나는거북이')

fs.writeFileSync('../fff/ggg.txt','나는소년시대')
fs.appendFileSync('../fff/hhh.txt','나는청년시대')

/*
fff/exam.txt
정우성,77,78,79
정좌성,97,98,99
정남성,67,68,69
정중성,87,88,89

파일내용을 가져와
fff/examRes.txt 를 생성하세요
이름,국어,영어,수학,총점,평균
정우성,77,78,79,?,?
정좌성,97,98,99,?,?
정남성,67,68,69,?,?
정중성,87,88,89,?,?

*/