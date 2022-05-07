class Solution {
    public void moveZeroes(int[] nums) {
        
       int count = 0;
//         first iterate over the array and get all non - zero elements 
//         then until count != nums.length set the remaining elements to 0
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0)
            nums[count++] = nums[i];
        }
        
        while(count < nums.length){
            nums[count++] = 0;
        }
        
    }
} 
// Time  - O(n) Space - O(1)
  
