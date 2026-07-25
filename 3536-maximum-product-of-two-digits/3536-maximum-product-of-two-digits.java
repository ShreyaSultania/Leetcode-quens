class Solution {
      ArrayList<Integer>ans;
    void mul(int n){
        while(n!=0){
            int rem=n%10;
            ans.add(rem);
            n=n/10;
        }
        
    }
    public int maxProduct(int n) {
      ans=new ArrayList<>();
       mul(n);
       int size=ans.size();
       Collections.sort(ans);
        return ans.get(size-1)*ans.get(size-2);
    }
}