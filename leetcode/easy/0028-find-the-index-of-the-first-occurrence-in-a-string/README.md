# Find the Index of the First Occurrence in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

 

Original
Java
 **Example 1:** 

```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

```

 **Example 2:** 

```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

```

 

 **Constraints:** 

- 1 <= haystack.length, needle.length <= 104
- haystack and needle consist of only lowercase English characters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 9.44%)  
**Memory:** 42.7 MB (beats 60.68%)  
**Submitted:** 2026-11-18T16:30:11.745Z  

```java
class Solution {
    public int strStr(String haystack, String needle) {
        int count = 0;
        int j = 0;
        int index = -1;
        for(int i = 0; i < haystack.length();i++)
        {
            
            if(haystack.charAt(i) == needle.charAt(j))
            {
              
                if(count == 0)
                {
                    index =i;
                }

                count++;
                j++;

                if(count == needle.length())
                {
                    return index;
                }
            }
            else
            {
               if (count > 0) {
                i = index;
            }

            count = 0;
            j = 0;
            //index = -1;
            }
        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)