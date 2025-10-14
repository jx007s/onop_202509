const fs = require('fs')

let res = {}

function player(team){

    function position(mm){
        
        let arr = mm.split(",")
        let ppp = []
        if(arr[2] in res ){
            ppp = res[arr[2]]
        }
        ppp.push(mm)
        res[arr[2]]=ppp
    }

     fs.readFile(`../fff/${team}.txt`,(e,data)=>{
        let arr = data.toString().split('\r\n')
        for (const i of arr) {

            position(i)
        }
        console.log(res)
     })
}

for(tt of '북산,능남,해남'.split(",")){
    player(tt)
}