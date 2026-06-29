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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode t=head;
        while(fast!=null && fast.next!=null){
            t=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        t.next=null;

        ListNode j=reverse(slow);
        ListNode i=head;
        while(i!=null && j!=null){
            if(i.val!=j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;
    }
}