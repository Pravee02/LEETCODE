import java.util.Arrays;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // if(nums == null || nums.length == 0)
        // {
        //     return null;
        // }
        // int[] result = new int[nums.length];

        // for(int i = 0; i < nums.length; i++){
        // int count = 0;
        // for(int j = 0; j < nums.length; j++){
        //     if(nums[j] < nums[i] )
        //     {
        //         count++;
        //     }
        // }
        // result[i] = count;
        // }
        // return result;
        int[] newArray = nums.clone();
        Arrays.sort(newArray);

        for(int i = 0; i < newArray.length; i++)
        {
             nums[i] = i;

            if(newArray[i] == newArray[0])
            {
                nums[i] = 0;
            }

            else if(newArray[i] == newArray[i-1])
            {
                nums[i] = i-1;
            }

           
        }
        return nums;


    }
}