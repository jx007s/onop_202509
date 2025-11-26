import { useMemo, useState } from 'react';

function UseMemoGo(props) {

    const [list, setList] = useState([11,22,33,44])
    const [num, setNum] = useState(10)

    function numChange(e){
        console.log('numChange 실행', e.target.value)
        setNum(e.target.value)
    }

    function listAdd(){
        console.log('listAdd 실행')
        
        setList([...list, 88])
    }
    function goToT(){
        console.log("goTOT 실행")

        let ret = 0
        for (const i of list) {
            ret += i
        }
        return ret
    }

    //let tot = goToT()
    //      useMemo( 실행할함수,  [내용변경시 함수실행할 변수]) 
    //       list 변경시 goToT 실행
    //       num 변경시에는 goToT 실행안함
    let tot = useMemo(goToT, [list])

    return (
        <div>
            <h1>UseMemoGo입니다</h1>
            <div>num <input value={num} onChange={numChange}/></div>
            <div>list :{list.join(',')}</div>
            <button onClick={listAdd}>list 추가</button>
            <div>tot :{tot}</div>
        </div>
    );
}

export default UseMemoGo;