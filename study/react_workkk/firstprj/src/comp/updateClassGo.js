import { Component } from "react";

let ee = 400  //지역변수이지만 선언된 위치가 최상위이어서 전역변수처럼 사용됨

class AAA extends Component{

    // 부모클래스(Component)의 멤버변수 
    // 부모에서의 기본 설정 state = null
    // 자식 클래스에서 초기화하여 사용
    state = {
        aa : 100,
        bb : '아기상어',
        arr : [11,22,33]
    }

    cc = 200    //멤버변수


    //Cannot read properties of undefined (reading 'setState')
    //fn_1(){}  100% this 가 아니어서 발생되는 component 문제
    fn_1=()=>{
        this.setState({
            aa: this.state.aa+1,
            arr : [...this.state.arr, 99]
        })

        console.log('fn_1 실행', this.state.arr)
    }

    fn_2=()=>{
        this.cc++
        console.log('fn_2 실행', this.cc)
    }

    render(){
        let dd = 300    //지역변수 -- 재랜더링시 초기화 됨

        let fn_3=()=>{  // 재랜더링 안함
            dd++
            console.log('fn_3 실행', dd)
        }

        let fn_4=()=>{
            ee++
            console.log('fn_4 실행', ee)
        }


        return <>
            <h1>클래스state 입니다.</h1>
            <div>aa : {this.state.aa}</div>
            <div>bb : {this.state.bb}</div>
            <div>arr : {this.state.arr.join(',')}</div>
            <div>cc : {this.cc}</div>
            <div>dd : {dd}</div>
            <div>ee : {ee}</div>
            <button onClick={this.fn_1}>fn_1</button>
            <button onClick={this.fn_2}>fn_2</button>
            <button onClick={fn_3}>fn_3</button>
            <button onClick={fn_4}>fn_4</button>
        </>
    }
}

export default AAA