import React from 'react'

const ProductCard = ({title,price,pic}) => {
  return (
   <div className='card'> <img src={pic}/>
   <div>{title}</div>
   <div>{price}</div></div>
  )
}

export default ProductCard