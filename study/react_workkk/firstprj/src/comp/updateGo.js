import { useState } from "react"
import './updateGo.css'

let no1 = 0
let no2 = 0
let boxToggle = true

function Fweqfwef({pname, age, marriage}){ //useState 사용시 함수명을 대문자로 시작해야 함

    let no4 = 0 //재랜더링시 선언
    no4++       //1로 증가(더이상의 증가를 못함)


    no1++       //재랜더링시 실행 - 누적증가
    console.log('화면그리기', no1, pname, age, marriage)        //재랜더링시 실행


    //state : 변수 대입 및 화면갱신
    const [no3, setNo3] = useState(100)     // 변수명 : no3 , 변수값변경함수 : setNo3(매개변수), 초기값 : 100
    const [noAge, setNoAge] = useState(age) // 변수명 : noAge , 변수값변경함수 : setNoAge(매개변수), 초기값 : age
    const [box, setBox] = useState('box_y')

    function btnGo2(){
        no2++
        console.log('btnGo2 눌렀다', no2)
    }

    function btnGo3(){
        setNo3(no3+1)            //useState로 지정한 setNo3() 함수 호출시
                                // 1. state: no3 값을 매개변수로 대입  no3 = no3+1
                                // 2. 화면 재랜더링
        console.log('btnGo3 눌렀다', no3)
    }

    function btnGoNoAge(){
        age=123456              //props는 상수 : 읽기전용-변경되지 않음
        setNoAge(noAge+1) 
                  
        console.log('btnGoNoAge 눌렀다', noAge)
    }

    
    
    function btnGoBox(){
       
        boxToggle = !boxToggle
        
        setBox(boxToggle ? 'box_y' : 'box_r')          
        console.log('btnGoBox 눌렀다', box)
    }

    return <>
        <h1>화면갱신</h1>
        <div>내용 : {pname}, {age}, {marriage+''}, {noAge}</div>
        <div className={box}>no1 : {no1}, no2 : {no2}, no3 : {no3} , no4 : {no4}, boxToggle :{boxToggle+''}</div>  
        {/*no2 화면갱신이 발생하지 않음 */}
        {/* 이벤트넣기 */}
        <button onClick={btnGo2}>버튼2</button>
        <button onClick={btnGo3}>버튼3</button>
        <button onClick={btnGoNoAge}>버튼noAge</button>
        <button onClick={btnGoBox}>버튼box</button>
    </>
}


export default Fweqfwef