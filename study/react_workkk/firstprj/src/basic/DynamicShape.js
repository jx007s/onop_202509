class Shape{

    constructor(name){
        this.name = name
    }
    calc(){}

    ppp(k){
        //this.calc()
        return <div key={k}> {this.name} : {this.area} , {this.border}</div>
    }
}

class Rec extends Shape{
    constructor(w,h){
        super('직사각형')
        this.w = w
        this.h = h
        
    }
    calc(){
        this.area = this.w * this.h
        this.border = (this.w + this.h) *2
    }
}

class Circle extends Shape{
    constructor(r){
        super('원')
        this.r = r
    }

    calc(){
        this.area = this.r**2 * Math.PI
        this.border = this.r * 2 * Math.PI
    }
}

let shapes = [
    new Rec(5,6),
    new Circle(5),
    new Rec(10,10),
    new Circle(10),
]

for (const sh of shapes) {
    sh.calc()
}


function weffwefwef(){

    return <>
        <h1>다형성 도형입니다.</h1>
        {shapes.map((v,k)=>v.ppp(k))}
    </>
}

export default weffwefwef