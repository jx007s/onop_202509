let c = '로이'
function fn_1(req, res){
    console.log(`01_mod.js fn_1 실행`)
    //res.send(`01_mod.js fn_1 ${c} ${me}`)  다른페이지의 me 변수 호출불가
    res.send(`01_mod.js fn_1 ${c}`)
}


function view(req, res){
    console.log(`01_mod.js view 실행`, req.cookies)
    res.send(`01_mod.쿠키보기 ${req.cookies.pid} ,  ${req.cookies.pname}`)
}

function modify(req, res){
                            // 5초 이후 삭제
    res.cookie('pid','bbb',{maxAge:5000})
    console.log(`01_mod.js view 실행`)
    res.send(`01_mod.쿠키수정`)
}

module.exports = {
    c,
    fn_1,
    view,
    modify
}