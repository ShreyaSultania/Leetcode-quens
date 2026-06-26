class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st=new Stack<>();
         int []arr=new int[nums1.length];
        int n=nums2.length;
        int []ans=new int[n];
        ans[n-1]=-1;
        st.push(nums2[n-1]);
        for(int i=n-2;i>=0;i--){
                while(st.size()>0 && st.peek()<nums2[i]) st.pop();
                if(st.size()==0){
                    ans[i]=-1;
                }
                else{
                   ans[i]=st.peek();
                }
                 st.push(nums2[i]);
            }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]){
                    arr[i]=ans[j];
                }
            }
        }
        return arr;
    }
}