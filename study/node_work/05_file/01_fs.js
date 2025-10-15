const fs = require('fs').promises
const constants = require('fs').constants

//폴더 , 파일 존재 유무
fs.access('../fff/dd1', constants.F_OK).then(()=>{
    console.log('dd1 존재')
}).catch((err)=>{
    console.log('dd1 없음')
})

fs.access('../fff/dd3', constants.F_OK).then(()=>{
    console.log('dd3 존재')
}).catch((err)=>{
    console.log('dd3 없음')
})

fs.access('../fff/dd1/ee1', constants.F_OK).then(()=>{
    console.log('dd1/ee1 존재')
}).catch((err)=>{
    console.log('dd1/ee1 없음')
})
fs.access('../fff/dd2/ee1', constants.F_OK).then(()=>{
    console.log('dd2/ee1 존재')
}).catch((err)=>{
    console.log('dd2/ee1 없음')
})

//폴더 생성
fs.mkdir('../fff/dd4').then(()=>{
    console.log('dd4 폴더 생성 성공')
}).catch((err)=>{
    console.log('dd4 폴더 생성 에러') 
})

fs.mkdir('../fff/dd2').then(()=>{
    console.log('dd2 폴더 생성 성공')
}).catch((err)=>{
    console.log('dd2 폴더 생성 에러') //이미 존재하는 경우 생성할 수 없기 때문에 에러
})


fs.mkdir('../fff/dd5/ee5').then(()=>{
    console.log('dd5/ee5 폴더 생성 성공')
}).catch((err)=>{
    console.log('dd5/ee5 폴더 생성 에러') //dd5 가 존재하지 않아 dd5 안에 ee5를 생성 불가
})

// recursive:true 를 이용 dd6 생성 이후 ee6 생성
fs.mkdir('../fff/dd6/ee6',{recursive:true}).then(()=>{
    console.log('dd6/ee6 폴더 생성 성공')
}).catch((err)=>{
    console.log('dd6/ee6 폴더 생성 에러') 
})

//폴더, 파일 이동
fs.rename('../fff/dd6', '../qqq/aa6').then(()=>{
    console.log('dd6 -> aa6 이름 바꾸기(이동) 성공') //폴더 안의 내용도 같이 이동
}).catch((err)=>{
    console.log('dd6 -> aa6 이름 바꾸기(이동) 에러') 
})

//파일삭제
fs.unlink('../fff/examRes.csv').then(()=>{
    console.log('examRes.csv 삭제 성공')
}).catch((err)=>{
    console.log('examRes.csv 삭제 에러')
})

fs.unlink('../fff/없는파일.csv').then(()=>{
    console.log('없는파일.csv 삭제 성공')
}).catch((err)=>{
    console.log('없는파일.csv 삭제 에러')  // 존재하지 않는 파일 삭제 에러
})

// 폴더삭제
fs.rmdir('../fff/dd7').then(()=>{
    console.log('dd7 폴더 삭제 성공')
}).catch((err)=>{
    console.log('dd7 폴더 삭제 에러')
})

// 폴더삭제
fs.rmdir('../fff/dd8').then(()=>{
    console.log('dd8 폴더 삭제 성공')
}).catch((err)=>{
    console.log('dd8 폴더 삭제 에러')  // 없는 폴더 삭제 실패
})

fs.rmdir('../fff/dd1/ee2').then(()=>{
    console.log('dd1/ee2 폴더 삭제 성공')
}).catch((err)=>{
    console.log('dd1/ee2 폴더 삭제 에러')  // 하위내용이 있는 경우 삭제 살패
})

//// recursive: true 하위폴더 및 파일 있어도 모두 삭제
fs.rmdir('../fff/dd1/ee4',{recursive: true}).then(()=>{
    console.log('dd1/ee4 폴더 삭제 성공')
}).catch((err)=>{
    console.log('dd1/ee4 폴더 삭제 에러')  
})

fs.rmdir('../fff/dd1/ee3',{recursive: true}).then(()=>{
    console.log('dd1/ee3 폴더 삭제 성공')
}).catch((err)=>{
    console.log('dd1/ee3 폴더 삭제 에러')  
})

//폴더, 파일 복사
fs.cp('../fff/dd1', '../qqq/aa1',{recursive: true}).then(()=>{
    console.log('dd1 -> aa1 복사 성공') //폴더 안의 내용도 같이 이동
}).catch((err)=>{
    console.log('dd1 -> aa1 복사 에러')
})