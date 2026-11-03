import java.util.Arrays;
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int maxVal = nums[nums.length-1];
        int moves = 0;
        for(int i = 0 ; i < nums.length-1; i++)
        {
            if(nums[i] < maxVal)
            {
             
            moves = moves +  maxVal - nums[i];;
            }
        } 
        return moves;
    }
}