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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                ListNode a=new ListNode(sum);
                t.next=a;
                t=t.next;
                sum=0;
            }
            else{
                sum+=temp.val;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}