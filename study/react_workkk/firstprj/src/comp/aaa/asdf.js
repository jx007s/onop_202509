import { Component } from "react";

let aa = 0


console.log(`asdf 이지롱 ${aa}`)   //import 시 실행 
                               // <Erty/>  여러번 실행해도 1번만실행

class BBB extends Component{

    bb = 0

    constructor(){ // //<Erty/> 실행시점에서 인스턴스 생성함
        super()
        aa++
        this.bb++
        console.log(`BBB 생성자 ${aa}, ${this.bb}`)
    }

    render(){   //<Erty/> 실행됨
        let cc = 0
        aa++
        this.bb++
        cc++
        console.log(`render 이지롱 ${aa}, ${this.bb} , ${cc}`)
        return <div>BBB {aa} {this.bb} {cc}</div>
    }
}

export default BBB  // 클래스기반 Component : Component클래스 상속해야함