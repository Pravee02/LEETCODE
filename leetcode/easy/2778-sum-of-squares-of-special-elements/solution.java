class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int j = 0;
        for(int i = 1; i <= nums.length; i++)
        {
            try
            {
            if( n % i == 0)
            {
                sum = sum + (nums[j] * nums[j]);
                
            }
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            j++;

        }
        return sum;
    }
}