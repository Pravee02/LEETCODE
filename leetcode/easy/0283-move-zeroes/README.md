# Move Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

 **Note**  that you must do this in-place without making a copy of the array.

 

 **Example 1:** 

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Could you minimize the total number of operations done?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 91.45%)  
**Memory:** 48.1 MB (beats 6.90%)  
**Submitted:** 2026-10-06T15:30:23.855Z  

```java
class Solution {
     public void moveZeroes(int[] nums) {
//          int left = 0;
//         int right = left + 1;
//         int length1 = (nums.length) - 1;

//         if (nums.length == 0 || nums.length == 1) {
//             System.out.println(nums[0]);

//         }

//         while (left < nums.length - 1 && right < nums.length) {
//             if (nums[left] == 0 && nums[right] == 0) {
//                 right++;
//             }

//             else if (nums[left] == 0 && nums[right] != 0) {
//                 int temp = nums[left];
//                 nums[left] = nums[right];
//                 nums[right] = temp;
//                 right++;
//                 left++;

//             } else if (nums[left] != 0 && nums[right] != 0) {
//                 right++;
//                 left++;
//             }
//             else if (nums[left] != 0 && nums[right] == 0) {
//                 right++;
//                 left++;
//             }
            

//         }

//         for (int i = 0; i < nums.length; i++) {
//             System.out.print(nums[i] + " ");
//         } 
//     }
// }


    int left = 0;

        for(int right = 0;right<nums.length;right++)
        {
            if(nums[right] != 0)
            {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left]=temp;
                left++;

            }
        }
     }
}
```

---

[View on LeetCode](https://leetcode.com/problems/move-zeroes/)