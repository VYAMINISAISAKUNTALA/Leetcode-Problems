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
        
    //     PriorityQueue<ListNode> pq = new PriorityQueue<>();
    //     int size = lists.length;
    //     for(int i=0;i<size;i++){
    //         ListNode head = lists[i];

    //         while(head!=null){
    //             pq.add(head);
    //             head=head.next;
    //         }
    //     }
    //     ListNode dummy = new ListNode(-21);
    //     ListNode current = dummy;

    //     while(pq.size()!= 0){
    //         current.next = new ListNode(pq.poll());
    //         current = current.next;
    //     }
    //     return dummy.next;
    // }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int size = lists.length;
        for(ListNode head:lists){
            ListNode temp = head;

            while(temp!=null){
                pq.add(temp.val);
                temp=temp.next;
            }
        }
        ListNode ansNode = new ListNode(-21);
        ListNode dummy = ansNode;

        while(pq.size()!= 0){
            ListNode newNode = new ListNode(pq.poll());
            dummy.next=newNode;
            dummy = dummy.next;
        }
        return ansNode.next;
    }
}