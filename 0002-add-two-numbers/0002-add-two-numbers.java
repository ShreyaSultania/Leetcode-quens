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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(t1!=null && t2!=null){
            int sum=t1.val+t2.val;
            ListNode a=new ListNode((sum+carry)%10);
            carry=((sum+carry)/10);
            temp.next=a;
            temp=temp.next;
            t1=t1.next;
            t2=t2.next;
        }
        while(t1!=null){
            int sum=t1.val;
            ListNode a=new ListNode((sum+carry)%10);
            carry=((sum+carry)/10);
            temp.next=a;
            temp=temp.next;
            t1=t1.next;
        }
        while(t2!=null){
            int sum=t2.val;
            ListNode a=new ListNode((sum+carry)%10);
            carry=((sum+carry)/10);
            temp.next=a;
            temp=temp.next;
            t2=t2.next;
        }
        if(carry>0){
            ListNode a=new ListNode((carry)%10);
            temp.next=a;
            temp=temp.next;
        }
        return dummy.next;
    }
}