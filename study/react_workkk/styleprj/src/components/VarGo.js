import React from 'react';
import '../styles/aaa.scss'
import bm from '../styles/bbb.module.scss'
import cm from '../styles/ccc.module.scss'
import '../styles/ddd.scss'

function VarGo(props) {
    return (
        <div>
            <h1>VarGo 입니다.</h1>
            <div className='box1'>box1 이지</div>
            <div className={bm.box2}>box2 이지</div>
            <div className={bm.box3}>box3 이지</div>
            <div className={bm.box4}>box4 이지</div>
            <div className={cm.box1}>box11 이지</div>
            <div className={cm.box2}>box22 이지</div>
        </div>
    );
}

export default VarGo;