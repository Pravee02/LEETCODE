class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(val != nums[i])
            {
                count++;
            }


        }
        
        for(int i = 0; i < nums.length ; i++)
        {
           
            while(j < nums.length && nums[j] == val)
            {
                j++;
            }
            if(j < nums.length)
            {
            nums[i] = nums[j];
            j++;
            }
            
        
        }
    return count;
    }
}