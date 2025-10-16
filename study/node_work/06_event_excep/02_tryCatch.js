const fs = require('fs')



let data = fs.readFileSync('../fff/aaa.txt')
console.log('data1 : ',data.toString())

try{
    fs.readFile('../fff/없는파일.txt',(err,data)=>{
        if(err){
            console.log('readFile 에러발생 2')
        }else{
            console.log('data2 : ',data.toString())
        }
    }) 
}catch(e){
    console.log('에러발생2 : ')  // 비동기식의  callback 함수 처리로 실행되지 않는다
}

try{
    fs.promises.readFile('../fff/없는파일.txt')
    .then((data)=>{
        console.log('data3 : ',data.toString())
    })
    .catch((err)=>{
        console.log('readFile 에러발생 3')
    }) 
}catch(e){
    console.log('에러발생3 : ')  // 비동기식의  callback 함수 처리로 실행되지 않는다
}

console.log("메인 1-----------")
try {
    console.log('try 시작')
    data = fs.readFileSync('../fff/없는파일.txt')  //에러발생시 catch 구간으로 진입
                                                    //이하 구문 실행 안함
    console.log('data4 : ',data.toString())    
    console.log('try 끝')
} catch (error) {                   //에러발생시 진입
    console.log('에러발생4 : ')    
}

console.log("메인 2-----------")

try {
    console.log('try 시작')
   
    let myEE = new Error('내가만든에러객체')
    throw myEE                      //에러발생--> catch 진입

    console.log('try 끝')
} catch (error) {                   //에러발생시 진입
    console.log('에러발생5 : ', error.message)  //'내가만든에러객체'  
}

console.log("메인 3-----------") 

try {
    //둘다 에러아님
    console.log(10-'나는무너')       //NaN
    console.log(10/0)               //Infinity
    console.log(ddd)                //에러발생
} catch (error) {
    console.log('에러발생6 : ', error.message)
}
console.log("메인 4-----------") 

//fs.readFileSync('../fff/없는파일.txt')  // 에러시점에서 현재구간(지금은 메인) 탈출
console.log("메인 5-----------")        // 에러발생이후 구문 실행 안함