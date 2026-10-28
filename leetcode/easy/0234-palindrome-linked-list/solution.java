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