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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(-27);
        ListNode temp=head;
        ListNode result=dummy;

        while(temp!=null){
            if(temp.val == val){
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