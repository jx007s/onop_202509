import { createContext, useState } from 'react';

const MyContext = createContext()

function TempContext(props) {

    const [theme, setTheme] = useState('dark')
    return (
        <MyContext.Provider value={{theme, setTheme}}>
            {props.children}
        </MyContext.Provider>
    );
}

export  {TempContext, MyContext};