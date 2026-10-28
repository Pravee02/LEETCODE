# Q2. Maximize Sum After At Most K Digit Rearrangements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` of length `n` and an integer `k`.

In one operation, you may choose any element of `nums` and  **rearrange**  its decimal digits in any order to form a new integer.

Return the  **maximum**  possible sum of the array after performing  **at most**  `k` operations.

 

 **Example 1:** 

 **Input:**  nums = [123,45], k = 1

 **Output:**  366

 **Explanation:** 

- We choose nums[0] = 123 and rearrange its digits to form 321.
- The array becomes [321, 45]. Thus, the total sum is 321 + 45 = 366.

 **Example 2:** 

 **Input:**  nums = [102,90,14], k = 2

 **Output:**  341

 **Explanation:** 

- We choose nums[0] = 102 and rearrange its digits to form 210.
- We choose nums[2] = 14 and rearrange its digits to form 41.
- The array becomes [210, 90, 41]. Thus, the total sum is 210 + 90 + 41 = 341.

 

 **Constraints:** 

- 1 <= n == nums.length <= 105
- 1 <= nums[i] <= 109
- 1 <= k <= n

## Solution

**Language:** Java  
**Runtime:** 169 ms (beats 73.06%)  
**Memory:** 96.9 MB (beats 71.58%)  
**Submitted:** 2026-10-28T15:25:05.647Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/maximize-sum-after-at-most-k-digit-rearrangements/)