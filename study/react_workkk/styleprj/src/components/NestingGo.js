import ns from '../styles/nest.module.scss'

function NestingGo(props) {
    return (
        <div>
            <h1>NestingGo 입니다</h1>
            <section>section이지롱
                <div>div 1</div>
            </section>
            <div>div 2</div>
        </div>
    );
}

export default NestingGo;