import java.util.Arrays;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return null;
        }
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
        int count = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] < nums[i] )
            {
                count++;
            }
        }
        result[i] = count;
        }
        return result;
       
    }
}