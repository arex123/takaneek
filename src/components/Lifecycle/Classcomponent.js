import React from "react";
class Classcomponent extends React.Component {

    constructor() {
        console.log("Hello from constructor ")
        super()
        this.state = {
            fname: "adi",
            childShow:true
        }
        this.handleChild = this.handleChild.bind(this);

    }

    static getDerivedStateFromProps(props, state) {
        //this function gets invoked before render cycle, and it gives opportunity to update
        //state based on changes in props

        console.log("inside getderivedstatefromprops method")
        // return null
        return {
            fname: props.defaultName
        }


    }

    componentDidMount() {
        console.log("component Did Mount"); //gets called after very first render, for side effect or adding timers/listerner

        //calling api
        // fetch("https://fakestoreapi.com/products").then((res)=>res.json()).then((json)=>this.setState({products:json}))

        fetch("https://fakestoreapi.com/products")
            .then((res) => res.json())
            .then((json) => this.setState({ products: json }))
    }

    shouldComponentUpdate() {
        console.log("should component update")

        return true
    }

    getSnapshotBeforeUpdate(prevProps, prevStates) {
        console.log("get snapshot before update")
        console.log(prevProps)
        console.log(prevStates)
        return prevProps
    }

    componentDidUpdate(prevProps, prevStates, snapshot) {
        console.log("component did update");
        console.log("snapshot : ", snapshot); //snapshot is object returned from getSnapshotbeforeupdate method

    }


    // componentWillUnmount() {
    //     console.log("unmounting")
    //     alert("unmounting")
    // }

    handleChild(){
        this.setState({
            childShow:!this.state.childShow
        })
    }
    render() {
        console.log("inside render");
        console.log("data", this.state.products)
        return (
            <>
                <div>Lifecycle name:{this.state.fname}</div>
                <button onClick={this.handleChild}>show Child Comp</button>
                {this.state.childShow && <CompoForUnmountDemonstation/> }

            </>


        )
    }

}


class CompoForUnmountDemonstation extends React.Component {

    //this child comp is getting removed we can use this in componentWillUnmoutn, to remvoe lsitener/timers,etc
    componentWillUnmount() {
        console.log("unmounting")
        alert("unmounting")
    }
    render() {
        return <>
            hello from Child component
        </>
    }
}

export default Classcomponent;