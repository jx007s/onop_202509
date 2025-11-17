import poster from '../fff/one.jpg'
import '../fff/NovDiary.css'

    let titles = '일,월,화,수,목,금,토'.split(',')

    let titleArr = titles.map((vv,kk)=><div key={kk}>{vv}</div>)
    let firstArr = []

    for (let index = 0; index < 6; index++) {
        firstArr.push(<div></div>)
        
    }

    let dateArr = []

    for (let i = 1; i <=30; i++) {
        dateArr.push(<div>{i}</div>)
        
    }

function huioqweff(){


    return <section>
        <img src={poster}/>
        <h1>2025년 11월</h1>
        <div className='title'>
            {titleArr}
        </div>
        <div className='dates'>
            {firstArr}
            {dateArr}  
        </div>
    </section>
}

export default huioqweff