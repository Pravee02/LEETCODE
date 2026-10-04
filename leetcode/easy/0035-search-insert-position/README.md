# Search Insert Position

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [1,3,5,6], target = 5
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,3,5,6], target = 2
Output: 1

```

 **Example 3:** 

```
Input: nums = [1,3,5,6], target = 7
Output: 4

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums contains distinct values sorted in ascending order.
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-10-04T16:15:59.732Z  

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int length = nums.length-1;
        int right = length;
        int mid = 0;
        
        while(left <= right)
        {
             mid = left + (right-left) / 2;
           
            if(nums[mid] == target)
            {
                return mid ;
            }
            else if(nums[mid] < target)
            {
                left = mid +1;
            }
            else
            {
                right = mid - 1;
            }
        }
           if(target == 0)
           {
            return 0;
           }
           else{
            return mid + 1 ;
           }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-insert-position/)