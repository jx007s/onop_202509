import React, { useReducer } from 'react';

import rrr from './ReducerFunc'

function UseReducerGo(props) {
                                // rrr : 리듀서로 사용할 함수
                                // {vvv:0} : 리듀서(state 로 작동)의 기본값 --> rrr의 리턴형태를 유지
    const [bbb,fn_2] = useReducer(rrr, {vvv:9988})
    return (
        <div>
            <h1>UseReducerGo</h1>
            <div>bbb.vvv : {bbb.vvv}</div> 
            {/* 함수를 실행하지 않으면  qwer.vvv ==> 초기값 0 출력 */}

            <button onClick={()=>fn_2('ppp')}>증가</button>
            {/* asdf('ppp')  ==>  rrr() 
                acttt = 'ppp'
                stst = {vvv: 0}

                실행 이후  <div>qwer.vvv : {qwer.vvv}</div> 의 
                {qwer.vvv} 값 변경  --> 리랜더링(state로 작동)
            */}

            <button onClick={()=>fn_2('mmm')}>감소</button>
            <button onClick={()=>fn_2('기본')}>기본</button>
        </div>
    );
}

export default UseReducerGo;