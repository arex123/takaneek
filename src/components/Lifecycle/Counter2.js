import React from 'react'

class Counter2 extends React.Component{

  shouldComponentUpdate(nextProps,nextState){
    if(this.props.value!==nextProps.value){
      return true
    }
    return false
  }
  render(){
    console.log("counter 2 is rendering")
    // console.log(this.props)
    return <>
    <h1>Counter 2 is:</h1>
    <h2>{this.props.value}</h2>
    <button onClick={this.props.onClick}>click</button>
    </>
  }
}

export default Counter2