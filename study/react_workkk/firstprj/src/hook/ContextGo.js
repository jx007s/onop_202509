import React, { Children, createContext, useContext, useState } from 'react';

//1. Context 생성
const MyContext = createContext()

// 2. Provider 컴포넌트 정의
const MyProvider = (props)=>{
    // return <div>
    //     MyProvider 이지롱
    //     <div>{props.children}</div>  --> {props.children} : 왔다리 
    // </div>

    const [age, setAge] = useState(30)


    //3. Context.Provider 를 이용한 data 제공 : value={{pname: '정우성', age:45, marriage:true}}
    // Context의Provider는 value 가 필수
    //return <MyContext.Provider value={{pname: '정우성', age:age, setAge:setAge, marriage:true}}>
    //  위의 표현과 같음   age:age ==> age로 보낼수 있음
    //  state를  value로 보냄 : age, setAge
    return <MyContext.Provider value={{pname: '정우성', age, setAge, marriage:true}}>
                {props.children}
            </MyContext.Provider>
}


const SubCom1 = (props)=>{
    //4. Context 가 제공하는 값을 사용
    const conData = useContext(MyContext)
    return <>
        <h3>SubCom1 입니다.</h3>
        <div>context 데이터 : {conData.pname}, {conData.age}, {conData.marriage+""}</div>
        <button onClick={()=>conData.setAge(conData.age+1)}>나이추가</button>
        <div>props.aa : {props.aa}, props.bb : {props.bb} , props.cc : {props.cc}</div>
        {/* 다른 컴포넌트의 props는 모두 안옴 : cc 없음 */}
        <hr/>
    </>
}
const SubCom2 = (props)=>{

    const conData = useContext(MyContext)
    return <>
        <h3>SubCom2 입니다.</h3>
        <div>context 데이터 : {conData.pname}, {conData.age}, {conData.marriage+""}</div>
        <button onClick={()=>conData.setAge(conData.age-1)}>나이감소</button>
        <div>props.aa : {props.aa}, props.bb : {props.bb} , props.cc : {props.cc}</div>
        {/* 다른 컴포넌트의 props는 모두 안옴 : aa,bb 없음 */}
        {props.children}
        <hr/>
    </>
}

const SubSubCom = (props)=>{
    const conData = useContext(MyContext)
    return <>
        <h4>SubSubCom 입니다.</h4>
        <div>context 데이터 : {conData.pname}, {conData.age}, {conData.marriage+""}</div>
        <button onClick={()=>conData.setAge(23)}>나이23</button>
        <div>props.aa : {props.aa}, props.bb : {props.bb} , props.cc : {props.cc}</div>
        {/* 다른 컴포넌트의 props는 모두 안옴 : SubSubCom 에서는 한개도 없음 */}
        <hr/>
    </>
}



function ContextGo(props) {
    return (
        <div>
            <h1>Context 입니다.</h1>
            {/* <MyProvider>
                왔다리
            </MyProvider> */}
            <MyProvider>
                갔다리
                <SubCom1 aa={10} bb={20}/>
                <SubCom2 cc={300}>
                    <SubSubCom/>
                </SubCom2>
            </MyProvider>
            
            {/* <SubCom1/> Context의 제공 영역 안에서만 사용가능 */}
        </div>
    );
}

export default ContextGo;


/*

화면구성을 하세요

--------------------
      헤더
--------------------
        |
사이드   |     메인
        |
--------------------
      푸터
--------------------


색상테마를 3개 설정하여 변경
헤더,사이드,푸터 변경 , 메인 변경하지않음
*/