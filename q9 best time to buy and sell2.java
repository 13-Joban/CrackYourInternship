// Approach - CHeck for the High point until we are  getting continuosly high prices increment our selling day 
// When we get  a dip Calculate the profit and reset the selling and buying day

class Solution {
    public int maxProfit(int[] prices) {
       int profit=0; int  sellingday = 0; int  buyingday  = 0;
        
        for(int i=1; i<prices.length; i++ ){
            if(prices[i] >= prices[i-1])
                sellingday++;
            
             profit += prices[sellingday] - prices[buyingday];
            sellingday = buyingday = i;
        }
        
        return profit;
       
        
        
        
       
    }
}

Time - O(N)  Space - O(1)
  
  
  
