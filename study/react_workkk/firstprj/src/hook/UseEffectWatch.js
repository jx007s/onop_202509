import React, { useEffect, useState } from 'react';
import './UseEffectWatch.css'


function UseEffectCleanup(props) {

    const [sec, setSec] = useState(0)
    const [mm, setMM] = useState(0)
    const [hh, setHH] = useState(0)

    const [sn ,setSN] = useState({transform : `rotate(0deg)`})
    const [mn ,setMN] = useState({transform : `rotate(0deg)`})
    const [hn ,setHN] = useState({transform : `rotate(0deg)`})
    const [nowStr, setNowStr] = useState('')

    useEffect(()=>{
        console.log('UseEffectCleanup:useEffect 실행')

        // 마운트 마다 setInterval 생성 실행
        const timer = setInterval(()=>{
            let tz = 'America/New_York'
            tz = 'Europe/London'
            tz = 'Europe/Moscow'
            tz = 'Asia/Seoul'
            tz = 'America/Los_Angeles'
            
            const locTime = new Date()
            const localStr = locTime.toLocaleString("en-US",{timeZone:tz})

            const now = new Date(localStr)

            console.log('timer:',now)
            setSec(now.getSeconds())
            setMM(now.getMinutes())
            setHH(now.getHours())

            setSN({transform : `rotate(${now.getSeconds()*6}deg)`})
            setMN({transform : `rotate(${now.getMinutes()*6}deg)`})
            setHN({transform : `rotate(${(now.getHours()+now.getMinutes()/60)*30}deg)`})

            setNowStr(`${now.getFullYear() }년 ${now.getMonth()+1 }월 ${now.getDate() }일`)
        },1000)

        //return  ==> cleanup : 컴포넌트unmount 시 실행
        return ()=>{
            console.log('cleanup 실행')
            clearInterval(timer)
        }
    },[])

    return (
        <div>
            <h1>시계 입니다</h1>
            <div>
                <div className="date">{nowStr}</div>
                <div className="time">{hh}:{mm}:{sec}</div>
            </div>

            <section>
                <div style={hn} className="niddle"></div>
                <div style={mn} className="niddle"></div>
                <div style={sn} className="niddle"></div>
                
            </section>
        </div>
    );
}

export default UseEffectCleanup;