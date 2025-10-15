const fs = require('fs')

let files = fs.readdirSync('../fff')

//console.log(files)
for (const fName of files) {
    const st = fs.statSync(`../fff/${fName}`)
    let size = '[dir]'
    if(st.isFile()){
        size = st.size
    }
    console.log(`${fName} : ${size} , ${st.birthtime} ${st.mtime}`)
    
}


//  img, music, doc, etc
/// 하위 폴더까지 검색하세요

//이미지 : bmp, jpg, gif, png , jpeg
//음악 : mp3, wma, wav
//문서 :doc, hwp, ppt, xls, pptx, xlsx. docx
//기타 : 위의 분류 이외

