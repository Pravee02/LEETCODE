# Palindrome Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a singly linked list, return `true` *if it is a  **palindrome**  or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: head = [1,2,2,1]
Output: true

```

 **Example 2:** 

```
Input: head = [1,2]
Output: false

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [1, 105].
- 0 <= Node.val <= 9

 

 **Follow up:**  Could you do it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 68.68%)  
**Memory:** 94.2 MB (beats 72.62%)  
**Submitted:** 2026-10-28T18:08:35.258Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null )
        {
            return false;
        }
        ListNode currentHead = head;
        int count = 0;
        while(currentHead != null)
        {
            count++;
            currentHead = currentHead.next;
        }

        int[] arr = new int[count];
        int i = 0;
        while(head != null)
        {
            arr[i] = head.val;
            head = head.next;
            i++;
        }

       int start = 0;
       int end = arr.length-1;

       while(start < end )
       {
        if(arr[start] != arr[end])
        {
            return false;
        }
        start++;
        end--;
       }
       return true;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-linked-list/)