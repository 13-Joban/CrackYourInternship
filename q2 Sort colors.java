// Approach 1 
//   O(n) -- count the 0, 1 , 2 separatelty and modify the given array
  

class Solution {
    public void sortColors(int[] nums) {
        
        
     int countzeros = 0, countones = 0, counttwos = 0;
        
        for(int val: nums){
            if(val == 0)
                countzeros++;
            else if(val == 1)
                countones++;
            else if(val == 2)
                counttwos++;
                
        }
        int index= 0;
        
        for(int i=0; i<countzeros; i++){
            nums[index++] = 0;
        }
        
        for(int i=0; i<countones; i++){
            nums[index++] = 1;
        }
        
         for(int i=0; i<counttwos; i++){
            nums[index++] = 2;
        }
    }
}


// Approach -- O(n) --single traversal --> Dutch flag algorithm


class Solution {
    public void sortColors(int[] nums) {
        
        int left = 0; 
        int right = nums.length  - 1;
        int mid = 0;
        
        while(mid <= right){
            switch(nums[mid]){
                case 0:
                    
                    if(nums[left] != nums[mid]){
                        int t=nums[left];
                        nums[left] = nums[mid];
                        
                        nums[mid] = t;
                        
                    }
                    left++; mid++;
                    break;
                    
                case 1: 
                    mid++; 
                    break;
                    
                case 2:
                     if(nums[right] != nums[mid]){
                        int t=nums[right];
                        nums[right] = nums[mid];
                        
                        nums[mid] = t;
                        
                    }
                    right--;
            }
        }
        
        

    }
}


  
 
