/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;
        int len1=0;
        int len2=0;
        while(t1!=null){
            len1++;
            t1=t1.next;
        }
         while(t2!=null){
            len2++;
            t2=t2.next;
        }
         ListNode tA=headA;
        ListNode tB=headB;
        if(len1>len2){
            for(int i=0;i<len1-len2;i++){
                tA=tA.next;
            }
            
        }
        else if(len1<len2){
            for(int i=0;i<len2-len1;i++){
                tB=tB.next;
            }
            
        }
        while(tA!=null){
            if(tA==tB) return tA;
            tA=tA.next;
            tB=tB.next;
        }
        return null;
    }
}