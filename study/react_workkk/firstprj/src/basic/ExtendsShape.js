class Shape{

    constructor(name){
        this.name = name
    }

    ppp(k){
        return <div key={k}> {this.name} : {this.area} , {this.border}</div>
    }
}

class Rec extends Shape{
    constructor(w,h){
        super('직사각형')
        this.area = w * h
        this.border = (w + h) *2
    }
}

class Circle extends Shape{
    constructor(r){
        super('원')
        this.area = r**2 * Math.PI
        this.border = r * 2 * Math.PI
    }
}

let shapes = [
    new Rec(5,6),
    new Circle(5),
    new Rec(10,10),
    new Circle(10),
]


function weffwefwef(){

    return <>
        <h1>상속 도형입니다.</h1>
        {shapes.map((v,k)=>v.ppp(k))}
    </>
}

export default weffwefwef