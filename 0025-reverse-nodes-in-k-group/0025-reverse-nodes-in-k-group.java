class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ans=head;
        if(head==null) return null;
        for(int i=0;i<k-1;i++){
            ans=ans.next;
        }
        ListNode temp=null;
        ListNode left=head;
        ListNode right=head;
        while(right!=null){
            for(int i=0;i<k-1;i++){
                if(right==null) return ans;
                right=right.next;
            }
            if(right==null) break;
            ListNode Next=right.next;
            right.next=null;
           ListNode prev=reverse(left);
            if(temp!=null){
                temp.next=right;
            }
            temp=left;
            temp.next=Next;
            left=Next;
            right=Next;

        }
       return ans;
    }
}