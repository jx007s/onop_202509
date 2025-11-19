import { Component } from "react";
import PropTypes from 'prop-types'

class PropCla extends Component{
    //기본값 props
    static defaultProps = {
        pname : '차은우',
        age : 27
    }


    static propTypes = {
        age : PropTypes.number.isRequired
    }

    render(){

        console.log(this.props)
        let {pname, age, marriage} = this.props


        return <>
            <h2>클래스-props</h2>
            <div>이름 : {this.props.pname}</div>
            <div>나이 : {this.props.age}</div>
            <div>결혼 : {this.props.marriage+''}</div>
            <div>내용 : {this.props.children}</div>
            <hr/>
            <div>이름2 : {pname}</div>
            <div>나이2 : {age}</div>
            <div>결혼2 : {marriage+''}</div>
        </>
    }
}

export default PropCla