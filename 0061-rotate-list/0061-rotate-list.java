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
    ListNode reverse(ListNode head,ListNode end){
        ListNode prev=null;
        ListNode Next=null;
        ListNode curr=head;
        while(curr!=null && curr!=end){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||  k==0) return head;
        ListNode p=head;
        int size=0;
        while(p!=null){
            size++;
            p=p.next;
        }
        k=k%size;
        if(k==0) return head;
       head=reverse(head,null);
        ListNode temp=head; 
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        ListNode sHead=temp.next;
        temp.next=null;
        ListNode t1=reverse(head,null);
        ListNode m=t1;
        while(m.next!=null){
            m=m.next;
        }
        ListNode t2=reverse(sHead,null);
        m.next=t2;
        // t1.next=t2;
        System.out.print(size);
        return t1;
    }
}