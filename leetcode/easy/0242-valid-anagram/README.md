# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

Original
Java
 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 51.88%)  
**Memory:** 43.8 MB (beats 85.46%)  
**Submitted:** 2026-11-23T09:52:09.020Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int arr[] = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;

        }
        for(int i = 0; i < s.length(); i++)
        {
            if(arr[s.charAt(i) - 'a'] != 0)
            {
                return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)