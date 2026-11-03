import java.util.Arrays;
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int maxVal = nums[nums.length-1];
        int moves = 0;
        for(int i = 0 ; i < nums.length-1; i++)
        {
            int dif = maxVal - nums[i];
            moves = moves + dif;
        } 
        return moves;
    }
}