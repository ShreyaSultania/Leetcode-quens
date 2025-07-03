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
    public boolean isPalindrome(ListNode head) {
        // make a deep copy of the given linked list
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        ListNode temp = head;
        while (temp != null) {
            ListNode a=new ListNode(temp.val);
            t.next = a;
            t = a;
            temp = temp.next;
        }
        ListNode t1 = dummy.next;
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = null;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        ListNode t2 = prev;
        while (t1 != null && t2 != null) {
            if (t1.val != t2.val)
                return false;
            t1 = t1.next;
            t2 = t2.next;
        }

        return true;
    }
}