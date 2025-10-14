const fs = require('fs')

/* callback 방식
fs.readFile('../fff/aaa.txt',(err,data)=>{
        console.log(data.toString())
})*/

//callback 방식 대체 -> promises ~ then~catch
let rr1 = fs.promises.readFile('../fff/ㄷㄹㅈㄷㄹ.txt')

let rr2 = rr1.then((data)=>{     //정상일때
    console.log(data.toString())
})

rr2.catch((err)=>{     //에러일때
    console.log('에러발생 : ',err)
})

let rr3 = fs.promises.readFile('../fff/aaa.txt')

let rr4 = rr3.then((data)=>{     //정상일때
    console.log(data.toString())
})
rr4.catch((err)=>{     //에러일때
    console.log('에러발생 : ',err)
})