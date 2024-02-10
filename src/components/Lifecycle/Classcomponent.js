import React from "react";
class Classcomponent extends React.Component{

    constructor(){
        console.log("Hello from constructor ")
        super()
        this.state={
            fname:"adi"
        }
    }

    render(){
        return (
            <div>Lifecycle</div>
        )
    }

}

export default Classcomponent;