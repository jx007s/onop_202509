// 함수형 1
function wefef(ppp){  // props 를 매개변수 ppp로 전달받음
    console.log('ppp : ', ppp)
    return <div>함수형1 : {ppp.pname}, {ppp.age}, {ppp.marriage+''}</div>
}


// 함수형 2
function asdf({pname, age = 10 , marriage=true}){  
    // {pname, age, marriage} = props 를 매개변수로 전달받음
    // 함수: 매개변수의 기본값으로 props의 기본값사용
    return <div>함수형2 : {pname}, {age}, {marriage+''}</div>
}

export default asdf