import { Outlet, Route, Routes, useParams } from 'react-router-dom';

function Notice(){
    return <div>
        <h2>공지사항이여</h2>
        <Outlet/>
    </div>
}

function Nlist(){
    return <div>
        <h3>목록이지</h3>
    </div>
}
function Ndetail(){
    const data = useParams()
    return <div>
        <h3>상세이지</h3>
        <div>no:{data.no}</div>
    </div>
}

function Nrrr(){
    const data = useParams()
    return <div>
        <h3>나머지</h3>
        <div>service:{data.service}</div>
        <div>no:{data.no}</div>
    </div>
}
function SubRoute(props) {
    return (
        <Routes>
            <Route path='/notice' element={<Notice/>}>
                <Route path='list' element={<Nlist/>}/>
                <Route path='detail/:no' element={<Ndetail/>}/>
                <Route path=':service/:no' element={<Nrrr/>}/>
            </Route>            
        </Routes>
    );
}

export default SubRoute;