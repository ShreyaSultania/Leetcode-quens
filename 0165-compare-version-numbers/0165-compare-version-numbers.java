class Solution {
    public int compareVersion(String version1, String version2) {
        String[]str=version1.split("\\.");
        String[]str1=version2.split("\\.");
        int n=Math.min(str.length,str1.length);
        for(int i=0;i<n;i++){
            if(Integer.parseInt(str[i])==Integer.parseInt(str1[i])) continue;
            else if(Integer.parseInt(str[i])<Integer.parseInt(str1[i])) return -1;
            else if(Integer.parseInt(str[i])>Integer.parseInt(str1[i])){
                return 1;
            }
            
        }
    for (int i = n; i < str.length; i++) {
            if (Integer.parseInt(str[i]) > 0) return 1;
        }
      for (int i = n; i < str1.length; i++) {
            if (Integer.parseInt(str1[i]) > 0) return -1;
        }  
        return 0;
    }
}