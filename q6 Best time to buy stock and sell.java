// Approach 1
  class Solution {
    public int maxProfit(int[] prices) {
        
        int ans = 0;
        
        for(int i=0; i<prices.length - 1; i++){
            int iterationmax = 0;
            
            for(int j=i+1; j<prices.length; j++){
                iterationmax = Math.max( iterationmax, prices[j] - prices[i]);
                
            }
           ans = Math.max(ans, iterationmax);
            
        }
        
        return ans;
    }
}
// Approach 1 gives TLE  as Time - (n*n) Space - O(1)

// Approach - 2 

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        int minprice = prices[0];
        
        for(int i=0; i<prices.length; i++){
            if(   prices[i] > minprice){
                profit = Math.max(profit, prices[i] - minprice );
                
            }
            else{
                minprice = prices[i];
            }
            
            
        }
        return profit;
    }
}
Time - O(n) Space - O(1) 
  

