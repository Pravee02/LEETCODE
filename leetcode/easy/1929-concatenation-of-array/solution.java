class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        if(nums == null || nums.length == 0)
        {
            return null;
        }
        int[] ans = new int[2 * length];

        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[i];
            ans[i + length] = nums[i]; 
        }
        return ans;
    }
}