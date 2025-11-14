function zxcv(){
/*
Exam.js 를 생성하고
이름, 국어,영어,수학,총점,평균,등급을 출력하세요

*/
    let pname = '한가인'
    let kor = 78, eng = 82, mat = 64
    let tot = kor + eng + mat
    let avg = tot / 3
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
    return (
        <>
            <h2>시험</h2>
            <section>
                <div>이름</div><div>{pname}</div>
            </section>
            <section>
                <div>국어</div><div>{kor}</div>
            </section>
            <section>
                <div>영어</div><div>{eng}</div>
            </section>
            <section>
                <div>수학</div><div>{mat}</div>
            </section>
            <section>
                <div>총점</div><div>{tot}</div>
            </section>
            <section>
                <div>평균</div><div>{avg}</div>
            </section>
            <section>
                <div>등급</div><div>{grade()}</div>
            </section>
        </>
    )
}

export default zxcv