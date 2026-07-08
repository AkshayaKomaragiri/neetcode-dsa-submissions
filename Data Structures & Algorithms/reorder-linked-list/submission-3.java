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
        int size = size(head);
        int times  = (int) Math.ceil((double) size / 2.0);
        int i = 0;
        ListNode current = head;
        System.out.println("size: "+size+" times: " + times);
        if (head.next == null) return;
        while (i < (size-2)){
            current.next = reverseList(current.next);
            current= current.next;
            i++;
        }

    }
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
    public int size(ListNode head){
        ListNode current = head;
        int i =0;
        while (current != null){
            i++;
            current = current.next;
        }
        return i;
    }
}
