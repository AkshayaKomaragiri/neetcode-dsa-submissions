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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)-> Integer.compare(a.val, b.val));
        for (int i = 0; i < lists.length; i++){
           
                minHeap.add(lists[i]);
          
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
      //  ListNode prev = head;
        while (minHeap.peek() !=null ){
            ListNode node = minHeap.poll();
            current.next = node;
            

            current = current.next;
            if (node.next != null) minHeap.add(node.next);
        }
        return dummy.next;
    }
}
