window.onload = function(){
    //2. dom 이벤트 핸들러
    document.querySelector("img:nth-of-type(2)").onclick = function(){
        alert("이미지 2 눌렀냐?")
    }
    //3. 리스너
    document.querySelector("img:nth-of-type(3)").addEventListener('click',()=>alert("이미지3 눌렀냐?"))

    document.querySelector("img:nth-of-type(4)").onmouseover = function(e){
        console.log("mouseover ", e.clientX, e.clientY)
    }

    document.querySelector("img:nth-of-type(5)").addEventListener(
        'mouseout',
        e=>console.log("mouseout ", e.clientX, e.clientY)
    )

    document.querySelector("img:nth-of-type(6)").onmousemove = function(e){
        console.log("mousemove client", e.clientX, e.clientY)
        console.log("mousemove page", e.pageX, e.pageY)
    }

    document.querySelector("img:nth-of-type(7)").ondblclick = function(){
        console.log("dbclick 이여")
        
    }
    document.querySelector("img:nth-of-type(8)").onmouseup = function(e){
        console.log("mouseup", e.pageX, e.pageY)
        
    }
    document.querySelector("img:nth-of-type(9)").onmousedown = function(e){
        console.log("mousedown", e.pageX, e.pageY)
        
    }

    document.querySelector("img:nth-of-type(10)").onwheel = function(e){
        //console.log("onwheel", e)
        console.log("onwheel", e.deltaY) //휠방향 (+ / -)
        
    }

    document.querySelector("input:nth-of-type(1)").onfocus = function(){
        console.log("focus")   
    }
    document.querySelector("input:nth-of-type(2)").onblur = function(){
        console.log("blur")   
    }
    document.querySelector("input:nth-of-type(3)").onkeydown = function(e){
        console.log("keydown", e.keyCode)   //한글 인지 X
    }
    document.querySelector("input:nth-of-type(4)").onkeyup = function(e){
        console.log("keyup", e.keyCode)   //한글 인지 X
    }
    document.querySelector("input:nth-of-type(5)").onkeypress = function(e){
        console.log("keypress", e.keyCode)   //한글 인지 X
    }

    document.querySelector("select").onchange = function(){
        console.log("change", this.value)   
    }

    // 배열이어서 직접 이벤트 설정 불가
    // document.querySelectorAll("input[type=radio]").onchange = function(){
    //     console.log("radio change", this.value)   
    // }

    //각각의 원소에 이벤트설정
    for (const rr of document.querySelectorAll("input[type=radio]")) {
        rr.onchange = function(){
            console.log("radio change", this.value)   
        }
    }
    window.onresize = function(){
        console.log("resize", this.innerWidth, this.innerHeight )   
    }

        document.querySelector(".box").onscroll = function(){
        console.log("scroll", this.scrollTop, this.scrollHeight)   
    }

}
function cc0(){
    alert("cc0 눌렀냐?")
}