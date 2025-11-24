import { Component } from "react";

class LifeShoes extends Component{
    state= {
        data : [
            {name:'나이키에어'  , price:100000  , cnt:2},
            {name:'나이키비어'  , price: 80000  , cnt:4},
            {name:'아디다스'   , price: 110000 , cnt: 5},
            {name:'뉴발'       , price:   75000, cnt: 3},
            {name:'프로스펙스'  , price: 60000  , cnt:4}
        ]
    }
    

    dataChange=(i, key, vv)=>{
        console.log('dataChange 실행하지롱')

        //부모 state 변경으로 인한 렌더링 --> 자식 컴포넌트도 리렌더링요청
        this.setState((preState)=>{
            const newData = [...preState.data]
            newData[i] = {... newData[i], [key]:vv} //기존데이터 가져오고 변경하고자 하는 key의 값만 변경
                        //   newData[2] =  {...data[2]}
                                         // i(2) 번째 :  data[2] =  {name:'아디다스'   , price: 110000 , cnt: 5}
                        //                  key=name  , vv : '아식스'==>   [key]:vv  ==>   name : '아식스'
                        //   newData[2] =  {name:'아디다스'   , price: 110000 , cnt: 5 , name : '아식스'}
                        //                      name 의 값은 뒤에  대입한 '아식스' 로 들어간다
                        //   newData[2] =  {price: 110000 , cnt: 5 , name : '아식스'}
            return {data:newData}
        })
    }

    calc(){
        let tot = 0
        for (const ee of this.state.data) {
            tot += ee.price * ee.cnt
        }
        return tot
    }

    render(){
        return <>
            <h1>신발입니다.</h1>
            {this.state.data.map((v,i)=><SubShoes key={i} sd={v} index={i} dataFn={this.dataChange}/>)}
            <div>전체합계:{this.calc()}</div>
            {/* <button onClick={()=>this.dataChange(2,'name','아식스')}>dataChange실행</button> */}
        </>
    }
}

class SubShoes extends Component{
    constructor(props){
        super(props)

        // this.state ={
        //     price:props.sd.price,
        //     cnt:props.sd.cnt
        // } 
    }

    // static getDerivedStateFromProps(nextProps, prevState){
        
    //     return {
    //         price:nextProps.sd.price,
    //         cnt:nextProps.sd.cnt
    //     }  //state 변경 리턴 : setState 대신 사용
        
    // }
    componentDidUpdate(prevProps, prevState, snapshot){
        console.log("SubShoes 변경")
        console.log( 'prevProps', prevProps)    //변경전 props
        console.log( 'prevState', prevState)    //변경전 state  : cnt 1-> 2 변경시  이전값인 1 호출
    }


    render(){
        return <div>
            <div>{this.props.sd.name}</div>
            {/* <div><input value={this.state.price} onChange={(e)=>this.setState({price:e.target.value})}/></div>
            <div><input value={this.state.cnt} onChange={(e)=>this.setState({cnt:e.target.value})}/></div> */}
            
            <div><input value={this.props.sd.price} 
            onChange={(e)=>this.props.dataFn(this.props.index,'price',e.target.value)}/></div>
            
            <div><input value={this.props.sd.cnt} 
            onChange={(e)=>this.props.dataFn(this.props.index,'cnt',e.target.value)}/></div>

            <div>합계 : {this.props.sd.cnt*this.props.sd.price}</div>
        </div>
    }    
}

export default LifeShoes

