import { useState } from "react";
import WithCounter from "./WithCounter";

const Count = (props) => {
    const {count,incrementCounter} = props

    return <div style={{padding:"100px"}}>
            <button onClick={incrementCounter}>Click Me</button>
            <p>{count}</p>
        </div>
}

export default WithCounter(Count);