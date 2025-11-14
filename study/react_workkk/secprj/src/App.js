import React, { Component } from 'react';

class App extends Component {
  render (){
    let pname = '정우성'
    let age = 43
    let marriage = true   // true , false, null, undefined 및 에러자료형 은 직접 출력 불가
    return (
      <div>
        <div>이름 : {pname}</div>
        <div>나이 : {age}</div>
        <div>결혼 : {String(marriage)}</div> 
        {/*
          true 는 출력불가  
          문자열로 치환 필요
          marriage+''
          marriage.toString()  : null, undefined 및 에러자료형 불가
          `${marriage}`
          JSON.stringify(marriage)
          String(marriage)
        */}
      </div>
    )
  }
}

export default App;
