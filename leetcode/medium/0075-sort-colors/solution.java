class Solution {
    public void sortColors(int[] nums) {
        // int  redcount = 0;
        // int whitecount = 0;
        // int bluecount = 0;

        // for(int i = 0; i < nums.length; i++)
        // {
        //     if(nums[i] == 0){
        //         redcount++;
        //         continue;
        //     }
        //     if(nums[i] == 1){
        //         whitecount++;
        //         continue;
        //     }
        //     if(nums[i] == 2){
        //         bluecount++;
        //     }
        // }

        // for(int i = 0; i < nums.length;i++)
        // {
        //     if(redcount > 0)
        //     {
        //         nums[i] = 0;
        //         redcount--;
        //     }
        //     else if(whitecount > 0)
        //     {
        //         nums[i] = 1;
        //         whitecount--;
        //     }
        //     else if(bluecount > 0)
        //     {
        //         nums[i] = 2;
        //         bluecount--;
        //     }

        // }

    int start = 0;
    int mid = 0;
    int end = nums.length-1;

    while(mid <= end)
    {
        if(nums[mid] == 0)
        {
            nums[mid] = nums[start];
            nums[start] = 0;
            start++;
            mid++;
        }
        else if(nums[mid] == 2)
        {
            nums[mid] = nums[end];
            nums[end] = 2;
            end--;
        }
        else if(nums[mid] == 1)
        {
            mid++;
        }

    }

    }
}