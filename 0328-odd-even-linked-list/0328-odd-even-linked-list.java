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
    public ListNode oddEvenList(ListNode head) {
        ListNode even1 = new ListNode(0);
        ListNode  even=even1;
        ListNode odd1 = new ListNode(0);
        ListNode odd = odd1;
        ListNode t = head;
        int size=0;
        while (t != null) {
            size++;
            t=t.next;
        }
        ListNode temp=head;
        for(int i=1;i<=size;i++){
            if(i%2!=0){
                odd.next=temp;
                odd=odd.next;
                temp=temp.next;
            }
            else{
                even.next=temp;
                even=even.next;
                temp=temp.next;
            }
        }

        odd.next=even1.next;
        even.next=null;
        return odd1.next;
        
    }
}