import { useState } from "react"

function Qwer(){

    const [pname, setPname] = useState('')
    const [hobby, setHobby] = useState([])

    const pnameChange = (e)=>{
        setPname(e.target.value)
        console.log('pnameChange', e.target.value)
    }

    const hobbyChange = (e)=>{
        
        const vv = e.target.value

        if(e.target.checked){//체크시 추가
            setHobby([...hobby, vv])
        }else{  //체크해제 --> 현재 항목을 제외한 나머지만 취미배열에 남김
            setHobby( hobby. filter((item)=>  item != vv) )
        }
        
        console.log('hobbyChange', vv, e.target.checked)
    }

    return <>
        <h1>이벤트 State 입니다</h1>
        
        <div>이름 : {pname} </div>
        <div>취미 : {hobby} </div>

        <form>
            이름 : <input value={pname} onChange={pnameChange} />
            <br/>
            취미 : <input type='checkbox' value='그림그리기' onChange={hobbyChange}/> 그림그리기
            <input type='checkbox' value='운동' onChange={hobbyChange}/> 운동
            <input type='checkbox' value='먹기' onChange={hobbyChange}/> 먹기
        </form>
        
    </>
}

export default Qwer