import { useReducer } from 'react';
import './reduTemp.css'

function redu(state, action){
    action.fn(action.payload)
    return {theme:action.payload}
}


function ReduHeader(props) {

    const [st,  dispatch] = useReducer(redu, {theme:"dark"})
    
    return (
        <header className={st.theme}>
            헤더입니다.
            <button onClick={()=>dispatch({type:'chTheme', payload:'dark', fn:props.parSetTh})}>dark</button>
            <button onClick={()=>dispatch({type:'chTheme', payload:'yellow', fn:props.parSetTh})}>노랑</button>
            <button onClick={()=>dispatch({type:'chTheme', payload:'pink', fn:props.parSetTh})}>핑크</button>
        </header>
    );
}

export default ReduHeader;