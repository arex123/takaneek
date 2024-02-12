import React from 'react'

// const Counter1 = () => {
//   return (
//     <div>Counter1</div>
//   )
// }

class Counter1 extends React.Component{
  shouldComponentUpdate(nextProps,nextState){ //using this method, current compoenent will not unnecessary update
    if(this.props.value!==nextProps.value){
      return true
    }
    return false
  }
  render(){
    console.log("counter 1 is rendering")
    return <>
    <h1>Counter 1 is:</h1>
    <h2>{this.props.value}</h2>
    <button onClick={this.props.onClick}>click</button>
    </>
  }

}

export default Counter1