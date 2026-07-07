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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode newHead = null;
        if (head != null) {
            while (current != null) {
                if (newHead == null) {
                    newHead = new ListNode(current.val);
                } else {
                    ListNode n = new ListNode(current.val);
                    n.next = newHead;
                    newHead = n;
                    
                }
                current = current.next;
            }
        } else {
            return null;
        }
        return newHead;
    }
}
