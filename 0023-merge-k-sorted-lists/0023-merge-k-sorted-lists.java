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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
       ArrayList<Integer>arr=new ArrayList<>();
        int n=lists.length;
        for(int i=0;i<n;i++){
            ListNode l1=lists[i];
            while(l1!=null){
                arr.add(l1.val);
                l1=l1.next;
            }
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
           temp.next=new ListNode(arr.get(i));
           temp=temp.next;
        }
        return dummy.next;
    }
}