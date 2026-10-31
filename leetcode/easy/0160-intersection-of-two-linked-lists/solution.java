/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
       
        while(headA != null)
        {
            ListNode HeadB = headB;
            while(HeadB != null)
            {
                if(headA == HeadB)
                {
                    return headA;
                }
                HeadB = HeadB.next;
            }
            headA = headA.next;
        }
        return null;
    }
}