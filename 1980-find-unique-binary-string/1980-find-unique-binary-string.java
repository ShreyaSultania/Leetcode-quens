class Solution {
    void helper(int n, List<String>ans,String s){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        helper(n,ans,s+'0');
        helper(n,ans,s+'1');
    }
    public String findDifferentBinaryString(String[] nums) {
        List<String>s=new ArrayList<>();
        int n=nums.length;
        helper(n,s,"");
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<s.size();i++){
            if(!set.contains(s.get(i))) return s.get(i);
        }
        return "";
    }
}