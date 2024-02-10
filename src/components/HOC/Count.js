import { useState } from "react";
import WithCounter from "./WithCounter";
import WithName from "./WithName";

const Count = (props) => {
    const {count,incrementCounter,name} = props

    return <div style={{padding:"100px"}}>
            <button onClick={incrementCounter}>Click Me</button>
            <p>name:{name}</p>
            <p>{count}</p>
        </div>
}

// export default WithCounter(Count);
//lets wrap this Count compoennt with WithCounter HOC as well as WithName Hoc also it might create name
//colliosion if props have same name
export default WithName(WithCounter(Count));
//if multiple HOC are getting applied on a single compoentn , and if they have same prop name it will clash with each other 
// and this problem is known as prop collision or name collision