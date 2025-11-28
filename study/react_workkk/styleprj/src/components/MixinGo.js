import ms from '../styles/mixin.module.scss'

function MixinGo(props) {
    return (
        <div>
            <h1>MixinGo 입니다</h1>
            <div className={ms.aaa}>aaa</div>
            {/* aaa:  mixin 정의를 직접 클래스 사용 안함 */}
            <div className={ms.bbb}>bbb
                <div></div>
            </div>
            <div className={ms.ccc}>ccc</div>
            <div className={ms.ddd}>ddd</div>
            <div className={ms.eee}>eee</div>
            <div className={ms.ggg}>ggg</div>
            <div className={ms.hhh}>hhh</div>
            <div>
                <div className={ms.iii}>iii 1</div>
                <div className={ms.iii}>iii 2</div>
                <div className={ms.iii}>iii 3</div>
                <div className={ms.iii}>iii 4</div>
            </div>
        </div>
    );
}

export default MixinGo;
