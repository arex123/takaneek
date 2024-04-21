import React, { useEffect } from 'react';
import useProductList from '../../Hooks/useProductList'
import ProductCard from './ProductCard';
import useLogin from '../../Hooks/useLogin';
const Products = () => {

    const { products } = useProductList()
    const {login,handleLogin,handleLogout} = useLogin()


    console.log(products);
    return <>
    <button onClick={login?handleLogout:handleLogin}>{login?'Log Out':'Log In Please'}</button>
        <div className='products'>
            {products && products.map((product) => <ProductCard key={product.id} title={product.title} pic={product.image} price={product.price} />)}
        </div>
        
        </>
}
export default Products