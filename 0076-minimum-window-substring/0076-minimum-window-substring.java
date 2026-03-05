class Solution {
    public String minWindow(String s, String t) {
        int minLength=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int n=s.length();
        int c=t.length();
        String ans="";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int k=0;k<t.length();k++){
            if(!map.containsKey(t.charAt(k))){
                map.put(t.charAt(k),1);
            }
            else{
                int freq=map.get(t.charAt(k));
                map.put(t.charAt(k),freq+1);
            }
        }
        while(j<n){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                if(freq>0) c--;
                map.put(ch,freq-1);
            }
            while(c==0){
                if(minLength>j-i+1){
                    minLength=j-i+1;
                    ans=s.substring(i,j+1);
                }
                if(map.containsKey(s.charAt(i))){
                    int freq=map.get(s.charAt(i));
                    map.put(s.charAt(i),freq+1);
                    if(map.get(s.charAt(i))>0) c++;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}