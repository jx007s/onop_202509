
class Par{
    aa = '부모aa'
    bb = '부모bb'

    fn_1(){
        return <div>부모fn_1() {this.aa} {this.bb}</div>
    }
    fn_2(){
        return <div>부모fn_2() {this.aa} {this.bb}</div>
    }
    fn_tot(){
        return <div>
            부모 fn_tot 시작 
            {this.fn_1()}
            부모 fn_tot 끝
        </div>
    }
}

class Child extends Par{
    aa = '자식aa'  //hiding(숨김) : 부모멤버변수를 숨김(자신의 멤버로 호출)
    cc = '자식cc'

    fn_1(){     //overriding(재정의) : 부모메소드와 동일한 이름으로 메소드 재정의
        return <div>자식fn_1() {this.aa} {this.bb} {this.cc}</div>
    }
    fn_3(){
        return <div>자식fn_3() {this.aa} {this.bb} {this.cc}</div>
    }
}

let pp = new Par()
let cc = new Child()

function wefwefwe(){

    return <>
        <h1>재정의</h1>
        부모 :  {pp.aa}, {pp.bb}
        {pp.fn_1()} {pp.fn_2()} {pp.fn_tot()}
        <hr/>
        자식 :  {cc.aa}, {cc.bb}, {cc.cc}
        {cc.fn_1()} {cc.fn_2()} {cc.fn_3()} {cc.fn_tot()}
    </>
}

export default wefwefwe