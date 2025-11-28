import fs from '../styles/for.module.scss'

function ForGo(props) {
    return (
        <div>
            <h1>ForGo 입니다</h1>
            <h3>for through</h3>
            <div className={fs.aaa}>aaa 1</div>
            <div className={fs.aaa}>aaa 2</div>
            <div className={fs.aaa}>aaa 3</div>
            <h3>for to</h3>
            <div>
                <div className={fs.bbb}>bbb 1</div>
                <div className={fs.bbb}>bbb 2</div>
                <div className={fs.bbb}>bbb 3</div>{/* 적용안됨 */}
            </div>

            <h3>인덱스배열-each</h3>
            <div>
                <div className={fs.ccc}>ccc 1</div>
                <div className={fs.ccc}>ccc 2</div>
                <div className={fs.ccc}>ccc 3</div>
                <div className={fs.ccc}>ccc 4</div>
            </div>
            <h3>키배열-each</h3>
            <div className={fs.qq}>qq</div>
            <div className={fs.ee}>ee</div>
            <div className={fs.rr}>rr</div>

            <h3>배열 행렬-each</h3>
            <div className={fs.tt}>tt</div>
            <div className={fs.yy}>yy</div>
            <div className={fs.uu}>uu</div>

            <h3>while</h3>
            <div className={fs.ddd_10}>ddd_10</div>
            <div className={fs.ddd_30}>ddd_30</div>
            <div className={fs.ddd_50}>ddd_50</div>
            <div className={fs.ddd_70}>ddd_70</div>
            <div className={fs.ddd_90}>ddd_90</div>
        </div>
    );
}

export default ForGo;