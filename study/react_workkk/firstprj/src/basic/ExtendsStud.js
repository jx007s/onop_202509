class Stud{

    totCalc(){
        this.tot = 0
        for (const j of this.jum) {
            this.tot += j
        }
    }

    ppp(i){
        return <div key={i}>{this.kind} {this.name} {this.tot} {this.avg}</div>
    }
}

class GenStud extends Stud{
    constructor(name, kor, eng, mat){
        super() //부모생성자 --> 자식클래스에서 생성자를 명시할 경우 부모생성자 필수 지정해야 한다.
        this.kind = '일반'
        this.name = name
        this.jum = [kor, eng, mat]
        this.totCalc()
        this.calc()
    }
    calc(){
        
        this.avg = this.tot / this.jum.length
    }
}

class ArtStud extends Stud{
    constructor(name, kor, eng, mat, art){
        super() //부모생성자 --> 자식클래스에서 생성자를 명시할 경우 부모생성자 필수 지정해야 한다.
        this.kind = '예능'
        this.name = name
        this.jum = [kor, eng, mat, art]
        this.totCalc()
        this.calc()
    }
    calc(){
        
        this.avg = 0
        let rate = [0.05,0.1,0.15,0.7]
        for (const j in this.jum) {
            this.avg += this.jum[j] * rate[j]
        }
        
    }
}



let sts = [
    new GenStud('차은우',38,69,92), 
    new ArtStud('차동우',38,59,72,94), 
    new GenStud('차철우',98,69,32), 
    new ArtStud('차금우',98,79,52,34)
]

function wefef(){

    return <>
        <h1>상속 학생입니다.</h1>
        {/* {sts[0].ppp()}
        {sts[1].ppp()}
        {sts[2].ppp()}
        {sts[3].ppp()} */}
        {sts.map((v,k)=>v.ppp(k))}
    </>
}

export default wefef


/*
부모클래스 - 도형
도형이름, 넓이, 둘레

자식클래스 - 직사각형, 원

직사각형2, 원3  정보출력하세요
*/