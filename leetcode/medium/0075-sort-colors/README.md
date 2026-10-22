# Sort Colors

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array `nums` with `n` objects colored red, white, or blue, sort them  **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

 **Example 1:** 

 **Input:**  nums = [2,0,2,1,1,0]

 **Output:**  [0,0,1,1,2,2]

 **Explanation:** 

The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.

 **Example 2:** 

 **Input:**  nums = [2,0,1]

 **Output:**  [0,1,2]

 **Explanation:** 

The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 300
- nums[i] is either 0, 1, or 2.

 

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.2 MB (beats 99.96%)  
**Submitted:** 2026-10-22T15:47:35.979Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/sort-colors/)