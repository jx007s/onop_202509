import { Component } from "react";

class LifeShoes extends Component{
    data = [
        {name:'나이키에어'  , price:100000  , cnt:2},
        {name:'나이키비어'  , price: 80000  , cnt:4},
        {name:'아디다스 '  , price: 110000 , cnt: 5},
        {name:'뉴발   '  , price:   75000, cnt: 3},
        {name:'프로스펙스'  , price: 60000  , cnt:4}
    ]

    calc(){
        let tot = 0
        for (const ee of this.data) {
            tot += ee.price * ee.cnt
        }
        return tot
    }

    render(){
        return <>
            <h1>신발입니다.</h1>
            {this.data.map((v,i)=><SubShoes key={i} sd={v}/>)}
            <div>전체합계:{this.calc()}</div>
        </>
    }
}

class SubShoes extends Component{
    constructor(props){
        super(props)

        this.state ={
            price:props.sd.price,
            cnt:props.sd.cnt
        } 
    }

    // static getDerivedStateFromProps(nextProps, prevState){
        
    //     return {
    //         price:nextProps.sd.price,
    //         cnt:nextProps.sd.cnt
    //     }  //state 변경 리턴 : setState 대신 사용
        
    // }


    render(){
        return <div>
            <div>{this.props.sd.name}</div>
            <div><input value={this.state.price} onChange={(e)=>this.setState({price:e.target.value})}/></div>
            <div><input value={this.state.cnt} onChange={(e)=>this.setState({cnt:e.target.value})}/></div>
            <div>합계 : {this.state.cnt*this.state.price}</div>
        </div>
    }    
}

export default LifeShoes

