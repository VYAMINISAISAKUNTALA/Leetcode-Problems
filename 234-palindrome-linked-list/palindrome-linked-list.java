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

        if(head==null || head.next==null) return head;

        ListNode prev=null;
        ListNode curr=head;
        ListNode fwd;

        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        

        if(head == null) return false;

        if(head.next == null) return true;

        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!= null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode savedSecondHeadNode=slow.next;
        slow.next=null;

        ListNode newReverseHead=reverseList(savedSecondHeadNode);
        ListNode temp=head;

        while(temp!=null && newReverseHead!=null){
            if(temp.val != newReverseHead.val){
                return false;
            }
            temp=temp.next;
            newReverseHead=newReverseHead.next;
        }
        return true;
    }
}