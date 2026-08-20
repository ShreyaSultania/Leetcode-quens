class Solution {
    public int[] resultArray(int[] nums) {
        int i=0;
        int j=0;
        ArrayList<Integer>arr1=new ArrayList<>();
        arr1.add(nums[0]);
        ArrayList<Integer>arr2=new ArrayList<>();
        arr2.add(nums[1]);
        int n=nums.length;
        for(int k=2;k<n;k++){
            if(arr1.get(i)>arr2.get(j)){
                arr1.add(nums[k]);
                i++;
            }
            else{
                 arr2.add(nums[k]);
                j++;
            }
        }
        int k=0;
        while(k<arr1.size()){
            nums[k]=arr1.get(k);
            k++;
        }
        for(int m=0;m<arr2.size();m++){
            nums[k++]=arr2.get(m);
        }
        return nums;
    }
}