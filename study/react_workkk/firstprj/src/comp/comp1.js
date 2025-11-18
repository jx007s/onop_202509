import Qwer from './aaa/qwer'
import Erty from './aaa/asdf'

let arr = []
for (let i = 0; i <5; i++) {
    arr.push(<Erty/>)
}

function wefweff(){

    return <>
        <h1>컴포넌트1입니다.</h1>
        <Qwer/> {/* wqefwef() 실행됨 */}
        <Qwer/> {/* wqefwef() 실행됨 */}
        <Erty/>
        <Erty/> {/* 
        new BBB() 생성 및
        BBB.render() 실행됨  */}

        <hr/>
        {arr}
    </>
}

export default wefweff