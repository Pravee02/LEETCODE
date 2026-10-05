# Find First and Last Position of Element in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

```

 **Example 2:** 

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

```

 **Example 3:** 

```
Input: nums = [], target = 0
Output: [-1,-1]

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109
- nums is a non-decreasing array.
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 48.3 MB (beats 31.50%)  
**Submitted:** 2026-10-05T01:28:53.111Z  

```java
class Solution {
    public int[] searchRange(int[] nums, int target) 
//     {

//     int left = 0;
//     int right = nums.length -1;

//     int firstaccur = 0;
//     int lastaccur =0;

//     while(left <= right)
//     {
//         int mid = left + (right - left) / 2;
        
//         if(nums[mid] == target)
//         {
//             firstaccur = mid;
//             lastaccur = mid;

//             int temp = mid-1;
//             while(temp >= 0  && nums[temp] == target)
//             {
//                 firstaccur = temp;
//                 temp--;
//             }

//             temp = mid + 1;

//             while(temp < nums.length && nums[temp] == target)
//             {
//                 lastaccur = temp;
//                 temp++;
//             }

//              return new int[]{firstaccur, lastaccur};
//         }
//             else if(nums[mid] < target)
//             {
//                 left = mid + 1;
//             }
//             else
//             {
//                 right = mid-1;
//             }
//         }  
//     return new int[]{-1, -1};
//     }
// }




{
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    static int findFirst(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                first = mid;

                // Target found, but maybe another target is on the left
                right = mid - 1;

            }
            else if (nums[mid] < target) {

                left = mid + 1;

            }
            else {

                right = mid - 1;
            }
        }

        return first;
    }

    static int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int last = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                last = mid;

                // Target found, but maybe another target is on the right
                left = mid + 1;

            }
            else if (nums[mid] < target) {

                left = mid + 1;

            }
            else {

                right = mid - 1;
            }
        }

        return last;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)