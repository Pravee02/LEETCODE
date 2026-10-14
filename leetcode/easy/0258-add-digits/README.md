# Add Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

 

 **Example 1:** 

```
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

```

 **Example 2:** 

```
Input: num = 0
Output: 0

```

 

 **Constraints:** 

- 0 <= num <= 231 - 1

 

 **Follow up:**  Could you do it without any loop/recursion in `O(1)` runtime?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 98.23%)  
**Memory:** 42.2 MB (beats 94.71%)  
**Submitted:** 2026-10-14T17:16:11.752Z  

```java
class Solution {
    public int addDigits(int num) {
        // int sum = 0;  // 11
        // while(num > 0)
        // {
        //     int digit = num % 10;
        //     sum = sum + digit;
        //     num = num / 10;
        // }
        // if(sum >= 0 && sum <= 9)
        // {
        //     return sum;
        // }
        // else
        // {
        //     return addDigits(sum);
        // }
        

        
   
        if (num == 0)
            return 0;
        if (num % 9 == 0)
            return 9;
        return num % 9;
    }
}
    

    

```

---

[View on LeetCode](https://leetcode.com/problems/add-digits/)