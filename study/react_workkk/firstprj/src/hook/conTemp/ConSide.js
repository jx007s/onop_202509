import React, { useContext } from 'react';
import './ConTemp.css'
import {MyContext } from "../TempContext";

function ConSide(props) {
    const myContext = useContext(MyContext)
    console.log(myContext.theme)
    return (
        <aside className={myContext.theme}>
            사이드이지롱
        </aside>
    );
}

export default ConSide;