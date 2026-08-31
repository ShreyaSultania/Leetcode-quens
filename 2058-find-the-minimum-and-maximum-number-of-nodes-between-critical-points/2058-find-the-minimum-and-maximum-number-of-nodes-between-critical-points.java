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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int []ans=new int[]{-1,-1};
        if(head==null) return ans;
        if(head.next==null) return ans;
        if(head.next.next==null) return ans;
        ListNode temp=head.next;
        ListNode prev=head;
        int dist=0;
        int c=1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int first=-1;
        int last=-1;
        while(temp.next!=null){
            ListNode Next=temp.next;
            if(Next.val>temp.val && prev.val>temp.val){
                if (first == -1) {
                    first = c;
                }
                else {
                    min = Math.min(min, c - last);
                    max= Math.max(max, c - first);
                }
                last = c;
            }
            if(Next.val<temp.val && prev.val<temp.val){
                if (first == -1) {
                    first = c;
                }
                else {
                    min = Math.min(min, c - last);
                    max= Math.max(max, c - first);
                }
                last = c;
            }
            prev=temp;
            temp=temp.next;
            c++;
        }
        if(min==Integer.MAX_VALUE){
            ans[0]=-1;
        }
        else ans[0]=min;
        if(max==Integer.MIN_VALUE){
            ans[1]=-1;
        }
        else ans[1]=max;
        return ans;
    }
}