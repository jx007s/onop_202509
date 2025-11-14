import React, { Component } from "react";

class App extends Component{

    render(){
        let no = 5

        return (
            <>
                {/* JSX (Javascript XML)문법 : 
                    JavaScript  에서 HTML 을 사용
                    render 시 컴파일 하여 적용  : Babel 이 JSX를 Javascript로 변환
                                                --> HTML  코드는  document.createElement("div") 형태로 실행
                                                --> React에서 적용시에는 React.createElemen("div") 형태임

                    렌더시 1개의 엘리먼트 형태로 리턴
                    엘리먼트는 닫혀 있어야 함
                    변수 출력시 {} 안에 기재
                주석을 넣겠다*/}

                <h1>내가 App  이야 1</h1>
                <h1>내가 App  이야 {no}</h1>
                <input type='text' name='pid' value={no+20} />
            </>

        )
    }
}


export default App


/*
    react_workkk 폴더 안에 secprj  리액트프로젝트를 생성하세요

    포트번호는 8888로 지정

    출력내용

    이름 : 정우성
    나이 : 43
    결혼 : true

    정우성, 43,  true 는 변수로 처리 하세요


*/


