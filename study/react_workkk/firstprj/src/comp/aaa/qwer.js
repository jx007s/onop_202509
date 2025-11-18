let cnt = 0

console.log(`qwer 이지롱 ${cnt}`)  //import 시 실행 
                             // <Qwer/>  여러번 실행해도 1번만실행



function wqefwef(){  //<Qwer/> 호출시 실행됨

    let no = 0 

    cnt++
    no++

    console.log(`wqefwef() 실행 ${cnt} , ${no}`)  
    //import 만으로는 실행 안함
    // 컴포넌트로 렌더시 실행

    return <div>wqefwef 호출 {cnt}, {no}</div>
}

export default wqefwef //함수기반 Component