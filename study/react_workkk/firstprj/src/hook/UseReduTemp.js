import React, { useState } from 'react';
import ReduHeader from "./reducerTemp/reduHeader";
import ReduSide   from "./reducerTemp/reduSide";
import ReduMain   from "./reducerTemp/reduMain";
import ReduFooter from "./reducerTemp/reduFooter";

function UseReduTemp(props) {

    const [theme, setTheme] = useState('dark')

    return (
        <div>
            <h1>UseReduTemp 입니다.</h1>
            <ReduHeader theme={theme} parSetTh={setTheme}/>
            <ReduSide theme={theme}/>
            <ReduMain theme={theme}/>
            <ReduFooter theme={theme}/>
        </div>
    );
}

export default UseReduTemp;