class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int m=arr1.length;
        int n=arr2.length;
        int len=0;
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<m;i++){
            String str=String.valueOf(arr1[i]);
            for(int j=1;j<=str.length();j++){
                set.add(str.substring(0,j));
            }
        }

        for(int i=0;i<n;i++){
            String str=String.valueOf(arr2[i]);
            int k=0;
            for(int j=1;j<=str.length();j++){
                if(!set.contains(str.substring(0,j))) break;
                else{
                    k=j;
                }
            }
            len=Math.max(k,len);
        }
        return len;
    }
}