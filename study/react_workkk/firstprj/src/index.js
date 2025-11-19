import React from 'react';
import ReactDOM from 'react-dom/client';
//import Comp1 from './comp/comp1'
// import SC from './basic/StaticClass'
// import Prop1 from './comp/prop1'
// import Prop2 from './comp/prop2'
// import Prop3 from './comp/prop3'
import Prop4 from './comp/prop4'

import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <>

   {/* <Comp1/> 
   <SC/>
   <Prop1/>
   <Prop2/>
   <Prop3/>*/}
   <Prop4/>

  </>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
