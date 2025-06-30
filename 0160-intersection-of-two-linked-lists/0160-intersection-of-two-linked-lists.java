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
        ListNode tempA=headA;
        int length1=0;
        ListNode tempB=headB;
        while(tempA!=null){
            length1++;
            tempA=tempA.next;
        }
        int length2=0;
        while(tempB!=null){
            length2++;
            tempB=tempB.next;
        }
        if(length1==length2){
            ListNode temp=headA;
            ListNode t=headB;
            while(temp!=t){
                temp=temp.next;
                t=t.next;
            }
            return temp;
        }
        else{
            if(length1>length2){
                 ListNode t=headB;
                 ListNode temp=headA;
                 for(int i=1;i<=length1-length2;i++){
                    temp=temp.next;
                 }
                 while(temp!=t){
                temp=temp.next;
                t=t.next;
            }
                return temp;

            }
            else if(length1<length2){
                 ListNode temp=headB;
                 ListNode t=headA;
                 for(int i=1;i<=length2-length1;i++){
                    temp=temp.next;
                 }
                 while(temp!=t){
                temp=temp.next;
                t=t.next;
            }
                return temp;

            }
        }
        return null;
    }
}