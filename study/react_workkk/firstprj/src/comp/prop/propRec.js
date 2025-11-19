import { Component } from "react";

class PropRec extends Component{

    static defaultProps = {
        dd : [2,2]
    }

    calc(){
        this.w = this.props.dd[0]
        this.h = this.props.dd[1]
        this.area = this.w * this.h
        this.border = (this.w  + this.h) * 2
    }
    ppp(){
        this.calc()
        return <div>직사각형 : {this.area} , {this.border}</div>
    }

    render(){


        return this.ppp()
    }
}

export default PropRec