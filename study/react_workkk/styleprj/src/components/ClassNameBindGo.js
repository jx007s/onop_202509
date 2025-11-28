import cnst from '../styles/classnames.module.scss'
import classNames from 'classnames'
import cnbind from 'classnames/bind'

// cnst ==> classnames/bind 로 묶어서 사용
// cnst의 스타일 정의를 문자열로 호출할 수 있다
const cx = cnbind.bind(cnst)

function ClassNameBindGo(props) {
    return (
        <div>
            <h1>ClassNameBindGo</h1>
            <div className={cnst.aaa}>aaa</div>
            <div className={cnst.bbb}>bbb</div>
            {/* classNames(`${cnst.aaa}`, `${cnst.bbb}`)  문자열 여러개 결합 */}
            <div className={classNames(`${cnst.aaa}`, `${cnst.bbb}`)}>aaa+bbb 1</div>

            {/* bind 를 이용하여 문자열로 스타일 가져오기 */}
            <div className={cx('aaa','bbb')}>aaa+bbb 2</div>
            {/* 문자열 형태인 변수, props, state를 사용가능 */}
            <div className={cx('aaa',props.st)}>aaa+ccc</div>

            <div className={cx('aaa',{'bbb':true})}>aaa+ bbb:true</div>
            <div className={cx('aaa',{'bbb':false})}>aaa+ bbb:false</div>
        </div>
    );
}

export default ClassNameBindGo;