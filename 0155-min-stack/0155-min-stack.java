class MinStack {
    Stack<Integer>st;
    Stack<Integer>minStack;
    public MinStack() {
        st=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int value) {
        st.push(value);
        if(minStack.size()==0 || minStack.peek()>=value){
            minStack.push(value);
        }
    }
    
    public void pop() {
        if(st.size()>0 && minStack.size()>0 && st.peek().equals(minStack.peek())){
            st.pop();
            minStack.pop();
        }
        else if(st.size()>0) st.pop();
    }
    
    public int top() {
        if(st.size()>0) return st.peek();
        return -1;
    }
    
    public int getMin() {
        if(minStack.size()>0) return minStack.peek();
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */