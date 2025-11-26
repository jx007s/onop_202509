import {BrowserRouter, Link, Route, Routes, useLocation} from 'react-router-dom'
import Location from './components/Location';
function Home(){
  return <div>
      <h2>홈이지롱</h2>
  </div>
}

function History(){

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
  return <div>
    <h2>Prod 입니다.</h2>
  </div>
}

function PA(){
  return <div>
    <h2>PA 입니다.</h2>
  </div>
}

function HeaderNav(){
  return <nav>
      <ul>
        <li>
          <Link to='/'>홈</Link>,
          <Link to='/hhii?age=26&pid=aaa#qwer'>연혁</Link>,
          <Link to='/loc'>오시는길</Link>
          <Link to='/prod'>제품</Link>
          <Link to='/prod/aaa'>제품/aaa</Link>
        </li>
        <li>
          <Link to='/exam'>exam</Link>,
          <Link to='/exam/aaa'>exam/aaa</Link>,
          <Link to='/exam/bbb'>exam/bbb</Link>,
          <Link to='/exam/ccc/ddd'>exam/ccc/ddd</Link>,
        </li>
      </ul>
  </nav>
}

function App() {
  return (
    <div>
      <h1>라우터 프로젝트입니다.</h1>
      <BrowserRouter>
        <HeaderNav/>

        <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/hhii' element={<History/>}/>
          <Route path='/loc' element={<Location/>}/>
          <Route path='/prod' element={<Prod/>}/>
          <Route path='/prod/aaa' element={<PA/>}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
