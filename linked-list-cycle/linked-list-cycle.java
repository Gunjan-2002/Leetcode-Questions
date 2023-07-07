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
        ListNode slowP = head;
        ListNode fast = head;

        while(fast != null &&  fast.next != null)
        {
            slowP = slowP.next;
            fast = fast.next.next;
            if(slowP == fast)
            {
                return true;
            }
        }

        return false;
    }
}