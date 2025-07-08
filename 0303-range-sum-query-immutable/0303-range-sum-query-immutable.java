class NumArray {
  int []arr;
    public NumArray(int[] nums) {
        arr=Arrays.copyOf(nums,nums.length);
         for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
            System.out.print(arr[i]);
        }
    }
    
    public int sumRange(int left, int right) {
       
        if(left>0) return arr[right]-arr[left-1];
        else return arr[right];
    }
}
