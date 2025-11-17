class AAA{

    /* 생성자를 정의하지 않은 경우 기본생성자가 생략되어 실행*/
    constructor(asd, bb){  // 생성자의 매개변수는 생성시 매개변수 지정해야 함(함수와 같음)
                            // new AAA(11,22)  asd = 11, bb = 22

        console.log("나가 생성자여",  this.aa, this.bb)
        this.aa = asd   //멤버변수 대입
        this.bb = bb
        this.cc = 1357
    }

    ppp(){
        console.log(this.aa, this.bb, this.cc)
    }
    htmlGo(){
        return <div>{this.aa}, {this.bb}, {this.cc}</div>
    }

    setBB(){
        console.log("setBB 실행")
        return '엄마상어'
    }

    aa = this.setAA()
    bb = this.setBB()

    setAA(){
        console.log("setAA 실행")
        return 5678
    }
}

function qwer(){
    let a1 = new AAA(100,'나는무너')
    let a2 = new AAA(200,'나는고래')
    a1.ppp()
    a2.ppp()
    new AAA(300,'나는전복').ppp()

    let arr = [a1, a2, new AAA(400,'나는고동')]
    return <>
        <h1>생성자 입니다.</h1>
        {a1.htmlGo()}
        {a2.htmlGo()}
        <hr/>
        {arr[0].htmlGo()}
        {arr[1].htmlGo()}
        {arr[2].htmlGo()}
    </>
}

export default qwer

/*
ConstStud.js 를 생성하고
학생클래스를 정의, 생성자를 사용하여 5명의 학생정보를 출력하세요
단, 
수 :  주황
우 :  노랑
미 :  녹색
양 :  하늘
가 :  핑크
배경색으로 처리하세요

*/