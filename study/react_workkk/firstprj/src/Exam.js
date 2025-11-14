import './exam.css'

function zxcv(){
/*
Exam.js 를 생성하고
이름, 국어,영어,수학,총점,평균,등급을 출력하세요

*/
    let pname = '한가인'
    let kor = 78, eng = 82, mat = 64
    let tot = kor + eng + mat
    let avg = Math.round( tot / 3)
    function grade(){
        let ret
        if(avg>=90){
            ret = '수'
        }else if(avg>=80){
            ret = '우'
        }else if(avg>=70){
            ret = '미'
        }else if(avg>=60){
            ret = '양'
        }else{
            ret = '가'
        }
        return ret
    }

    let sectionSt = {
        textAlign:'center',
        width : '200px',
        height:'50px',
        border:'1px solid #ccc',
        lineHeight:'50px',
    }
  


    return (
        <>
            <h2>시험</h2>
            <section style={sectionSt}>
                <div>이름</div><div className="vvSt">{pname}</div>
            </section>
            <section style={sectionSt}>
                <div>국어</div><div className="vvSt">{kor}</div>
            </section>
            <section style={sectionSt}>
                <div>영어</div><div className="vvSt">{eng}</div>
            </section>
            <section style={sectionSt}>
                <div>수학</div><div className="vvSt">{mat}</div>
            </section>
            <section style={sectionSt}>
                <div>총점</div><div className="vvSt">{tot}</div>
            </section>
            <section style={sectionSt}>
                <div>평균</div><div className="vvSt">{avg}</div>
            </section>
            <section style={sectionSt}>
                <div>등급</div><div className="vvSt">{grade()}</div>
            </section>
        </>
    )
}

export default zxcv