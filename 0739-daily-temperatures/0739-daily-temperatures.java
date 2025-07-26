class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            if(st.isEmpty()){
                ans.add(0);
                st.push(i);
            }
            else if(nums[st.peek()]>nums[i]){
                ans.add(st.peek()-i);
                st.push(i);
            }
            else{
                while(st.size()>0 && nums[st.peek()]<=nums[i]){
                st.pop();
                }
                if(st.isEmpty()){
                    ans.add(0);
                    st.push(i);
                }
                else{
                    ans.add(st.peek()-i);
                    st.push(i);
                }
            }
        }
        Collections.reverse(ans);
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}