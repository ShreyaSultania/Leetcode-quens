class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int n=nums.length;
        st.push((2*n-1)%n);
        int []ans=new int[n];
        ans[(2*n-1)%n]=-1;
        for(int i=n*2-2;i>=0;i--){
            int idx=i%n;
            while(st.size()>0 && nums[st.peek()]<=nums[idx]) st.pop();
            if(st.size()==0) ans[idx]=-1;
            else{
                ans[idx]=nums[st.peek()];
            }
            st.push(idx);

        }
        return ans;

    }
}