import React, { useState } from 'react'

const useLogin = () => {
    const [login,setLogin] = useState(false)
    const handleLogin = ()=>{
        setLogin(true)
    }
    const handleLogout = ()=>{
        setLogin(false)
    }
  return {login,handleLogin,handleLogout}
}

export default useLogin