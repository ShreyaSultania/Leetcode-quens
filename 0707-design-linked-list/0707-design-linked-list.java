class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
class MyLinkedList {
  ListNode head;
  int size;
    public MyLinkedList() {
       head=null;
       size=0;
    }
    
    public int get(int idx) {
        ListNode temp=head;
        if(idx<0 || idx>=size) return -1;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        ListNode temp=new ListNode(val);
      
       temp.next=head;
        head=temp;
       size++;
    }
    
    public void addAtTail(int val) {

        ListNode temp=new ListNode(val);
        ListNode t=head;
        if(head==null){
            head=temp;
        }
        else{
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
       
        }
         size++;
    }
    
    public void addAtIndex(int index, int val) {
        ListNode temp=new ListNode(val);
        ListNode t=head;
        if(index<0 || index>size) return;
        if(index==0){addAtHead(val); return;}
        if(index==size){
            addAtTail(val);
            return;
        }
        for(int i=0;i<index-1;i++){
            t=t.next;
        }
        temp.next=t.next;
        t.next=temp;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        ListNode temp=head;
        if(index<0 || index>=size) return;
        else if(index==0) head=head.next;
        else{
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */