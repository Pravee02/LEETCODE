# Check If All 1's Are at Least Length K Places Away

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an binary array `nums` and an integer `k`, return `true` *if all* `1` *'s are at least* `k` *places away from each other, otherwise return* `false`.

 

 **Example 1:** 

```
Input: nums = [1,0,0,0,1,0,0,1], k = 2
Output: true
Explanation: Each of the 1s are at least 2 places away from each other.

```

 **Example 2:** 

```
Input: nums = [1,0,0,1,0,1], k = 2
Output: false
Explanation: The second 1 and third 1 are only one apart from each other.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 0 <= k <= nums.length
- nums[i] is 0 or 1

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.1 MB  
**Submitted:** 2026-10-27T14:34:56.045Z  

```java
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        
        boolean result = true;
        int j = 0;
        for(int i = 0; i < nums.length && j < nums.length; )
        {
            int count = 0;
            if(nums[j] == 1)
            {
                j++;
            }
            while(j < nums.length && nums[j] != 1)
            {
                j++;
                count++;
            }

            while(j < nums.length && nums[j] ==0)
            {
                count++;
                j++;
            }
            if(count < k)
            {
                return false;
            }
            // while(nums[j] != 1)
            // {
            //     j++;
            //     count++;
            // }
            // if(count < k)
            // {
            //     return false;
            // }
            
            i = j;
            j++;
        }
        return result;
    }
    
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/)