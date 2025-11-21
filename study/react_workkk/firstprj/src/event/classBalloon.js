import { Component, createRef } from "react";
import './eventBalloon.css'

class AAA extends Component{

    constructor(props){
        super(props)

        this.balloons = []

        for (let i = 1; i <=8; i++) {
            this.balloons.push(require(`../fff/풍선/0${i}.png`))
        }
    }

    state={
        bb4:null,
        bb5:null,
        bb6:null,
        bb7:null
    }

    ballRef4 = createRef()
    ballRef5 = createRef()
    ballRef6 = createRef()
    ballRef7 = createRef()

    fn_4=()=>{
        console.log("fn_4 입니다")
        this.setState({
            bb4:{backgroundColor:'#ff0'}
        })
    }
    fn_5=()=>{
        console.log("fn_5 입니다")
        this.setState({
            bb5:{boxShadow:"10px 10px 20px #000"}
        })
    }
    fn_6=()=>{
        console.log("fn_6 입니다")
        this.setState({
            bb6:{opacity:0.3}
        })
    }
    fn_7=()=>{
        console.log("fn_7 입니다")
        this.setState({
            bb7:{transform:"rotate(90deg)"}
        })
    }

    componentDidMount(){
        this.ballRef4.current.addEventListener('mousedown',this.fn_4)
        this.ballRef5.current.addEventListener('mouseover',this.fn_5)
        this.ballRef6.current.addEventListener('mouseleave',this.fn_6)
        this.ballRef7.current.addEventListener('mouseup',this.fn_7)
    }

    componentWillUnmount(){
        this.ballRef4.current.removeEventListener('mousedown',this.fn_4)
        this.ballRef5.current.removeEventListener('mouseover',this.fn_5)
        this.ballRef6.current.removeEventListener('mouseleave',this.fn_6)
        this.ballRef7.current.removeEventListener('mouseup',this.fn_7)
    }


    render(){
        return <>
        <h1>이벤트풍선입니다.</h1>
       

        {/* 
        <img src={balloons[0]} onMouseDown={fn_4} />
        <img src={balloons[1]} onMouseOver={fn_5} />
        <img src={balloons[2]} onMouseLeave={fn_6}/>
        <img src={balloons[3]} onMouseUp={fn_7}   />
        <div className="big">
            <div style={bb4}><img src={balloons[4]}/></div>
            <div style={bb5}><img src={balloons[5]}/></div>
            <div style={bb6}><img src={balloons[6]}/></div>
            <div style={bb7}><img src={balloons[7]}/></div>
        </div>  
         */}  

         <img src={this.balloons[0]} ref={this.ballRef4} />
         <img src={this.balloons[1]} ref={this.ballRef5} />
         <img src={this.balloons[2]} ref={this.ballRef6} />
         <img src={this.balloons[3]} ref={this.ballRef7} />
         <div className="big">
            <div style={this.state.bb4}><img src={this.balloons[4]}/></div>
            <div style={this.state.bb5}><img src={this.balloons[5]}/></div>
            <div style={this.state.bb6}><img src={this.balloons[6]}/></div>
            <div style={this.state.bb7}><img src={this.balloons[7]}/></div>
         </div>  
    </>
    }
}


export default AAA