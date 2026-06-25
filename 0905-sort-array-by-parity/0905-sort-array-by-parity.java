class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length;
        while(j<n){
            if(nums[j]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                //swap with nums[i]
            }
            j++;
        }
        return nums;
    }
}