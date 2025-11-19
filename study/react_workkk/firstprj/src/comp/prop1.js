import PC from './prop/propClass'

function weffwe(){

    return <>
        <h1>props 입니다.</h1>
        {/* 문자열 :''  숫자 및 자료형 : {} */}
        <PC age ={53} >장수풍뎅이</PC>
        {/* 장수풍뎅이 ==> props.children 으로 대입 */}
        <PC pname='정좌성' marriage={false} />

        <PC pname={1234} age ='마흔' />
    </>
}

export default weffwe