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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||k==0 ||head.next==null) return head;
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
             size++;
        }

       ListNode slow=head;
       ListNode fast=head;
    //    ListNode a=head;
       k=k%size;
    
    for(int i=1;i<=k;i++){
        fast=fast.next;
    }

    while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;

    }
    fast.next=head;
    head=slow.next;
    slow.next=null;
    return head;

    }
}