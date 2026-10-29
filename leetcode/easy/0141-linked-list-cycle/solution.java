/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
        {
            return false;
        }
        ListNode temp = head;
        while( head.next != null && head.next.next != null)
        {
            head = head.next.next;
            if(head == temp)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}