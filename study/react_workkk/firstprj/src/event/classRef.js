const { Component, createRef } = require("react");

// 함수형 컴포넌트에서만 useEffect 사용가능1
// 클래스형 컴포넌트에서는 라이프사이클을 이용한 useEffect 사용
class AAA extends Component{

    constructor(props){ //생성자에서 props 매개변수 필수 --> 부모생성자에게 전달
        super(props)
        console.log('AAA 생성자 실행')
    }

    //멤버변수로 ref 선언
    boxRef = createRef()

    fn_1=()=>{console.log('인풋에 커서 들어옴')}

    //Mount - 컴포넌트 결합
    // 결합후 동작 - 최초 1회 실행 : useEffect와 동일한 기능
    componentDidMount(){
        console.log('componentDidMount() 실행')
        this.boxRef.current.addEventListener("focus", this.fn_1)
    }

    //컴포넌트 결합해제
    componentWillUnmount(){
        this.boxRef.current.removeEventListener("focus", this.fn_1)
    }

    render(){
        return <>
            <h1>클래스 Ref 입니다.</h1>
            <input ref={this.boxRef}/>
        </>
    }
}

export default AAA