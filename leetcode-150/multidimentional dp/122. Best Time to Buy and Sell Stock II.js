/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let i=0
    let buy=0
    let profit=0
    let n = prices.length-1
  
    //we can buy and sell any number of time but we before buying next we need to sell previous brought stock
    while(i<n){
  
  
      //we have to buy first so we will check if current element is greater than next so we will move furtur as we need smaller amout to buy
      while(i<n && prices[i]>prices[i+1])
      {
          i++; //
      }
      //now we found smaller amount we can we buy
      buy=prices[i]
  
  
      //now we need to sell, for selling we will look for element which is greater than previous one
      while(i<n && prices[i]<=prices[i+1]){
          i++; //if there is elemnt greater than current, then we will go to that element to check if we can sell this or not
      }
  
      sell = prices[i]
  
      profit+=sell-buy
  
    }
  
      return profit
  
  };