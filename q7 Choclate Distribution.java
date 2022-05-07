// Approach - Sort the array so that we get minimum difference b/w 
// maximum number of choclates  - minimum no of choclates 


class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        
     
      long[] arr = new long[a.size()];
          
  
        // ArrayList to Array Conversion
        for (int i = 0; i < a.size(); i++)
        {
             arr[i] = a.get(i);
        }
        
           
        
      Arrays.sort(arr);
      long ans = Integer.MAX_VALUE;
      
      
    //   m is the window size 
    //  n - m will be total number of windows 
     
    //  a[i] denote the minimum and a[i + m-1] gives maximum value
    
    for(int i=0; i<=(int)n-m; i++){
        
        long minchoclates  = arr[i];
         long maxchoclates  = arr[i + (int)m  - 1];
     
        
        ans =Math.min(ans, maxchoclates- minchoclates);
    }
      return ans;
  }
}

Time - O(nlogn) Space - O(1)
  
