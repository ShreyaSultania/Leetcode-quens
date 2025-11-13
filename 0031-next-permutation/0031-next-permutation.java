class Solution {
    void swap(int a,int b,int[]nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    void reverse(int i,int j,int[] nums){
        while(i<=j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
        }
    }
    public void nextPermutation(int[] nums) {
      int n=nums.length;
      int idx=-1;
      for(int i=n-1;i>0;i--){
        if(nums[i]>nums[i-1]){
            idx=i;
            break;
        }
      }
      if(idx==-1){
        reverse(0,n-1,nums);
        return;
      }
    //   System.out.print(idx);
    //  swapping
     for(int i=n-1;i>=idx;i--){
        if(nums[idx-1]<nums[i]){
            swap(idx-1,i,nums);
            break;
        }
     }
      

    //   reverse
    reverse(idx,n-1,nums);
    }
}