const express = require('express')
const router = express.Router()
const conn = require('../dbPool')   //pool 로 결합
const upload = require('../upload')
const fs = require('fs')
const path = require('path')

let limit = 3   // 한 페이지에 보여줄 내용 갯수
let pageLimit = 4   // 페이지 하단에 보여줄 페이지번호 갯수

function dateToStr(dbDate){
    let ddd = new Date(dbDate)
    let res = `${ddd.getFullYear()}-${ddd.getMonth()+1}-${ddd.getDate()}`
    res+=` (${'일월화수목금토'[ddd.getDay()]}) ${ddd.getHours()}:${ddd.getMinutes()}`
    return res
}

const listFunc = (req,res)=>{

    let nowpage = eval(req.params.nowpage || 1)

    console.log(`/  nowpage :`, nowpage)

    const start = (nowpage-1)*limit
                //nowpage : start
                    //  1 : 0
                    //  2 : 3
                    //  3 : 6
    let limitData = [start ,limit]

    let pd = {
        nowpage:nowpage, 
        start:start,
        startPage : Math.floor((nowpage-1)/pageLimit)*pageLimit+1,
    }
    pd.endPage = pd.startPage + pageLimit
                   
       
    conn.query('select * from exam order by id desc limit ?,?',limitData,(err,ret)=>{
        if(err){
            console.log('목록 sql 실패 : ', err.message)
        }else{
            console.log('목록 sql 성공 : ', ret)

            conn.query('select count(*) as tot from exam',limitData,(err2,ret2)=>{
                if(err2){
                    console.log('total sql 실패 : ', err2.message)
                }else{
                    
                    pd.totalPage = Math.ceil(ret2[0].tot/limit)
                    console.log(ret2.tot, pd.totalPage)

                    if(pd.endPage > pd.totalPage+1){
                        pd.endPage = pd.totalPage+1
                    }

                    res.render('list.html', {mainData : ret, pd:pd})
                }
            })
        }
    }) 
}



//목록
router.get('/',listFunc)            //먼저 적용해야함
router.get('/:nowpage',listFunc)    //나중 적용해야함 (순서가 바뀌면 에러발생)

//글쓰기폼
router.get('/insertForm/:nowpage',(req,res)=>{
       
    res.render('insertForm.html', {nowpage:req.params.nowpage})     
})

//글쓰기처리
router.post('/',upload.single('ff'),(req,res)=>{

    let sql = `insert into exam (hakgi, name, pid, kor, eng, mat, pw, ff, reg_date)
                values (? , ? , ? ,?,?,?,?,?, sysdate()) ` 

    let {hakgi, name, pid, kor, eng, mat, pw} = req.body                

    let data = [hakgi, name, pid, kor, eng, mat, pw, req.file.filename] 
    //console.log(data)           
    conn.query(sql,data, (err,ret)=>{
        if(err){
            console.log('글쓰기 실패 : ', err.message)
        }else{

            //  autjo increament로 추가된 id :  ret.insertId
            console.log('글쓰기 성공 : ', ret.insertId)
            res.render('alert.html', 
                {title:'등록성공', msg:'등록되었습니다.',dst:`/detail/${ret.insertId}/1`})
        }
    })     
})


// 상세
router.get('/detail/:id/:nowpage',(req,res)=>{
       
    conn.query('select * from exam where id = ?',[req.params.id],(err,ret)=>{
        if(err){
            console.log('상세보기 sql 실패 : ', err.message)
        }else{
            //console.log('sql 성공 : ', ret[0])
            let md = ret[0]
            md.regDateStr = dateToStr(md.reg_date)
            res.render('detail.html', {md : md, nowpage:req.params.nowpage})
        }
    })     
})

//삭제폼
router.get('/deleteForm/:id/:nowpage',(req,res)=>{
       
    res.render('deleteForm.html',{id:req.params.id, nowpage:req.params.nowpage})     
})

//삭제처리결과
router.delete('/deleteReg',upload.none(), (req,res)=>{

    let {id , pw} = req.body
    console.log('삭제 처리전', id, pw)    
   
    //id 관련 파일 정보 획득
    conn.query('select * from exam where id = ?',[id],(err1,ret1)=>{
        if(err1){
            console.log('삭제 전 조회 sql 실패 : ', err1.message)
            res.json({chk:false})
        }else{
            let ff = ret1[0].ff
            console.log(`ff : `, ff)

            // id, pw 이용하여 삭제 시도
            conn.query('delete from exam where id = ? and pw = ?',[id, pw],(err2,ret2)=>{

                if(err2){
                    console.log('삭제 sql 실패 : ', err2.message)
                    res.json({chk:false})
                }else{
                    // ret2.affectedRows : 삭제된 행 갯수 (id,pw 일치하면 1개삭제 아니면 0개)
                    if(ret2.affectedRows > 0){

                        //파일삭제 - 파일이 존재한다면
                        if(ff!=null && ff.trim()!=''){
                            console.log('파일삭제 시도', ff)
                            const delPath = path.join(__dirname,'../fff',ff)
                            //파일삭제
                            fs.unlinkSync(delPath)
                        }
            
                        res.json({chk:true})
                    }else{
                        res.json({chk:false})
                    }
                
                }
            })  

        }
    })
 
})

// 수정폼
router.get('/modifyForm/:id/:nowpage',(req,res)=>{
       
    conn.query('select * from exam where id = ?',[req.params.id],(err,ret)=>{
        if(err){
            console.log('수정폼 sql 실패 : ', err.message)
        }else{
            let md = ret[0]
            md.regDateStr = dateToStr(md.reg_date)
            res.render('modifyForm.html', {md : md, nowpage:req.params.nowpage})
        }
    })     
})


//수정처리
router.put('/modifyReg',upload.none(),(req,res)=>{


    let sql = `update exam set hakgi = ?, name = ?, pid = ?, kor = ?, eng = ?, mat = ? where id = ? and pw = ? ` 

    let {hakgi, name, pid, kor, eng, mat, id, pw} = req.body                

    let data = [hakgi, name, pid, kor, eng, mat, id, pw] 
     
    //console.log(`수정 data :`, data)
    conn.query(sql,data, (err,ret)=>{
        if(err){
            console.log(`수정 sql 에러 :`, err.message)
            res.json({chk:false})
        }else{
            // ret.affectedRows : 수정된 행 갯수 (id,pw 일치하면 1개 수정   아니면 0개)
            if(ret.affectedRows > 0){
                res.json({chk:true})
            }else{
                res.json({chk:false})
            }
        }
    })     
})


module.exports = router