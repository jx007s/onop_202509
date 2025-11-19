
class AAA{
    aa = 10
    bb = '아기상어'
    static scc = '스태틱cc'

    fn_1(){  //인스턴스메소드에서 스태틱요소 접근가능
        return <div>AAA.fn_1() : {this.aa}, {this.bb}, {AAA.scc}</div>
    }

    static fn_s1(){
        //스태틱메소드에서 인스턴스 요소 접근 불가
        //return <div>AAA.fn_s1() : {this.aa}, {this.bb}, {AAA.scc}</div>
        return <div>AAA.fn_s1() :  {AAA.scc}</div>
    }

    fn_2(){
        return <div>
            fn_2 시작 ------------------<br/>
            {this.fn_1()}
            {AAA.fn_s1()}
            fn_2 끝 ------------------<br/>
        </div>
    }

    static fn_s2(){
        return <div>
            fn_s2 시작 ------------------<br/>
            {/* {this.fn_1()} static 메소드만 호출 가능*/}
            {AAA.fn_s1()}
            fn_s2 끝 ------------------<br/>
        </div>
    }


    constructor(){
        console.log("AAA 생성자 실행")
    }
}
console.log('AAA.scc', AAA.scc)  //생성하지 않아도 호출 가능
//console.log('AAA.aa', AAA.aa)  //인스턴스 멤버변수는 인스턴스생성이후 접근 가능
let a1 = new AAA()
let a2 = new AAA()

function fwefwef(){

    return <>
        <h1>static 입니다.</h1>
        {a1.fn_1()}
        {a2.fn_1()}
        a1 : {a1.aa}, {a1.bb} ,{a1.scc} <br/>
        {AAA.scc}      
        {/* 스태틱요소는 클래스정의명으로 접근한다.
            인스턴스가 아니므로 생성과 관련이 없음
        */}
        {AAA.fn_s1()}
        {a1.fn_2()}
        {AAA.fn_s2()}
    </>  
}

export default fwefwef