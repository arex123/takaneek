import React from "react";
class Classcomponent extends React.Component{

    constructor(){
        console.log("Hello from constructor ")
        super()
        this.state={
            fname:"adi"
        }
    }

    static getDerivedStateFromProps(props,state){ 
        //this function gets invoked before render cycle, and it gives opportunity to update
        //state based on changes in props

        console.log("inside getderivedstatefromprops method")
        // return null
        return {
            fname:props.defaultName
        }


    }

    componentDidMount(){
        console.log("component Did Mount"); //gets called after very first render, for side effect or adding timers/listerner

        //calling api
        // fetch("https://fakestoreapi.com/products").then((res)=>res.json()).then((json)=>this.setState({products:json}))

        fetch("https://fakestoreapi.com/products")
        .then((res)=>res.json())
        .then((json)=>this.setState({products:json}))
    }

    render(){
        console.log("inside render");
        console.log("data",this.state.products )
        return (
            <div>Lifecycle name:{this.state.fname}</div>
        )
    }

}

export default Classcomponent;