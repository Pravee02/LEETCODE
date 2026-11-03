import java.util.Arrays;
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int maxVal = nums[nums.length-1];
        int moves = 0;
        int i = 0;
        while(nums[i] < maxVal)
        {
            
            moves = moves +  maxVal - nums[i];;
            i++;
        } 
        return moves;
    }
}