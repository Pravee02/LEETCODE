class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(j < nums.length)
            {
                nums[i] = nums[j];
                count++;
                j++;

                while(j < nums.length && nums[j] == nums[i])
                {
                    j++;
                }
            }
        }
        return count;
    }
}