import PropRec from "./prop/propRec"
import './prop3.css'
let arr = [
    [5,6],
    [10,10],
    [8,7],
    [20,10],
    [8,8]
]


function ewfwfwef(){
    return <>
        <h1>직사각형</h1>
        <section>
        {arr.map((v,k)=><PropRec dd={v} key={k} />)}
        </section>
    </>
}

export  default  ewfwfwef