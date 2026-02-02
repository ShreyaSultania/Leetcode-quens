class StockSpanner {
    Stack<Integer>st;
    ArrayList<Integer>arr;
    public StockSpanner() {
        st=new Stack<>();
        arr=new ArrayList<>();
    }
    
    public int next(int price) {
        arr.add(price);
        int span=0;
        int n=arr.size()-1;
            while(st.size()>0 && price>=arr.get(st.peek())) st.pop();
            if(st.size()==0) span=n+1;
            else{
               span=n-st.peek();
            }
            st.push(n);
        
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */