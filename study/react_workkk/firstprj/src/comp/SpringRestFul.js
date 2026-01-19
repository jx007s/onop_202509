import React, { useEffect, useState } from 'react';

function SpringRestFul(props) {

    const [data, setData] = useState("처음이지롱");

    useEffect(()=>{
        fetchData()
    },[])

    const fetchData=()=>{
         fetch('http://192.168.0.78/rest/per')    //ip로 직접작성해야 프론트앤드서버에 다른 컴퓨터에서 접근해도 정상처리됨
                                                    //http://localhost:5000/rest/per 로 하지 말것
            .then(answer=>{
                console.log('정상 : ',answer.ok, answer.status)
                //console.log('text() : ',answer.text())
                return answer.text()  // Promise 처리 -> 다음 then 으로 리턴하여 확인
            })
            .then(dd=>{
                console.log('data : ',dd)
                setData(dd)
            })
            .catch(err=>{
                console.log('에러 : ',err.message)
            })


    }


    return (
        <div>
            <h1>리액트 프론트페이지</h1>
            {data}
        </div>
    );
}

export default SpringRestFul;