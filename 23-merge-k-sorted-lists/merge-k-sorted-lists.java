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
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int size = lists.length;
        for(int i=0;i<size;i++){
            ListNode head = lists[i];

            while(head!=null){
                pq.add(head.val);
                head=head.next;
            }
        }
        ListNode dummy = new ListNode(-21);
        ListNode current = dummy;

        while(pq.size()!= 0){
            current.next = new ListNode(pq.peek());
            current = current.next;
            pq.poll();
        }
        return dummy.next;
    }
}