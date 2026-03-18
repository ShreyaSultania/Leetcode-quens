class BrowserHistory {
    Stack<String>st;
     Stack<String>st1;
    public BrowserHistory(String homepage) {
        st=new Stack<>();
        st1=new Stack<>();
        st.push(homepage);
    }
    
    public void visit(String url) {
        st.push(url);
        st1.clear();
    }
    
    public String back(int steps) {
        while(st.size()>1 && steps-->0){
            String temp=st.pop();
            st1.push(temp);
        }
        return st.peek();
    }
    
    public String forward(int steps) {
        while(st1.size()>0 && steps-->0){
            st.push(st1.pop());
        }
        return st.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */