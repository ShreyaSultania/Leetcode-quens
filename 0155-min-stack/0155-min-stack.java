    class MinStack {
        Stack<Integer>st=new Stack<>();
        Stack<Integer>min=new Stack<>();
        // PrioityQueue<Integer>pq=new PrioirityQueue<>();
        public MinStack() {
            
        }
        
        public void push(int val) {
            st.push(val);
            if(min.size()==0 || val<min.peek()) min.push(val);
            // pq.push(val);
        }
        
        public void pop() {
            if(st.size()==0 || min.size()==0) return;
              int ele=st.pop();
              if(ele==min.peek()) min.pop(
                
              );
        }
        
        public int top() {
            return st.peek();
        }
        
        public int getMin() {
            if(min.size()==0) return 0;
            return min.peek();
        }
    }

    /**
    * Your MinStack object will be instantiated and called as such:
    * MinStack obj = new MinStack();
    * obj.push(val);
    * obj.pop();
    * int param_3 = obj.top();
    * int param_4 = obj.getMin();
    */