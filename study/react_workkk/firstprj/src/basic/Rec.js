class RecRR{
    azxs(ww, hh){
        this.area = ww * hh
        this.border = (ww + hh) * 2
    }

    ppp(){
        return <div>{this.area} , {this.border}</div>
    }
}

function asdff(){

    let rr1 = new RecRR()
    let rr2 = new RecRR()
    let rr3 = new RecRR()
    rr1.azxs(5,6)
    rr2.azxs(10,10)
    rr3.azxs(20,10)

    return <>
        <h1>직사각형입니다.</h1>
        {rr1.ppp()}
        {rr2.ppp()}
        {rr3.ppp()}
    </>
}

export default asdff
