//another HOC for creatine prop collision
import React, { useState } from 'react'

const WithName = (OldComponent,incrementBy=1) => {
  return function EnhancedComponent(props){
    const [count,setCount] = useState(0)
    return (
        <OldComponent {...props} name="with Name Comp"/>
    )

  }
}

export default WithName