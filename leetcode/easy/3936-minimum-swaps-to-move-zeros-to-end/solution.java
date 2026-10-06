class Solution {
    public int minimumSwaps(int[] nums) {
        int count = 0;
        int j = nums.length -1; 
        for(int i = 0; i < nums.length ;i++)
        {
            if(i < j)
            {
            while(nums[i] != 0 )
            {
                i++;
            }
            while(nums[j] == 0 && i < j)
            {
                j--;
            }

             if(nums[i] == 0 && nums[j] > 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            
                count++;
            }
           
            }
            
        }
        return count;
    }
}