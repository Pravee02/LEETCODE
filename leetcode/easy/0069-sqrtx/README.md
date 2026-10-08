# Sqrt(x)

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a non-negative integer `x`, return  *the square root of* `x` *rounded down to the nearest integer*. The returned integer should be  **non-negative**  as well.

You  **must not use**  any built-in exponent function or operator.

- For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

 

 **Example 1:** 

```
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

```

 **Example 2:** 

```
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

```

 

 **Constraints:** 

- 0 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 65 ms (beats 5.16%)  
**Memory:** 42.8 MB (beats 8.97%)  
**Submitted:** 2026-10-08T17:01:44.645Z  

```java
class Solution {
    public int mySqrt(int x) {
        
        if(x == 1)
        {
            return 1;
        }
        for(double i = 0 ; i <= x / 2; i++)
        {
            if( i * i == x)
            {
                return (int)i;
            }
            else if(  ((i+1) * (i+1)) > x)
            {
            return (int)i;
            }
        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sqrtx/)