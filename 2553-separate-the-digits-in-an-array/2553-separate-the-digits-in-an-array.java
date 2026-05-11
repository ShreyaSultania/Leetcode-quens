class Solution {
    String reverse(int n){
       String s=Integer.toString(n);
       return s;
    }
    // void separateDigit(int n,ArrayList<Integer>temp){
    //     String t=reverse(n);
    //     StringBuilder sb=new StringBuilder(t);
    //     System.out.println(t);
    //     int i=0;
    //     int j=sb.length();
    //     while(i<j){
    //         char temp=sb.charAt(i);
    //         sb.setcharAt(i,sb.charAt(j));
    //         sb.setcharAt(i,temp);
    //     }

    // }
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>temp=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            String s=reverse(nums[i]);
            for(int j=0;j<s.length();j++){
                temp.add(s.charAt(j)-'0');
            }
        }
        int []ans=new int[temp.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
}