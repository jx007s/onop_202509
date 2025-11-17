let studSt = {
    '수': {backgroundColor:'#fa0'},
    '우': {backgroundColor:'#ff0'},
    '미': {backgroundColor:'#0f0'},
    '양': {backgroundColor:'#0ff'},
    '가': {backgroundColor:'#faf'}
}

class Stud{
    constructor(name, kor, eng, mat){
        this.name = name
        this.jum = [kor, eng, mat]
        this.calc()
    }

    calc(){
        this.tot = 0
        for (const j of this.jum) {
            this.tot += j
        }
        this.avg = this.tot / this.jum.length

        if(this.avg >= 90){
            this.grade = '수'
        }else if(this.avg >= 80){
            this.grade = '우'
        }else if(this.avg >= 70){
            this.grade = '미'
        }else if(this.avg >= 60){
            this.grade = '양'
        }else{
            this.grade = '가'
        }
    }

    ppp(kk){
        return <div key={kk}  style={studSt[this.grade]}>
                    <div>이름 : {this.name}</div>
                    <div>점수 : {this.jum}</div>
                    <div>총점 : {this.tot}</div>
                    <div>평균 : {this.avg}</div>
                    <div>등급 : {this.grade}</div>
                </div>
    }
}


function aazzssxx(){
    let arr = [
        new Stud('정우성',77,79,72),
        new Stud('정좌성',67,69,62),
        new Stud('정남성',97,99,92),
        new Stud('정중성',57,59,52),
        new Stud('정북성',87,89,82)
    ]

    // let ppArr = [ 
    //     arr[0].ppp(0),
    //     arr[1].ppp(1),
    //     arr[2].ppp(2),
    //     arr[3].ppp(3),
    //     arr[4].ppp(4)]

    let ppArr = []

    for (const i in arr) {
        ppArr.push(arr[i].ppp(i))
    }

    return <>
        <h1>생성자 학생입니다.</h1>
       {ppArr} {/* 배열은 바로출력가능 */}
    </>
}


export default aazzssxx