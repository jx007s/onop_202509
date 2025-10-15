const fs = require('fs')

// 스트림쓰기객체 생성
const ws = fs.createWriteStream('../fff/iii.txt')

ws.on('finish',()=>{
    console.log('파일쓰기 종료')
})

ws.write('엄마가 섬그늘에 ')
ws.write('굴따러 가면\n')
ws.write('아가도 섬그늘에 ')
ws.write('굴따러 가고\n')
ws.write('아빠도 섬그늘에 ')
ws.write('굴따러 가고\n')
ws.write('모두다 시장에서 굴장사하고\n')

//스트림 종료
ws.end()

/*
1-> 10000000  짝수들과 짝수들의 합을 기록한 파일을 생성하세요 
fff/billion.txt 로 저장

*/