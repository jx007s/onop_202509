
//1. 클래스 정의
/*
class 클래스명{
    
    멤버변수,
    메소드
}

*/
class AAA{
    a = 10      //멤버변수 선언
    b = "아기상어"

    meth_1(){   //메소드 정의
        console.log("meth_1 실행")
    }

    meth_2(){   //메소드 정의
        console.log("meth_2 실행")
        return <div>나는무너</div>
    }

    meth_3(){   //메소드 정의
        console.log("meth_3 실행 : "+this.a+","+this.b)//this : 멤버요소 접근   
    }
    meth_4(){   //메소드 정의
        console.log("meth_4 실행 : "+this.a+","+this.b)//this : 멤버요소 접근 
        return <div>{this.a} , {this.b}</div>  
    }
}

function qqwwee(){
    //2. 인스턴스 변수 선언
    let a1

    //3. 인스턴스 생성 및 대입
    // 생성 : new 클래스생성자()
    a1 = new AAA()

    //2,3 동시 : 인스턴스 변수 선언 = 인스턴스 생성
    let a2 = new AAA()

    console.log('a1 :', a1)

    //4. 멤버요소호출
    console.log('a1.a :', a1.a)
    a1.meth_1()
    a1.meth_3()

    a1.a = 1234
    a2.b = '엄마상어'
    return(
        <>
            <h1>MyClass 입니다</h1>
            {a1.meth_2()}
            {a2.meth_2()}
            <div>{a1.a}</div>
            <div>{a2.a}</div>
            {a1.meth_4()}
            {a2.meth_4()}
        </>
    )
}


export default qqwwee