class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length;
        for(int i=1;i<=5000;i++){
            int start=i;
            int curr=start;
            boolean flag=true;
            for(int j=0;j<n;j++){
               curr+=nums[j];
                if(curr<=0){
                    flag=false;
                    break;
                }
            }
            if(flag) return start;
        }
        return -1;
    }
}