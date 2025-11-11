class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pidx=0;
        int nidx=1;
        int n=nums.length;
        int res[]=new int[n];
       for(int ele: nums){
        if(ele>0){
            res[pidx]=ele;
            pidx+=2;
        }
        else{
            res[nidx]=ele;
            nidx+=2;
        }
       }
        return res;
    }
}