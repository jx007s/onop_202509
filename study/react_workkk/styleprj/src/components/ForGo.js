import fs from '../styles/for.module.scss'

function ForGo(props) {
    return (
        <div>
            <h1>ForGo 입니다</h1>
            <div className={fs.aaa}>aaa 1</div>
            <div className={fs.aaa}>aaa 2</div>
            <div className={fs.aaa}>aaa 3</div>
            <br/>
            <div>
                <div className={fs.bbb}>bbb 1</div>
                <div className={fs.bbb}>bbb 2</div>
                <div className={fs.bbb}>bbb 3</div>{/* 적용안됨 */}
            </div>

            <div>
                <div className={fs.ccc}>ccc 1</div>
                <div className={fs.ccc}>ccc 2</div>
                <div className={fs.ccc}>ccc 3</div>
                <div className={fs.ccc}>ccc 4</div>
            </div>
        </div>
    );
}

export default ForGo;