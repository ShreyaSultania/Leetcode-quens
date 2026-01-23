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
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer>ans=new ArrayList<>();
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(ans);
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        for(int i=0;i<ans.size();i++){
            ListNode a=new ListNode(ans.get(i));
            t.next=a;
            t=t.next;
        }
        return dummy.next;
    }
}