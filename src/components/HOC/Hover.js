import { useState } from "react";
import WithCounter from "./WithCounter";

const Hover = (props) => {
    const {count,incrementCounter} =  props

    return <div style={{padding:"100px"}}>
            <button onMouseOver={incrementCounter}>Hover Me</button>
            <p>{count}</p>
        </div>
}

export default WithCounter(Hover,2);