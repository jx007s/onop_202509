import React, { useContext } from 'react';
import './ConTemp.css'
import {MyContext } from "../TempContext";

function ConFooter(props) {
    const myContext = useContext(MyContext)
    console.log(myContext.theme)
    return (
        <footer className={myContext.theme}>
            푸터이지롱
        </footer>
    );
}

export default ConFooter;