import { Component } from "react";
import './propStud.css'

class PropStud extends Component{
    render(){
        let {dd} = this.props
        let jum = dd.jum.join(',')
        let tot = 0
        for (const j of dd.jum) {
            tot += j
        }

        return <div className='stBox'>
            <div className='stTitle'>이름</div><div className='stData'>{dd.pname}</div>
            <div className='stTitle'>점수</div><div className='stData'>{jum}</div>
            <div className='stTitle'>총점</div><div className='stData'>{tot}</div>
        </div>
    }
}

export default PropStud