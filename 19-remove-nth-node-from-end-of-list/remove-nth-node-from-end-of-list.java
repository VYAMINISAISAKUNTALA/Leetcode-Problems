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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-27);
        ListNode temp=head;
        ListNode result=dummy;

        int count=1;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        temp=head;

        while(temp!=null){
            count-=1;
            if(count == n){
                result.next=temp.next;
                temp=temp.next;
            }else{
                result.next=temp;
                result=result.next;
                temp=temp.next;
            }
        }
        return dummy.next;
    }
}