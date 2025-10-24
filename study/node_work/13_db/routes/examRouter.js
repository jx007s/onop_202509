const express = require('express')
const router = express.Router()
const conn = require('../examDB')

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

module.exports = router