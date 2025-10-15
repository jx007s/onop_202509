const fs = require('fs')

//텍스트 파일 복사
let rs = fs.createReadStream('../fff/octopus.txt',{highWaterMark:16})
let ws = fs.createWriteStream('../qqq/oct.txt')
rs.pipe(ws)


// 이미지 복사
rs = fs.createReadStream('../fff/family16.JPG',{highWaterMark:16})
ws = fs.createWriteStream('../qqq/my.JPG')
rs.pipe(ws)


// aaa.txt + bbb.txt + ccc.txt => qwer.txt
//rs.pipe(ws,{end:false})   end:false : 종료하지 않음 --> 쓰기 종료하지 않음

let rs1 = fs.createReadStream('../fff/aaa.txt')
let rs2 = fs.createReadStream('../fff/bbb.txt')
let rs3 = fs.createReadStream('../fff/ccc.txt')
let wst = fs.createWriteStream('../qqq/qwer.txt')

//이미지 파일 결합시 에러는 발생하지 않으나 최종이미지가 정상으로 보이지 않음--> 첫번째 이미지만 보임
// let rs1 = fs.createReadStream('../fff/family9.JPG') //589,008
// let rs2 = fs.createReadStream('../fff/family11.JPG')//440,613
// let rs3 = fs.createReadStream('../fff/family12.JPG')//337,612
// let wst = fs.createWriteStream('../qqq/imgToT.JPG') //1,367,233



wst.write('aaa.txt---------------------\n')
rs1.pipe(wst, {end:false}) //rs1-> wst 쓰기

//rs1 종료시 rs2 쓰기 시작
rs1.on('end',()=>{
    wst.write('\n bbb.txt---------------------\n')
    rs2.pipe(wst, {end:false}) //rs2-> wst 쓰기
})

//rs2 종료시 rs3 쓰기 시작
rs2.on('end',()=>{
    wst.write('\n ccc.txt---------------------\n')
    rs3.pipe(wst) //rs3-> wst 쓰기  , 마지막 파일이므로 {end:false} 생략 혹은 {end:true}
})

rs3.on('end',()=>{
console.log('모든 파일 합치기 종료')
})

rs1.on('error',(err)=>{
    console.log('rs1 읽기 오류',err)
})
rs2.on('error',(err)=>{
    console.log('rs2 읽기 오류',err)
})
rs3.on('error',(err)=>{
    console.log('rs3 읽기 오류',err)
})
wst.on('error',(err)=>{
    console.log('wst 쓰기 오류',err)
})

const zlib = require('zlib')  //압축모듈
rs = fs.createReadStream('../fff/family16.JPG',{highWaterMark:16})
let zs = zlib.createGzip()  //gz 으로 압축
ws = fs.createWriteStream('../qqq/zxc.gz')
rs.pipe(zs).pipe(ws)  // 읽기 -> 압축 -> 쓰기

//능남,북산,해남 결합하여 qqq/slamdunk.txt 를 생성하세요