class Solution {
    public String longestCommonPrefix(String[] strs) {
        int k=strs.length;
        Arrays.sort(strs);
        String s="";
        String m=strs[0];
        String n=strs[k-1];
        for(int i=0;i<Math.min(m.length(),n.length());i++){
            if(m.charAt(i) == n.charAt(i)){
                s+=m.charAt(i);
            }
            else break;
        }
        return s;
    }
}