function wefwef(){

    function fn_1(){
        alert('fn_1 눌렀구만?')
        console.log('fn_1 실행')
    }
    function fn_2(){
        let ret = window.confirm('누를꺼야?')
        console.log('fn_2 실행',ret)
    }

    function inputtt(e){
        console.log('inputtt 실행',e.target.value)
    }

    function changeee(e){
        console.log('changeee 실행',e.target.value)
    }

    return <>
        <h1>이벤트입니다.</h1>
        <button onClick={fn_1}>클릭</button>
        <button onDoubleClick={fn_2}>더블클릭</button>
        <button onClick={()=>alert('경고창 눌렀구만?')}>경고창</button>

        <div style={{
            width:'200px',
            height:'200px',
            backgroundColor:'#ff0'
        }}
        onMouseEnter={(e)=>{console.log('마우스 Enter', e.clientX, e.clientY)}}
        onMouseLeave={(e)=>{console.log('마우스 Leave', e.clientX, e.clientY)}}
        onMouseDown={(e)=>{console.log('마우스 Down', e.clientX, e.clientY)}}
        onMouseUp={(e)=>{console.log('마우스 Up', e.clientX, e.clientY)}}
        onMouseMove={(e)=>{console.log('마우스 Move', e.clientX, e.clientY)}}
        >마우스움직임</div>

        <input 
        onInput={inputtt}  //입력시 호출
        onChange={changeee} //변경시
        onFocus={()=>{console.log('인풋에 커서 들어옴')}}
        onBlur={()=>{console.log('인풋에 커서 나감')}}
        />
    </>
}

export default wefwef