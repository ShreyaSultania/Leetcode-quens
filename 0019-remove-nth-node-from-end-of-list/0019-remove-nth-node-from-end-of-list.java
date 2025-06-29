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
        // ListNode slow=head;
        // ListNode fast=head;
        // if(slow.next==null) return null;
        // for(int i=0;i<n;i++){
        //    fast=fast.next;
        // }
        // while( fast!=null && fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next;
        // }
        //    slow.next=slow.next.next;
        //         return head;
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size=size+1;
            temp=temp.next;
        }
        ListNode t=head;
        if(size==1 && n==1) return null;
        if(size==n ) return head.next;
        for(int i=0;i<size-n-1;i++){
            t=t.next;
        }
        t.next=t.next.next;
        return head;
    }
   
}