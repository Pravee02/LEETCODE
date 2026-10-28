class Solution {
    public long maximizeSum(int[] nums, int k) {
         long sum = 0;
        int[] gains = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            char[] digits = String.valueOf(nums[i]).toCharArray();
            Arrays.sort(digits);

            int max = 0;

            for (int j = digits.length - 1; j >= 0; j--) {
                max = max * 10 + (digits[j] - '0');
            }

            gains[i] = max - nums[i];
        }

        Arrays.sort(gains);

        for (int i = 0; i < k; i++) {
            sum += gains[gains.length - 1 - i];
        }

        return sum;
        }
    
}