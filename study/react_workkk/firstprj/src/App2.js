function qwer(){


    function fn(){
        if(jum >=80) {
            return <div>fn 우수</div>
        }else if(jum >=60) {
            return <div>fn 양호</div>
        }
        return <div>fn 미흡</div>
    }

    let jum = 78
    return(
        <>
            <h2>qwer 이지롱</h2>
            {jum >= 80 ? '합격' : '불합격' }
            <br/>
            {jum >= 80 ? <div>합격2</div> : <div>불합격2</div> }
            <br/>
            {jum >= 80 && '합격일때만 보이지롱'}
            <br/>
            <input type="checkbox" checked/>합격3
            {/* <input type="checkbox" {jum >= 80 && checked} />합격4  에러발생*/}
            <input type="checkbox" checked={jum >= 80}/>합격5
              {/* {   if(jum >= 80) '합격6'          } 직접적인 if 사용불가 */}
            {fn()}

            {
                (function(){
                    if(jum >=80) {
                        return <div>익명 우수</div>
                    }else if(jum >=60) {
                        return <div>익명 양호</div>
                    }
                    return <div>익명 미흡</div>
                })()
            }

            {
                (()=>{
                    if(jum >=80) {
                        return <div>화살표 우수</div>
                    }else if(jum >=60) {
                        return <div>화살표 양호</div>
                    }
                    return <div>화살표 미흡</div>
                })()
            }
        </>
    )
}


export default qwer

/*
Exam.js 를 생성하고
이름, 국어,영어,수학,총점,평균,등급을 출력하세요

*/