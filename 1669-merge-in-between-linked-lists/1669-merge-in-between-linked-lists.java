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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // 1721
        int len=0;
        ListNode temp=list1;
        ListNode t=list1;
        for(int i=0;i<a-1;i++){
            t=t.next;
        }
        for(int i=0;i<b+1;i++){
            temp=temp.next;
        }
         t.next=list2;
        ListNode t2=list2;
        while(t2.next!=null){
            t2=t2.next;
        }
        t2.next=temp;

        return list1;
    }
}