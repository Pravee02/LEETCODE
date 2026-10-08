# Alternating Digit Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a positive integer `n`. Each digit of `n` has a sign according to the following rules:

- The most significant digit is assigned a positive sign.
- Each other digit has an opposite sign to its adjacent digits.

Return  *the sum of all digits with their corresponding sign*.

 

 **Example 1:** 

```
Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.

```

 **Example 2:** 

```
Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.

```

 **Example 3:** 

```
Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.

```

 

 **Constraints:** 

- 1 <= n <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.1 MB (beats 66.71%)  
**Submitted:** 2026-10-08T16:13:18.674Z  

```java
class Solution {
    public int alternateDigitSum(int n) {
        
        
        int reverse = 0;
        while(n > 0)
        {
            int digit = n % 10; 
           
            reverse = reverse * 10 + digit;
            n = n / 10;
            
        }
        int count = 2;
        int sum = 0;
        while(reverse > 0)
        {
            int digit = reverse % 10; 
            if(count % 2 == 0)
            {
                sum = sum + digit;
            }
            else
            {
                sum = sum - digit;
            }
            reverse = reverse / 10;
            count++;
           
        }
        
    return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/alternating-digit-sum/)