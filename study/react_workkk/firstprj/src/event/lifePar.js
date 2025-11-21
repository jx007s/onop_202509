import { useState } from "react"
import LifeCycle from "./lifeCycle"

function ZZZ(){

    const [showChild, setShowChild] = useState(true)

    return <>
        <h1>lifePar 입니다</h1>
        <button onClick={()=>{setShowChild(!showChild)}}>LifeCycle{showChild ? '숨기기' :'보이기'}</button>
        {showChild && <LifeCycle pVV={123}/>}
    </>
}

export default ZZZ