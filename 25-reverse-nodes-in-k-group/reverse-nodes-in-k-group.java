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

    public int lengthOfLinkedList(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        if(lengthOfLinkedList(head) < k){
            return head;
        }

        ListNode prev=null;
        ListNode curr=head;
        ListNode fwd=null;

        int count=0;

        while(curr!=null && count < k){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
            count++;
        }

        head.next=reverseKGroup(fwd,k);
        return prev;
    }
}