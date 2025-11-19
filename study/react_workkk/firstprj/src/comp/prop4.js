import PropFunc from './prop/propFunc'

function weffwef(){
    return <>
        <h1>함수형 props 입니다.</h1>
        <PropFunc pname='박보검' age={33} marriage={false}/>
        <PropFunc pname='박보창' marriage={false}/>
        <PropFunc pname='박보총' age={27}/>
        <PropFunc age={43} marriage={false}/>
    </>
}

export default weffwef