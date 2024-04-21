import React, { useEffect, useState } from 'react'

const useProductList = () => {
    console.log("hook");
    const [products,setProducts] = useState()
    useEffect(() => {
        console.log("7");
        getProducts();
    }, [])
    
    const getProducts = async () => {
        const prod = await fetch("https://fakestoreapi.com/products")
        const json = await prod.json()
        console.log("12 json ",prod)
        setProducts(json)
    }

    return {products}
}

export default useProductList