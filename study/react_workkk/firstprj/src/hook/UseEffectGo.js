import React, { useEffect, useState } from 'react';
import UseEffectCleanup from './UseEffectCleanup';
function UseEffectGo(props) {

    const [pname, setPname] = useState('차은우')
    const [age, setAge] = useState(26)
    const [marriage, setMarriage] = useState(false)
    const [show, setShow] = useState(true)

    useEffect(()=>{
        //componentDidMount + componentDidUpdate
        // 마운트결합 + 랜더링시
        console.log(`useEffect 실행1 : ${pname}, ${age}, ${marriage}`)
    })

    useEffect(()=>{
        //componentDidMount
        // 마운트결합
        console.log(`useEffect 실행2 : ${pname}, ${age}, ${marriage}`)
    },[])

    useEffect(()=>{
        //componentDidMount+ pname,marriage변경시 componentDidUpdate
        // 마운트결합+ pname,marriage변경시 
        console.log(`useEffect 실행3 : ${pname}, ${age}, ${marriage}`)
    },[pname,marriage])

    return (
        <div>
            <h1>useEffect입니다</h1>
            <div>pname : <input value={pname} onChange={(e)=>setPname(e.target.value)}/></div>
            <div>age : {age}<button onClick={()=>setAge(age+1)}>나이증가</button></div>
            <div>marriage : {marriage+''}<button onClick={()=>setMarriage(!marriage)}>변경</button></div>
            <button onClick={()=>setShow(!show)}>{show ? '제거':'보이기'}</button>
            {show && <UseEffectCleanup/>}
        </div>
    );
}

export default UseEffectGo;