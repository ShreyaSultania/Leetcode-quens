class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        if(n==0) return new String("");
        int l1=strs[0].length();
        int l2=strs[n-1].length();
        String s1=strs[0];
        String s2=strs[n-1];
        int idx=-1;
        for(int i=0;i<Math.min(l1,l2);i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                // idx=i;
                break;
            }
            else idx=i;
        }
        if(idx!=-1) return s1.substring(0,idx+1);
        else return "";
    }
}