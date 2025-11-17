import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import App2 from './App2';
import Exam from './Exam';
import MyClass from './basic/MyClass'
import St from './basic/Stud'
import RRR from './basic/Rec'
import CCC from './basic/Constructor'
import CCSS from './basic/ConstStud'
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <>
   {/* <React.StrictMode> 개발자 모드이어서 2번씩 처리함 */}
    {/* <App />
    <App2 /> 
    <Exam/>
    <MyClass/>
    <St/>
    <RRR/>
    <CCC/>*/}
    <CCSS/>
    {/* </React.StrictMode> */}
  </>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
