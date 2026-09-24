class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length()+word2.length();
        int []arr=new int[n];
        int k=0;
        int l=0;
        String s="";
        for(int i=0;i<Math.min(word1.length(),word2.length())*2;i++){
            if(i%2==0){
                // arr[i]=word1.charAt(k++);
                s+=word1.charAt(k++);
            }
            else{
                // arr[i]=word2.charaAt(l++);
                s+=word2.charAt(l++);
            }
        }
        while(k<word1.length()){
            s+=word1.charAt(k++);
        }
        while(l<word2.length()){
            s+=word2.charAt(l++);
        }
        return s;
    }
}