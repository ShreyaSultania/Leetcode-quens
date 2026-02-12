class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    void helper(int []nums,int idx, HashSet<ArrayList<Integer>>set,ArrayList<Integer>temp){
        if(nums.length==idx){
            set.add(new ArrayList<>(temp));
            // ans.add(set);
            return;
        }
        // skip
        helper(nums,idx+1,set,temp);
        // take
        temp.add(nums[idx]);
        helper(nums,idx+1,set,temp);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        
        HashSet<ArrayList<Integer>>set=new HashSet<>();
        ArrayList<Integer>temp=new ArrayList<>();
        helper(nums,0,set,temp);

        return new ArrayList<>(set);
    }
}