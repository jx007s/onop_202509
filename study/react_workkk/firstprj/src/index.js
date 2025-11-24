import React from 'react';
import ReactDOM from 'react-dom/client';
//import Comp1 from './comp/comp1'
// import SC from './basic/StaticClass'
// import Prop1 from './comp/prop1'
// import Prop2 from './comp/prop2'
// import Prop3 from './comp/prop3'
// import Prop4 from './comp/prop4'
// import Prop5 from './comp/prop5'
// import UpdateGo from './comp/updateGo'
// import UpdateClassGo from './comp/updateClassGo'
// import UpdateStud from './comp/updateStud'
// import EventGo from './event/eventGo'
// import EventState from './event/eventState'
// import EventBalloon from './event/eventBalloon'
// import ClassRef from './event/classRef'
// import ClassBalloon from './event/classBalloon'
// import LifePar from './event/lifePar'
// import LifeShoes from './event/lifeShoes';
 import UseEffectGo from './hook/UseEffectGo';

import reportWebVitals from './reportWebVitals';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <>

   {/* <Comp1/> 
   <SC/>
   <Prop1/>
   <Prop2/>
   <Prop3/>
   <Prop4/>
   <Prop5/>
   <UpdateGo pname='흥부' age={34} marriage={true}/>
   <UpdateClassGo/>
   <UpdateStud/>
   <EventGo/>
   <EventState/>
   <EventBalloon/>
   <ClassRef/>
   <ClassBalloon/>
   <LifePar/>
   <LifeShoes/>
    */}
   <UseEffectGo/>
  
   
  
   
  </>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
