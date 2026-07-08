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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head.next == null)
            return;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode current = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (current != null) {
            // System.out.println("reversing " + current.val);
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        current = head;
        ListNode reverse_current = prev;
        while (reverse_current != null) {
            ListNode t1 = current.next;
            ListNode t2 = reverse_current.next;

            current.next = reverse_current; 
            reverse_current.next = t1; 

            current = t1;
            reverse_current = t2;
        }
    }
}
