# Jewels and Stones

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You're given strings `jewels` representing the types of stones that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so `"a"` is considered a different type of stone from `"A"`.

 

Original
Java
 **Example 1:** 

```
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

```

 **Example 2:** 

```
Input: jewels = "z", stones = "ZZ"
Output: 0

```

 

 **Constraints:** 

- 1 <= jewels.length, stones.length <= 50
- jewels and stones consist of only English letters.
- All the characters of jewels are unique.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 71.01%)  
**Memory:** 42.5 MB (beats 86.30%)  
**Submitted:** 2026-11-17T05:19:11.053Z  

```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        char[] arr1 = jewels.toCharArray();
        char[] arr2 = stones.toCharArray();

        int count = 0;
        for(int i =0 ; i < arr1.length;i++)
        {
            for(int j = 0; j < arr2.length;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/jewels-and-stones/)