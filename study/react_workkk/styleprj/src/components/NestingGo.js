import ns from '../styles/nest.module.scss'

function NestingGo(props) {
    return (
        <div>
            <h1>NestingGo 입니다</h1>
            <section>section이지롱
                <div>div 1</div>
            </section>
            <div>div 2</div>
            <div className={ns.aaa}>
                aaa 입니다
                <span>span 입니다.</span>
                <div className={ns.bbb}>bbb입니다</div>
                <div className={ns.ccc}>ccc입니다</div>
            </div>
            {/* className={`${ns.aaa} ${ns.ccc}`}  ==>   class='aaa ccc' :  aaa 이면서 ccc */}
            <div className={`${ns.aaa} ${ns.ccc}`}>aaa ccc입니다</div>
            <div className={ns.ddd}>ddd입니다
                <div className={ns.fff}>ddd {'>'} fff입니다</div>   
            </div>
            <div className={ns.eee}>eee입니다</div>
            <div className={ns.fff}>fff입니다</div>
            <div className={ns.dddggg}>dddggg입니다</div>
        </div>
    );
}

export default NestingGo;