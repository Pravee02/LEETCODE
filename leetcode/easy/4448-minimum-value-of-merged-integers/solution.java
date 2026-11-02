class Solution {
    public int minMergedInteger(int[] nums) {
    int minimumVal = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length;  i+=2)
        {
            int num = nums[i];
            int num2 = nums[i+1];
            
            int reverse = 0;
            int count = 0;
            while(num2 > 0)
            {
                int digit = num2 % 10;
                reverse = reverse * 10 + digit;
                num2 = num2 / 10;
                count++;
            }
            for (int j = 0; j < count; j++) {
            
                int digit = reverse % 10;
                num = num * 10 + digit;
                reverse = reverse / 10;
            }
            if(num < minimumVal)
            {
                minimumVal = num;
            }
        }
        return minimumVal;
    }
}