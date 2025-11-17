import one from '../fff/one.jpg'
import './mapRR.css'

class RecRR{
    constructor(ww, hh){
        this.area = ww * hh
        this.border = (ww + hh) * 2
    }

    ppp(i){
        return <div key={i}>{this.area} , {this.border}</div>
    }
}

let data = [
    new RecRR(5,6),
    new RecRR(10,10),
    new RecRR(16,13),
    new RecRR(20,10),
    new RecRR(7,9)
]



function ewrfwefwe(){

    return <>
        <h1>직사각형 배열입니다.</h1>
        {data.map((vv,kk)=>vv.ppp(kk))}
        <img className='aa' src={one}/>
    </>

}

export default ewrfwefwe