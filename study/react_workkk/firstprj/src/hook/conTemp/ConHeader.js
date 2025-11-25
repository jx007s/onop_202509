import { useContext } from 'react';
import './ConTemp.css'
import {MyContext } from "../TempContext";

function ConHeader(props) {
    const myContext = useContext(MyContext)
    console.log(myContext.theme)
    return (
        <header className={myContext.theme}>
            헤더입니다.
            <button onClick={()=>myContext.setTheme('dark')}>dark</button>
            <button onClick={()=>myContext.setTheme('yellow')}>노랑</button>
            <button onClick={()=>myContext.setTheme('pink')}>핑크</button>
        </header>
    );
}

export default ConHeader;