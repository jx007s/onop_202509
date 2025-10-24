const express = require('express')
const router = express.Router()
const conn = require('../examDB')

function dateToStr(dbDate){
    let ddd = new Date(dbDate)
    let res = `${ddd.getFullYear()}-${ddd.getMonth()+1}-${ddd.getDate()}`
    res+=` (${'일월화수목금토'[ddd.getDay()]}) ${ddd.getHours()}:${ddd.getMinutes()}`
    return res
}

router.get('/',(req,res)=>{
       
    conn.query('select * from exam',(err,ret)=>{
        if(err){
            console.log('sql 실패 : ', err.message)
        }else{
            console.log('sql 성공 : ', ret)
            res.render('list.html', {mainData : ret})
        }
    })     
})

router.get('/:id',(req,res)=>{
       
    conn.query('select * from exam where id = ?',[req.params.id],(err,ret)=>{
        if(err){
            console.log('sql 실패 : ', err.message)
        }else{
            //console.log('sql 성공 : ', ret[0])
            let md = ret[0]
            md.regDateStr = dateToStr(md.reg_date)
            res.render('detail.html', {md : md})
        }
    })     
})

module.exports = router