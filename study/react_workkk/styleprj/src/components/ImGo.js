import is from '../styles/im.module.scss'

function ImGo(props) {
    return (
        <div>
            <h1>ImGo 입니다</h1>
            <div className={is.aaa}>aaa</div>
            <div className={is.bbb}>bbb</div>
            <div className={is.ccc}>ccc</div>
            <div className={is.ddd}>ddd</div>
            <div className={is.eee}>eee</div>
            <div className={is.fff}>fff</div>
        </div>
    );
}

export default ImGo;