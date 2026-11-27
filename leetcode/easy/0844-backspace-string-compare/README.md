# Backspace String Compare

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true`  *if they are equal when both are typed into empty text editors*. `'#'` means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Original
Java
 **Example 1:** 

```
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

```

 **Example 2:** 

```
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

```

 **Example 3:** 

```
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

```

 

 **Constraints:** 

- 1 <= s.length, t.length <= 200
- s and t only contain lowercase letters and '#' characters.

 

 **Follow up:**  Can you solve it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 59.92%)  
**Memory:** 42.8 MB (beats 51.84%)  
**Submitted:** 2026-11-27T17:55:12.491Z  

```java
class Solution {
    private int top = -1;
    private char stacks[];
    private char stackt[];
    public boolean backspaceCompare(String s, String t) {
        stacks = new char[s.length()];
        stackt = new char[t.length()];
        int tops = -1;
        int topt = -1;

        int sl = s.length();
        int tl = t.length();
        int n = 0;

        if(sl > tl){
            n = sl;
        }
        else{
            n = tl;
        }
        for(int i = 0; i < n ; i++)
        {
            // first string
            if(i < sl )
            {
                if(tops != -1)
                {
                    if(s.charAt(i) == '#')
                    {
                        tops--;
                    }
                }
            }
            if(i < sl && s.charAt(i)!= '#')
            {
                tops++;
                stacks[tops] = s.charAt(i);
            }

            // second string
            if(i < tl)
            {
                if(topt != -1)
                {
                    if(t.charAt(i) == '#')
                    {
                        topt--;
                    }
                }
            }
            if(i < tl && t.charAt(i) != '#')
            {
                topt++;
                stackt[topt] = t.charAt(i);
            }

        }

        StringBuilder s1 = new StringBuilder("");
        StringBuilder t1 = new StringBuilder("");

    // first string
        for(int i = tops; i >= 0; i--)
        {
            s1.append(stacks[i]);
            
        }

    // second string
        for(int i = topt; i >= 0; i--)
        {
            t1.append(stackt[i]);
            
        }
        String firstString = s1.toString();
        String secondString = t1.toString();

        return firstString.equals(secondString);

        
        

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/backspace-string-compare/)