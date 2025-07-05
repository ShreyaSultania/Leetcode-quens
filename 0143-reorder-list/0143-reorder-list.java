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
        if(head.next==null) return;
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
         ListNode a=null;
        while(fast!=null && fast.next!=null){
            a=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(a!=null)  a.next=null;
        ListNode curr=slow;
        ListNode prev=null;
        ListNode Next=null;
       
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        while(prev!=null && temp!=null){
            t.next=temp;
            t=temp;
            temp=temp.next;
            t.next=prev;
            t=prev;
            prev=prev.next;
        }
        head=dummy.next;
    }
}