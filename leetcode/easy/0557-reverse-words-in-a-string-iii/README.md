# Reverse Words in a String III

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Original
Java
 **Example 1:** 

```
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

```

 **Example 2:** 

```
Input: s = "Mr Ding"
Output: "rM gniD"

```

 

 **Constraints:** 

- 1 <= s.length <= 5 * 104
- s contains printable ASCII characters.
- s does not contain any leading or trailing spaces.
- There is at least one word in s.
- All the words in s are separated by a single space.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 87.62%)  
**Memory:** 45.8 MB (beats 96.20%)  
**Submitted:** 2026-11-17T15:00:35.790Z  

```java
class Solution {
    public String reverseWords(String s) {
        
        char[] arr = s.toCharArray();
        int right = 0;
        int left = 0;
         
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ' ' || i == arr.length-1){
                if(i != arr.length-1){
                right = i - 1;
                }
                else{
                    right = i;
                }
                while(left <= right){
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                left = i + 1;
            }
        }
         return  new String(arr);
       
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-words-in-a-string-iii/)