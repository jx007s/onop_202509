import { Component } from "react";
import './updateStud.css'

let data = {
    pname:'현빈',
    jum:[78,79,76]
}


class UpdateStud extends Component{

    state={
        box:'box hh',
        disTitle: '가로'
    }

    boxChange=()=>{
        this.setState({
            box: this.state.disTitle=='가로' ? 'box vv':'box hh',
            disTitle: this.state.disTitle=='가로' ? '세로':'가로',
        })
        console.log('들어오는감?')
    }

    render(){
        return <>
            <h1>state학생입니다.</h1>
            <button onClick={this.boxChange}>{this.state.disTitle}</button>
            <div className={this.state.box}>
                <div>이름 : {data.pname}</div>
                <div>점수 : {data.jum.join(',')}</div>
            </div>
        </>
    }
}


export default  UpdateStud