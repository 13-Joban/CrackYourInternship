class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int iterator = 0; iterator<nums.length; iterator++){
            
            int index = Math.abs(nums[iterator]);
            
            if(nums[index] < 0){
                return index;
            }
            nums[index] = -nums[index];
            
        }
        
        return nums.length;
    }
}
