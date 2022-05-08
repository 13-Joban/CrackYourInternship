// Approach 1 --- Using 2 loops
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        int ind=0;
        
        for(int i=0; i<nums.length - 1; i++){
             int findme =target - nums[i];
            
            for(int j=i+1; j<nums.length; j++){
                if(findme == nums[j])
                  {  ans[ind++] = i;
                ans[ind++] = j;
                break;
               }
            }
        }
        return ans;
    }
}
// Time - O(n*n) Space - O(1)

// Approach -2 Using Hashmap 


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        int ind=0;
        
       HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int findme = target - nums[i];
            if(map.containsKey(findme)){
                ans[ind++] = i;
                ans[ind++] = map.get(findme);
            }
            else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}


// Time - O(n)  Space - O(N)

