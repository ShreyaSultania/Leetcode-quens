class Solution {
    public int largestRectangleArea(int[] height) {
        int n=height.length;
        int[] nsi=new int[n];
        int[] psi=new int[n];
        Stack<Integer>st=new Stack<>();
        // nsi
        st.push(n-1);
        // nsi[n-1]=n;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && height[st.peek()]>=height[i]) st.pop();
            if(st.isEmpty()) nsi[i]=n;
            else nsi[i]=st.peek();
            st.push(i);
        }
        st.clear();
        st.push(0);
        psi[0]=-1;
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && height[st.peek()]>=height[i]) st.pop();
            if(st.isEmpty()) psi[i]=-1;
            else psi[i]=st.peek();
            st.push(i);
        }
        int maxArea=0;
        for(int i=0;i<n;i++){
            // breadth
            int breadth=nsi[i]-psi[i]-1;
            int length=height[i];
            int area=length*breadth;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}