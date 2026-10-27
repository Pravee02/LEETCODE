class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        
        boolean result = true;
        int j = 0;
        for(int i = 0; i < nums.length && j < nums.length; )
        {
            int count = 0;
            if(nums[j] == 1)
            {
                j++;
            }
            while(j < nums.length && nums[j] != 1)
            {
                j++;
                count++;
            }

            while(j < nums.length && nums[j] ==0)
            {
                count++;
                j++;
            }
            if(count < k)
            {
                return false;
            }
            // while(nums[j] != 1)
            // {
            //     j++;
            //     count++;
            // }
            // if(count < k)
            // {
            //     return false;
            // }
            
            i = j;
            j++;
        }
        return result;
    }
    
}