class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean result = true;
        if(nums[0] <= nums[1]){
        for(int i = 0; i < nums.length-1;i++)
        {
            if(! (nums[i] <= nums[i+1]))
            {
                result =  false;
            }
        }
        }
        if(nums[0] >= nums[1]){
        for(int i = 0; i < nums.length-1;i++)
        {
            if(! (nums[i] >= nums[i+1]))
            {
                result =  false;
            }
            
        }
        }
    
        return result;
    }
}