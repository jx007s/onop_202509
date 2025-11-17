class Sstt{  //큵래스 정의시 클래스명은 대문자로 시작

    // name = ''
    // jum = []
    // tot = 0
    // avg = 0

    initGo(name, kor, eng, mat){
        this.name = name            // 메소드 내에서 this를 이용하여 멤버 변수 선언 가능
        this.jum = [kor, eng, mat]
        this.calc()
    }

    calc(){
        this.tot = 0
        for (const j of this.jum) {
            this.tot += j
        }
        this.avg = this.tot / this.jum.length
    }

    ppp(){
        return <div>
                    <div>이름 : {this.name}</div>
                    <div>점수 : {this.jum}</div>
                    <div>총점 : {this.tot}</div>
                    <div>평균 : {this.avg}</div>
                </div>
    }
}


function qqq(){

    let st1 = new Sstt()
    st1.initGo('현빈',78,67,91)
    //st1.calc()
    console.log(st1)

    let st2 = new Sstt()
    st2.initGo('원빈',98,27,98)

    return (
        <>
            <h1>학생이지롱</h1>
            {st1.ppp()}
            <hr/>
            {st2.ppp()}
        </>
    )
}

export default qqq

/*
Rec.js 파일을 생성하고
직사각형의 가로, 세로를 입력받아 넓이, 둘레를 출력하세요
직사각형 3개 출력(클래스로 처리)


*/