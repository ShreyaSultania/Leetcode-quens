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
   ListNode reverse(ListNode head){
    ListNode prev=null;
    ListNode curr=head;
    ListNode Next=null;
    while(curr!=null){
        Next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=Next;
    }
    return prev;
   }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode t1=l1;
       ListNode t2=l2;
       ListNode dummy=new ListNode(0);
       ListNode temp=dummy;
       int carry=0;
       while(t1!=null || t2!=null || carry>0){
        int sum=0;
        if(t1!=null){
            sum+=t1.val;
            t1=t1.next;
        }
        if(t2!=null){
            sum+=t2.val;
            t2=t2.next;
        }
        sum=sum+carry;
        carry=sum/10;
        ListNode a=new ListNode(sum%10);
        temp.next=a;
        temp=temp.next;
       }
       return dummy.next;
    }
}