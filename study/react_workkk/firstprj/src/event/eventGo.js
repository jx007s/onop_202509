import { useEffect , useRef } from "react"
import one from '../fff/one.jpg'

function Wefwef(){

    function fn_1(){
        alert('fn_1 눌렀구만?')
        console.log('fn_1 실행')
    }
    function fn_2(){
        let ret = window.confirm('누를꺼야?')
        console.log('fn_2 실행',ret)
    }

    function inputtt(e){
        console.log('inputtt 실행',e.target.value)
    }

    function changeee(e){
        console.log('changeee 실행',e.target.value)
    }


    let keyDownnn=(e)=>{
        // key :입력된 글자     a
        // code : 키보드 위치   KeyA
        // keyCode : 숫자코드   65
        console.log('keyDownnn :',e.key,e.code, e.keyCode)
    }

    let submittt=(e)=>{
        e.preventDefault()
        const myData = new FormData(e.target)  // 폼전체 데이터
        console.log('submittt 1', myData.get('pid'),myData.get('pw'),myData.get('email'))
        const myJson = Object.fromEntries(myData.entries()) //json으로 변환
        console.log('submittt 2', myJson)
    }

    function reszieee(){
        console.log('창크기변경', window.innerWidth, window.innerHeight)
    }

    function scrollll(){
        console.log('widnow 스크롤', window.scrollX, window.scrollY)
    }

    //  div -> boxRef
    const boxRef = useRef(null)  // <div>와 같은 객체 참조용 : JSX 문법으로 생성한 객체에 연결한다

    // widow/document 이벤트는 useEffect 에서 등록
    useEffect(()=>{
        window.addEventListener('resize', reszieee) //창크기변경
        window.addEventListener('scroll', scrollll) //스크롤

        // boxRef -> box 
        const box = boxRef.current

        const boxScroll = ()=>{
            console.log('box 스크롤', box.scrollLeft, box.scrollTop)
        }

        box.addEventListener('scroll', boxScroll) //스크롤

        return ()=>{  // 컴포넌트 삭제시 이벤트 삭제
            window.removeEventListener('resize', reszieee) 
            window.removeEventListener('scroll', scrollll)
            box.removeEventListener('scroll', boxScroll) 
        }
    },[])


    



    return <>
        <h1>이벤트입니다.</h1>
        <button onClick={fn_1}>클릭</button>
        <button onDoubleClick={fn_2}>더블클릭</button>
        <button onClick={()=>alert('경고창 눌렀구만?')}>경고창</button>

        <div style={{
            width:'200px',
            height:'200px',
            backgroundColor:'#ff0'
        }}
        onMouseEnter={(e)=>{console.log('마우스 Enter', e.clientX, e.clientY)}}
        onMouseLeave={(e)=>{console.log('마우스 Leave', e.clientX, e.clientY)}}
        onMouseDown={(e)=>{console.log('마우스 Down', e.clientX, e.clientY)}}
        onMouseUp={(e)=>{console.log('마우스 Up', e.clientX, e.clientY)}}
        onMouseMove={(e)=>{console.log('마우스 Move', e.clientX, e.clientY)}}
        >마우스움직임</div>

        <input 
        onInput={inputtt}  //입력시 호출
        onChange={changeee} //변경시
        onFocus={()=>{console.log('인풋에 커서 들어옴')}}
        onBlur={()=>{console.log('인풋에 커서 나감')}}
        onKeyDown={keyDownnn}
        />

        <form action='joinReg' onSubmit={submittt}>
            id: <input name="pid"/><br/>
            pw : <input name="pw"/><br/>
            email : <input name="email"/><br/>
            <button type='submit'>전송</button>
        </form>

        <div  style={{
            width:'2000px',
            height:'2000px',
            backgroundColor:'#f0f'
        }}/>

        {/* ref={boxRef}  useRef로 생성,선언한 객체(boxRef) 연결 
        
        div -----> boxRef  -----> box
        
        */}
        <div ref={boxRef} style={{
            width:'1200px',
            height:'500px',
            backgroundColor:'#0ff',
            overflow:'auto'
        }}>
            <img src={one}/>

        </div>
    </>
}

export default Wefwef