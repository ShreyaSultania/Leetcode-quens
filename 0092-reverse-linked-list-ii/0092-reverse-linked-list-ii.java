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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || left==right) return head;
        ListNode a=null;
        ListNode b=head;
        ListNode c=head;
        ListNode d=null;
        ListNode temp=head;
        for(int i=1;i<right;i++){
           if(i<left){
            a=b;
            b=b.next;
           }
        
        c=c.next;
        }
        d=c.next;
        c.next=null; 
        ListNode curr=b;
        ListNode prev=null;
        ListNode Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
       
        if(a!=null){
        a.next=prev;
        }
        b.next=d;

        if(left==1) return prev;
        return head;

    }
}