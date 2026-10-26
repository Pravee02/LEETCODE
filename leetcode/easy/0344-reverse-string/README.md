# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 30.74%)  
**Memory:** 47.9 MB (beats 89.79%)  
**Submitted:** 2026-10-26T07:45:07.624Z  

```java
class Solution {
    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length-1;

        while(i <= j)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        
       
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)