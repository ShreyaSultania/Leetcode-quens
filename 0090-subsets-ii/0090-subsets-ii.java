class Solution {
    void fun(ArrayList<Integer>temp,List<List<Integer>>res,int start,int nums[]){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            
           }
            temp.add(nums[i]);
            fun(temp,res,i+1,nums);
            temp.remove(temp.size()-1);

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer>temp=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();   
        fun(temp,res,0,nums);
        return res;

    }
}