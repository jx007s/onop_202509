import { Component } from "react";

class LifeCycle extends Component{

    constructor(pppp){
        super(pppp)
        console.log('1. 생성자==========')

        this.state = {
            vv : 0,            //props-> state 
            cnt : 0,           //update 연습
            hasError: false,   //에러가 있는지
        }
    }

    // props -> state 동기화 (업데이트시 실행)
    static getDerivedStateFromProps(nextProps, prevState){
        console.log('2.getDerivedStateFromProps==========')
        console.log( 'nextProps', nextProps)  //부모가 보내는 변경시키려는(미래의) props
        console.log( 'prevState', prevState)  // 자신의 이전 state

        if(nextProps.pVV > 1000){
            console.log('props -> state 로 대입')
            return {vv:nextProps.pVV}  //state 변경 리턴 : setState 대신 사용
        }

        return null //변경 필요없음
    }


    //이벤트핸들러
    fn_1 = (e)=>{
        console.log('window : ', window.innerWidth, window.innerHeight)
    }

    // DOM 접근 이벤트/타이머/네트워크 등 side-effect 처리 : 마운트 최초 결합시 1번 실행 (업데이트시에는 실행하지 않음)
    componentDidMount(){
        console.log('5. componentDidMount==========')
        window.addEventListener('resize',this.fn_1)
    }

    //update (setState() 실행) 시 호출 : render() 메소드 이전 실행
    shouldComponentUpdate(nextProps, nextState){
        console.log("3. shouldComponentUpdate=============")
        console.log( 'nextProps', nextProps)    //부모가 보내는 변경시키려는(미래의) props
        console.log( 'nextState', nextState)    //자신의 변경시키려는(미래의) state
        
        // 변경하는 cnt 가 짝수일때만 리렌더링
        if(nextState.cnt%2==0){
            return true // true : 리렌더링,  false : 리렌더링 생략
        }else{
            return false
        }
        
    }

    // update -> render 이후 실행 : DOM 업데이트 직전 상태를 snapshot으로 기록 --> componentDidUpdate() 에 전송
    getSnapshotBeforeUpdate(prevProps, prevState){
        console.log("6. getSnapshotBeforeUpdate=============")
        console.log( 'prevProps', prevProps)    //변경전 props
        console.log( 'prevState', prevState)    //변경전 state  : cnt 1-> 2 변경시  이전값인 1 호출
        let data =  {
            preCnt : prevState.cnt   //이전 state 기록
        }
        console.log( '전송할 데이터', data)    
        return data
    }

    // DOM 업데이트 완료 후 실행
    componentDidUpdate(prevProps, prevState, snapshot){
        console.log("7. componentDidUpdate=============")
        console.log( 'prevProps', prevProps)    //변경전 props
        console.log( 'prevState', prevState)    //변경전 state  : cnt 1-> 2 변경시  이전값인 1 호출
        console.log( 'snapshot', snapshot)  //getSnapshotBeforeUpdate 으로 부터 전송받은 data
    }

    // DOM 접근 이벤트/타이머/네트워크 외부 리소스 정리 : 마운트 결합 해제시 실행
    componentWillUnmount(){
        console.log('8. componentWillUnmount==========')
        window.removeEventListener('resize',this.fn_1)
    }


    componentDidCatch(err, info){
        // 자식 component의 화면 렌더 에러시 진입
        console.log('9. componentDidCatch==========')
        console.log('err:',err)
        console.log('info:',info)
        this.setState({hasError:true})
    }

    render(){
        console.log('4. render==========')
        return <>
            <h1>lifeCycle 입니다</h1>
            <div>prop.pVV : {this.props.pVV}</div>
            <div>state.vv : {this.state.vv}</div>
            <div>state.cnt : {this.state.cnt}</div>
            <button onClick={()=>{this.setState({cnt:this.state.cnt+1})}}>+</button>
            {this.state.hasError && <div style={{color:'#f00'}}>자식 에러발생!</div>}
            {<SubComp/>}
        </>
    }
}


class SubComp extends Component{

    state ={
        chk : false
    }

    //에러발생시키는 핸들러
    errGo=()=>{
        this.setState({
             chk : true
        })
    }

    render(){
        if(this.state.chk){
            const rr = null
            return <div>{rr.title}</div>
        }
        return <>
            <h2>SubComp 입니다.</h2>
            <button onClick={this.errGo}>에러발생</button>    
        </>
    }
}

export default LifeCycle

/*
부모

5개 제품정보

나이키에어  100000  2
나이키비어   80000  4
아디다스    110000  5
뉴발        75000  3
프로스펙스   60000  4


자식

나이키에어      .....    ....
100000
2


*/