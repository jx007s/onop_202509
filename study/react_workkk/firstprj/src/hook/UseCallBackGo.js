import { useCallback, useEffect, useRef, useState } from 'react';


function UseCallBackGo(props) {

    const [aa, setAA] = useState(0)
    const [bb, setBB] = useState(100)

    const fn_1 = ()=>{        
        console.log("fn_1 실행")
    }

    const fn_2 = useCallback(()=>{        
        console.log("fn_2 실행 ")
    },[])   // 결합시 생성후 재생성 안함

    const fn_3 = useCallback(()=>{        
        console.log("fn_3 실행 ")
    })      // 렌더링 시 재생성 함

    const fn_4 = useCallback(()=>{        
        console.log("fn_4 실행 ")
    },[bb]) // bb 변경시 재생성 함


    //fn_1()

    //함수 존재 유무 -- useCallBack 으로 함수 재생성 되었는지 파악 불가
    //console.log('fn_1 : ', typeof fn_1 === 'function')
    //console.log('fn_2 : ', typeof fn_2 === 'function')

    // 이전 함수와 현재 함수 비교
    // useRef : 렌더링과 관계없이 유지, 변경가능한 저장소
    //         리렌더링시 이전값 유지
    const myRef = useRef({fn_1, fn_2, fn_3, fn_4})

    // 컴포넌트 결합, 리렌더링시 실행
    useEffect(()=>{
        console.log('useEffect 실행 => 컴포넌트 결합, 리렌더링')
        
        //리렌더링시 이전의 함수와 같은지 확인
        console.log(myRef.current.fn_1 === fn_1 ? 'fn_1 재생성하지 않음' : 'fn_1 재생성됨')
        console.log(myRef.current.fn_2 === fn_2 ? 'fn_2 재생성하지 않음' : 'fn_2 재생성됨')
        console.log(myRef.current.fn_3 === fn_3 ? 'fn_3 재생성하지 않음' : 'fn_3 재생성됨')
        console.log(myRef.current.fn_4 === fn_4 ? 'fn_4 재생성하지 않음' : 'fn_4 재생성됨')
        
        // 확인 후 현재 함수들로 대입 : 다음 렌더링시 현재의 함수와 렌더링 후 함수와 비교하기 위해서
        myRef.current.fn_1 = fn_1
        myRef.current.fn_2 = fn_2
        myRef.current.fn_3 = fn_3
        myRef.current.fn_4 = fn_4
    })

    // 컴포넌트 결합시에만 실행
    // useEffect(()=>{
    //     console.log('useEffect 실행 => 컴포넌트 결합')
    //     myRef.current = {fn_1, fn_2}  //컴포넌트 결합시에만 myRef 에 fn2 를 저장
    // },[])


    return (
        <div>
            <h1>UseCallBackGo 입니다.</h1>
            <div>aa:{aa}</div>
            <div>bb:{bb}</div>
            <button onClick={()=>setAA(aa+1)}>aa증가</button>
            <button onClick={()=>setBB(bb+1)}>bb증가</button>
        </div>
    );
}

export default UseCallBackGo;