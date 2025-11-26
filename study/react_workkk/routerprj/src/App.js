import {BrowserRouter, Link, Outlet, Route, Routes, useLocation, useParams} from 'react-router-dom'
import Location from './components/Location';
import SubRoute from './components/SubRoute';
import { useEffect } from 'react';


function Home(){
  console.log("Home 진입")
  return <div>
      <h2>홈이지롱</h2>
  </div>
}

function History(){
  console.log("History 진입")
  const location = useLocation()
  const sp = new URLSearchParams(location.search)

  //JSON으로 변환
  const data = Object.fromEntries(sp.entries())
  console.log('data : ', data)

  return <div>
      <h2>난 연혁이야</h2>
      <div>쿼리 : {location.search}</div>
      <div>pathname : {location.pathname}</div>
      <div>hash : {location.hash}</div>
      <div>state : {location.state+''}</div>
      <div>key : {location.key}</div>
  </div>
}

function Prod(){
  console.log("Prod 진입")
  return <div>
    <h2>Prod 입니다.</h2>
  </div>
}

function PA(){
  console.log("PA 진입")
  return <div>
    <h2>PA 입니다.</h2>
  </div>
}

function Exam(){
  const data = useParams()
  return <div>
    <h2>Exam 입니다.</h2>
    <div>sid : {data.sid}</div>
  </div>
}

function Gall(){
  return <div>
    <h2>Gall 입니다.</h2>
    <Outlet/>
    {/* Outlet - router 내부에 위치한 컴포넌트  */}
    <hr/>
  </div>
}

function Gspring(){
  return <div>
    <h3>Gall_봄 입니다.</h3>
    
  </div>
}


function Gautumn(){
  return <div>
    <h3>Gall_가을 입니다.</h3>
    
  </div>
}

function Getc(){
  const data = useParams()
  return <div>
    <h3>Gall_나머지 입니다.</h3>
    <div>eee: {data.eee}</div>  
  </div>
}


function P404(){
  return <div>
    <h3>404에러이지요</h3>
    
  </div>
}

function HeaderNav(){
  return <nav>
      <ul>
        <li>
          <a href='/prod'>A태그:제품</a>
          {/* a : url을 새로 입력하여 브라우저 새로고침과 같음 */}
        </li>
        <li>
          <Link to='/'>홈</Link>,   
          {/* Link : url 변경하면서 내부페이지이동 (브라우져 새로고침 안함) */}
          <Link to='/hhii?age=26&pid=aaa#qwer'>연혁</Link>,
          <Link to='/loc'>오시는길</Link>
          <Link to='/prod'>제품</Link>
          <Link to='/prod/aaa'>제품/aaa</Link>
        </li>
        <li>
          <Link to='/exam'>exam</Link>,  {/* 불가 */}
          <Link to='/exam/aaa'>exam/aaa</Link>,
          <Link to='/exam/bbb'>exam/bbb</Link>,
          <Link to='/exam/ccc/ddd'>exam/ccc/ddd</Link>, {/* 불가 */}
        </li>

         <li>
          <Link to='/gall/spring'>봄</Link>, 
          <Link to='/gall/summer'>여름</Link>, 
          <Link to='/gall/autumn'>가을</Link>, 
          <Link to='/gall/winter'>겨울</Link>
        </li>

        <li>
          <Link to='/notice/list'>목록이여</Link>, 
          <Link to='/notice/detail/3'>상세여</Link>, 
          <Link to='/notice/modify/4'>수정</Link>, 
          <Link to='/notice/delete/5'>삭제</Link>
        </li>
      </ul>
  </nav>
}

function App() {

  useEffect(()=>{
    console.log("useEffect 실행")
  })

  return (
    <div>
      <h1>라우터 프로젝트입니다.</h1>
      <BrowserRouter>
        <HeaderNav/>

        <SubRoute/>  
        {/* routes를 가지고 있는 컴포넌트 */}

        <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/hhii' element={<History/>}/>
          <Route path='/loc' element={<Location/>}/>
          <Route path='/prod' element={<Prod/>}/>
          <Route path='/prod/aaa' element={<PA/>}/>

          <Route path='/exam/:sid' element={<Exam/>}/>
          <Route path='/gall' element={<Gall/>}>
              <Route path='spring' element={<Gspring/>}/>
              <Route path='autumn' element={<Gautumn/>}/>
              <Route path=':eee' element={<Getc/>}/>
               
          </Route>

          {/* 404처리 */}
          <Route path='*' element={<P404/>}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
