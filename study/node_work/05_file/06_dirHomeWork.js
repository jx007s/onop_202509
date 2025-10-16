const fs = require('fs')
const path = require('path')

let extArr = {
이미지 : "bmp,jpg,gif,png,jpeg".split(","),
음악 : "mp3,wma,wav".split(","),
문서 :"doc,hwp,ppt,xls,pptx,xlsx,docx,txt,pdf".split(",")
}

//console.log(extArr)

let dirArr = {}
for (const kk in extArr) {
     //console.log(extArr[kk])
     for(const vv of extArr[kk]){
        //console.log(vv)
        dirArr[vv] = kk
     }
}
//console.log(dirArr)

let dstPath = '../dst/'

// 복사하는 위치의 파일명 중복시 다른이름으로 변경
function duplicateReNamePolicy(dirPath, fName){
    const ext = path.extname(fName)
    let domain = path.basename(fName, ext )

    //console.log(domain, ext)
    let ret = path.join(dirPath,fName)
    let cnt = 0
    
    
    while(true){
        try{
            fs.accessSync(ret, fs.constants.F_OK)
            console.log(fName,'존재')

            //같은 이름의 파일 존재시 새로운 파일명으로 대체
            cnt++
            fName = domain+"_"+cnt+ext  //파일명 새로 구성
            ret = path.join(dirPath,fName)

        }catch(err){
            console.log(fName,' 없음')
            break
        }
    }
    

    return ret
}

//파일 복사
function ffCopy(fName){
    const ext = path.extname(fName).slice(1) //확장자 분리
    //console.log(fName)
    let middleDir = 'etc'
    if(ext in dirArr){
        middleDir = dirArr[ext]
    }
    let newFName = duplicateReNamePolicy(path.join(dstPath,middleDir), path.basename(fName))

    // fs.cp(fName, newFName , {recursive: true},(err)=>{
    //     if(err){
    //         console.log('에러',err)
    //     }
    // })

    //async ~await 비동기를 동기식으로 처리
    // promises 필요 (callback 없이 처리)
    fs.cpSync(fName, newFName , {recursive: true})

}



//디렉토리 스캔
function dirSearch(dirName){
    //console.log(`>>>>${dirName}`)
    let files = fs.readdirSync(dirName)
    for (const fName of files) {
        //console.log(fName)
        const ff = `${dirName}/${fName}`
        const st = fs.statSync(ff)
        if(st.isDirectory()){           //폴더인지 확인 후 재귀처리
            dirSearch(ff)
        }else{
            
            ffCopy(ff)                  //파일인 경우 복사
        }
        
    }
}

dirSearch('../File')