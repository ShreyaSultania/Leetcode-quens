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
    public ListNode modifiedList(int[] arr, ListNode head) {
    ListNode dummy=new ListNode(0);
     ListNode temp=dummy;
      ListNode t=head;
      HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
       while(t!=null){
        if(set.contains(t.val)){
            t=t.next;
        }
        else{
            ListNode a=new ListNode(t.val);
            temp.next=a;
            temp=a;
            t=t.next;
        }
       }
        return dummy.next;
        
    }
}