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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode newHead = null;
        ListNode new_current = null;
        if (list1 == null && list2 == null)
            return null;
        if (list1 != null && list2 == null)
            return list1;
        if (list1 == null && list2 != null)
            return list2;
        while (current1 != null && current2 != null) {
            if (current1.val <= current2.val) {
                ListNode n = new ListNode(current1.val);
                System.out.println("adding " + n.val);
                if (newHead == null) {
                    System.out.println("head is empty");
                    newHead = n;
                    new_current = newHead;
                } else {
                    new_current.next = n;
                    new_current = new_current.next;
                }
                current1 = current1.next;
                continue;
            } else if (current2.val < current1.val) {
                ListNode n = new ListNode(current2.val);
                if (newHead == null) {
                    newHead = n;
                    new_current = newHead;
                } else {
                    new_current.next = n;
                    new_current = new_current.next;
                }
                current2 = current2.next;
                continue;
            }
        }
        if (current1 == null) {
            while (current2 != null) {
                ListNode n = new ListNode(current2.val);
                new_current.next = n;
                new_current = new_current.next;
                current2 = current2.next;
            }
        }
        else if (current2 == null){
            while (current1 != null) {
                ListNode n = new ListNode(current1.val);
                new_current.next = n;
                new_current = new_current.next;
                current1 = current1.next;
            }
        }

        return newHead;
    }
}