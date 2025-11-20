import './eventBalloon.css'
import { useState } from 'react'
// import : 비동기방식
// require : 동기방식
function Asdfgh(){

    const [bb4, setBB4] = useState()
    const [bb5, setBB5] = useState()
    const [bb6, setBB6] = useState()
    const [bb7, setBB7] = useState()

    const balloons = []

    for (let i = 1; i <=8; i++) {
        balloons.push(require(`../fff/풍선/0${i}.png`))
    }
    //console.log(balloons)

    let fn_4=()=>{
        console.log("fn_4 입니다")
        setBB4({backgroundColor:'#ff0'})
    }
    let fn_5=()=>{
        console.log("fn_5 입니다")
        setBB5({boxShadow:"10px 10px 20px #000"})
    }
    let fn_6=()=>{
        console.log("fn_6 입니다")
        setBB6({opacity:0.3})
    }
    let fn_7=()=>{
        console.log("fn_7 입니다")
        setBB7({transform:"rotate(90deg)"})
    }

    return <>
        <h1>이벤트풍선입니다.</h1>
        {/* {balloons.map((ss, i)=>
            <img key={i} src={ss}/>
        )} */}

        <img src={balloons[0]} onMouseDown={fn_4}/>
        <img src={balloons[1]} onMouseOver={fn_5}/>
        <img src={balloons[2]} onMouseLeave={fn_6}/>
        <img src={balloons[3]} onMouseUp={fn_7}/>
        <div className="big">
            <div style={bb4}><img src={balloons[4]}/></div>
            <div style={bb5}><img src={balloons[5]}/></div>
            <div style={bb6}><img src={balloons[6]}/></div>
            <div style={bb7}><img src={balloons[7]}/></div>
        </div>    
    </>
}

export default Asdfgh
