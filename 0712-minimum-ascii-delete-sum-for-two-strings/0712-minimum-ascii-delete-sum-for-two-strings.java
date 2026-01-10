class Solution {
    int solve(int i,int j,String s1,String s2){
         int m=s1.length();
         int n=s2.length();
        if(i>=m && j>=n) return 0;
        else if(i>=m && j<n) return s2.charAt(j)+solve(i,j+1,s1,s2);
        else if(i<m && j>=n) return s1.charAt(i)+solve(i+1,j,s1,s2);
        else if(s1.charAt(i)==s2.charAt(j)){
            return solve(i+1,j+1,s1,s2);
        }
        else{
            int take_i=s1.charAt(i)+solve(i+1,j,s1,s2);
            int take_j=s2.charAt(j)+solve(i,j+1,s1,s2);
            return Math.min(take_i,take_j);
        }
    }
    public int minimumDeleteSum(String s1, String s2) {
       return solve(0,0,s1,s2);
       

    }
}