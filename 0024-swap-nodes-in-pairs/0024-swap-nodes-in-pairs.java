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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        ListNode odd1=new ListNode(0);
        ListNode odd=odd1;
         ListNode even1=new ListNode(0);
        ListNode even=even1;
        ListNode t=head;
        for(int i=1;i<=size;i++){
            if(i%2!=0){
            odd.next=t;
            odd=odd.next;
            }
            else{
                even.next=t;
                even=even.next;
            }
            t=t.next;
        }
        even.next=null;
        odd.next=null;
        ListNode t1=odd1.next;
        ListNode t2=even1.next;
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        while(t1!=null && t2!=null){
        dummy.next=t2;
        t2=t2.next;
        dummy=dummy.next;
        dummy.next=t1;
        t1=t1.next;
        dummy=dummy.next;
    }
    if(t1==null){
        dummy.next=t2;
    }
    if(t2==null){
        dummy.next=t1;
    }
    return ans.next;
    }
}