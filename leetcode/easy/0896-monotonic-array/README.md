# Monotonic Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

An array is  **monotonic**  if it is either monotone increasing or monotone decreasing.

An array `nums` is monotone increasing if for all `i <= j`, `nums[i] <= nums[j]`. An array `nums` is monotone decreasing if for all `i <= j`, `nums[i] >= nums[j]`.

Given an integer array `nums`, return `true` *if the given array is monotonic, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: nums = [1,2,2,3]
Output: true

```

 **Example 2:** 

```
Input: nums = [6,5,4,4]
Output: true

```

 **Example 3:** 

```
Input: nums = [1,3,2]
Output: false

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.2 MB  
**Submitted:** 2026-11-02T15:45:19.154Z  

```java
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean result = true;
        if(nums[0] <= nums[1]){
        for(int i = 0; i < nums.length-1;i++)
        {
            if(! (nums[i] <= nums[i+1]))
            {
                result =  false;
            }
        }
        }
        if(nums[0] >= nums[1]){
        for(int i = 0; i < nums.length-1;i++)
        {
            if(! (nums[i] >= nums[i+1]))
            {
                result =  false;
            }
            
        }
        }
    
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/monotonic-array/)