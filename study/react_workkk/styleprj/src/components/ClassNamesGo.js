import cn from '../styles/classnames.module.scss'
import classNames from 'classnames'

function ClassNamesGo(props) {
    const ca = `${cn.aaa}`
    return (
        <>
           <h1>ClassNamesGo 입니다</h1> 
           <div className={cn.aaa}>aaa</div>
           <div className={cn.bbb}>bbb</div>
           <div className={cn.ccc}>ccc</div>
           <div className={`${cn.aaa} ${cn.bbb}`}>aaa+bbb 1</div>

           {/* classNames(`${cn.aaa}`, `${cn.bbb}`)  문자열 여러개 결합 */}
           <div className={classNames(`${cn.aaa}`, `${cn.bbb}`)}>aaa+bbb 2</div>
            {/* 문자열 , 배열 결합 */}
           <div className={classNames([`${cn.aaa}`, `${cn.bbb}`], `${cn.ccc}`)}>aaa+bbb+ccc</div>

           {/*  변수 */}
           <div className={classNames(ca)}>aaa 변수 ca</div>

           {/*  변수 + 조건 */}
           <div className={classNames({[ca]:true})}> aaa 변수+조건 true</div>
           <div className={classNames({[ca]:false})}> aaa 변수+조건 false</div>
        </>
        
    );
}

export default ClassNamesGo;