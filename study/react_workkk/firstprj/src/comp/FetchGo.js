import React from 'react';

function FetchGo(props) {

    function getGo(){
        console.log('getGo 실행')

         fetch('http://192.168.0.78:5000/test1')    //ip로 직접작성해야 프론트앤드서버에 다른 컴퓨터에서 접근해도 정상처리됨
                                                    //http://localhost:5000/test1 로 하지 말것
            .then(answer=>{
                console.log('정상 : ',answer.ok, answer.status)
                //console.log('text() : ',answer.text())
                return answer.text()  // Promise 처리 -> 다음 then 으로 리턴하여 확인
            })
            .then(data=>{
                console.log('data : ',data)
            })
            .catch(err=>{
                console.log('에러 : ',err.message)
            })
    }

    return (
        <div>
            <h1>FetchGo 입니다.</h1>
            <button onClick={getGo}>get</button>
        </div>
    );
}

export default FetchGo;