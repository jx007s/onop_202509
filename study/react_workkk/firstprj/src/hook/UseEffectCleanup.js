import React, { useEffect, useState } from 'react';

let no = 0
function UseEffectCleanup(props) {

    const [tt, setTT] = useState(no)

    useEffect(()=>{
        console.log('UseEffectCleanup:useEffect 실행')

        // 마운트 마다 setInterval 생성 실행
        const timer = setInterval(()=>{
            no++
            console.log('timer:',no)
            setTT(no)
        },1000)

        //return  ==> cleanup : 컴포넌트unmount 시 실행
        return ()=>{
            console.log('cleanup 실행')
            clearInterval(timer)
        }
    },[])

    return (
        <div>
            <h1>UseEffectCleanup 입니다</h1>
            <div> tt : {tt}</div>
        </div>
    );
}

export default UseEffectCleanup;