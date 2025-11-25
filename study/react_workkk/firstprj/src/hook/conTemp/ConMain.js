import React, { useContext } from 'react';
import './ConTemp.css'
import {MyContext } from "../TempContext";

function ConMain(props) {
    const myContext = useContext(MyContext)
    console.log(myContext.theme)
    return (
        <main className={myContext.theme}>
            메인이지롱
        </main>
    );
}

export default ConMain;