class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>>ans=new ArrayList<>();
        // Set<List<Integer>>s=new HashSet<>();
        // for(int i=0;i<nums.length-1;i++){
        //     TreeSet<Integer>set=new TreeSet<>();
        //     for(int j=i+1;j<nums.length;j++){
        //         int third=-(nums[i]+nums[j]);
        //             if(!set.contains(third)){
        //                 set.add(nums[j]);
        //             }
        //             else if(set.contains(third)){
        //                 List<Integer>temp=new ArrayList<>();
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(third);
        //                 Collections.sort(temp);
        //                 if(!s.contains(temp)){
        //                     s.add(temp);
        //                 }
        //             }
        //     }   
            
        // }
        // for(List<Integer>arr:s){
        //     ans.add(arr);
        // }
        // return ans;

        //optimal solution
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
         int j=i+1;
         int k=nums.length-1;
         while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
          if(sum<0){
            j++;
            }
            else if(sum>0){
           k--;
            }
            else{
                  ArrayList<Integer>temp=new ArrayList<>();
                temp.add(nums[i]);
                 temp.add(nums[j]); 
                 temp.add(nums[k]);
                 ans.add(temp);
                 j++;
                 k--;
                 while(j<k && nums[j]==nums[j-1]){
                   j++;
                 }
                 while(j<k && nums[k]==nums[k+1]){
                    k--;
                 }
            }
         }
        }
        return ans;
    }
}