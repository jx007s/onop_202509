const fs = require('fs').promises
const constants = require('fs').constants

let fName = 'dd1'
//폴더 , 파일 존재 유무
fs.access(`../fff/${fName}`, constants.F_OK).then(()=>{
    console.log(`${fName} 존재`)
}).catch((err)=>{
    console.log(`${fName} 없음`)
})

fs.access(`../fff/${fName}`, constants.W_OK).then(()=>{
    console.log(`${fName} 쓰기가능`)
}).catch((err)=>{
    console.log(`${fName} 쓰기불가`)
})

fs.access(`../fff/${fName}`, constants.R_OK).then(()=>{
    console.log(`${fName} 읽기가능`)
}).catch((err)=>{
    console.log(`${fName} 읽기불가`)
})

fs.access(`../fff/${fName}`, constants.X_OK).then(()=>{
    console.log(`${fName} 실행 가능`)
}).catch((err)=>{
    console.log(`${fName} 실행 불가`)
})

///////////////////////////////////////


fs.access(`../fff/${fName}`, 
    constants.F_OK | constants.R_OK | constants.W_OK | constants.X_OK)
.then(()=>{
        console.log(`${fName} 모두 가능`)
}).catch((err)=>{
    if(err.code == 'ENOENT'){
        console.log(`>> ${fName} 파일없음`)
    }
    if(err.code == 'EPERM'){
        console.log(`>> ${fName} 쓰기불가`)
    }
    if(err.code == 'EACESS'){
        console.log(`>> ${fName} 실행불가`)
    }
    if(err.code == 'EISDIR'){
        console.log(`>> ${fName} 실행불가`)
    }
    
})