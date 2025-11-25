import {TempContext } from "./TempContext";
import ConHeader from "./conTemp/ConHeader";
import ConSide from "./conTemp/ConSide";
import ConMain from "./conTemp/ConMain";
import ConFooter from "./conTemp/ConFooter";

function ContextTemp(props) {
    return (
        <div>
            <h1>ContextTemp 입니다</h1>
            <TempContext>
                <ConHeader/>
                <ConSide/>
                <ConMain/>
                <ConFooter/>

            </TempContext>
        </div>
    );
}

export default ContextTemp;