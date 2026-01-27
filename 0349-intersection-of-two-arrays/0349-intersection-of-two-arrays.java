class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>arr=new HashSet<>();
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                arr.add(nums2[i]);
            }
        }
       int []ans=new int[arr.size()];
       System.out.print(arr.size());
       int k=0;
       for(int ele:arr
       ){
        ans[k]=ele;
        k++;
       }
       return ans;
    }
}