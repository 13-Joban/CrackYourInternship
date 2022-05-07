class Solution {
    public int removeDuplicates(int[] nums) {
      int comaparewithme = 0;
        
        for(int iterator = 1; iterator < nums.length; iterator++){
            
            if(nums[comaparewithme] != nums[iterator] )
                comaparewithme++;
            
            nums[comaparewithme] = nums[iterator];
        }
        
        return comaparewithme + 1;
        
    }
}

Time - O(n) Space - O(1)
  
