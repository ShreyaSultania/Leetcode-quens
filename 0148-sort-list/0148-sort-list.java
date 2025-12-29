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
        ArrayList<Integer>arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        for(int i=0;i<arr.size();i++){
            ListNode a=new ListNode(arr.get(i));
            t.next=a;
            t=t.next;
        }
        return dummy.next;
    }
}