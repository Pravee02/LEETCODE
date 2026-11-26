# Remove All Adjacent Duplicates In String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` consisting of lowercase English letters. A  **duplicate removal**  consists of choosing two  **adjacent**  and  **equal**  letters and removing them.

We repeatedly make  **duplicate removals**  on `s` until we no longer can.

Return  *the final string after all such duplicate removals have been made*. It can be proven that the answer is  **unique**.

 

Original
Java
 **Example 1:** 

```
Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

```

 **Example 2:** 

```
Input: s = "azxxzy"
Output: "ay"

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 96.87%)  
**Memory:** 46.2 MB (beats 85.94%)  
**Submitted:** 2026-11-26T05:41:58.535Z  

```java
class Solution {
    private int top = -1;
    private char stack[];

    public void push(char ch)
        {
            top++;
            stack[top] = ch;
        }

    public char pop()
        {
            char ch = stack[top];
            top--;
            return ch;
        }

    public String removeDuplicates(String s) {
        
       stack = new char[s.length()];
        

        for(int i = s.length()-1; i >= 0; i--)
        {
            if(top == -1)
            {
                push(s.charAt(i));
                continue;
            }
            if(stack[top] == s.charAt(i))
            {
                pop();
            
            }
            else
            {
                push(s.charAt(i));
            }
        }
        StringBuilder newString= new  StringBuilder("");
        for(int i = top ; i >=0 ; i--)
        {
        char ch = pop();
        newString.append(ch);
        }

        return newString.toString();
    }

    }

```

---

[View on LeetCode](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)