const multer = require('multer')
const path = require('path')

//업로드 폴더
const upDir = path.join(__dirname, 'fff/')

const qwer = multer({
    //저장
    storage : multer.diskStorage({

        destination : (req,file, cb)=>{   //저장폴더
            cb(null, upDir)  //cb(err 혹은 null, 저장폴더)
        },
        filename:(req,file, cb)=>{          //저장될때 파일

            //한글깨짐 처리
            const oriName = Buffer.from(file.originalname, 'latin1').toString('utf8')

            const ext = path.extname(oriName) //확장자명
            cb(null, path.basename(oriName,ext)+Date.now()+ext)
        }
    }),

    //파일크기 - 단일파일 : array인 경우 각 파일크기 제한 임 (전체크기 합산이 아님)
    limits :{ fileSize : 10 * 1024 * 1024},  // byte
})

module.exports = qwer