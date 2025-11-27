import {BrowserRouter,Routes, Route, Outlet, Link, useNavigate} from 'react-router-dom'
import './App.css';
import { useEffect } from 'react';

function HeaderGo(){
  return <header> 헤더여
          <Link to='info/hello'>회사소개</Link>
          <Link to='gall/chang'>갤러리</Link>
          <Link to='center/notice'>고객센터</Link>
  </header>
}
function Info(){
  return <>
            <aside> 회사소개
                <div><Link to='/info/hello'>회사소개</Link></div>
                <div><Link to='/info/history'>연혁</Link></div>
                <div><Link to='/info/location'>오시는길</Link></div>
            </aside>
            <Outlet/>
          </>
}
function Hello(){
  return <main> 인사말입니다.</main>
}
function History(){
  return <main> 연혁입니다.</main>
}
function Location(){
  return <main> 오시는길 입니다.</main>
}

function Gall(){
  return <>
            <aside> 갤러리
                <div><Link to='/gall/chang'>창원</Link></div>
                <div><Link to='/gall/ma'>마산</Link></div>
                <div><Link to='/gall/jin'>진해</Link></div>
            </aside>
            <Outlet/>
          </>
}
function Chang(){
  return <main> 창원입니다.</main>
}
function Ma(){
  return <main> 마산입니다.</main>
}
function Jin(){
  return <main> 진해입니다.</main>
}


function Center(){
  return <>
            <aside> 고객센터
                <div><Link to='/center/notice'>공지사항</Link></div>
                <div><Link to='/center/one'>1:1문의</Link></div>
            </aside>
            <Outlet/>
          </>
}
function Notice(){
  return <main> 공지사항입니다.</main>
}
function One(){
  return <main> 1:1문의 입니다.</main>
}
function FooterGo(){
  return <footer> 이광재 만세</footer>
}

// npx create-react-app 프로젝트명(영문소문자숫자)
function Home(){

  // redirect 하기 위한 함수
  const navigate = useNavigate()

  // 컴포넌트 마운트 이후 navigate 실행
  // 무한반복 방지
  useEffect(()=>{

    navigate("info/hello")   // redirect
  },[navigate])

  return null
}
function App() {
  return <BrowserRouter>
    <HeaderGo/>
    <Routes>
      <Route path='/' element={<Home/>}/>
      <Route path='/info' element={<Info/>}>
          <Route path='hello' element={<Hello/>}/>
          <Route path='history' element={<History/>}/>
          <Route path='location' element={<Location/>}/>
      </Route>
      <Route path='/gall' element={<Gall/>}>
          <Route path='chang' element={<Chang/>}/>
          <Route path='ma' element={<Ma/>}/>
          <Route path='jin' element={<Jin/>}/>
      </Route>
      <Route path='/center' element={<Center/>}>
          <Route path='notice' element={<Notice/>}/>
          <Route path='one' element={<One/>}/>
          
      </Route>
    </Routes>
    <FooterGo/>
  </BrowserRouter>
}

export default App;
