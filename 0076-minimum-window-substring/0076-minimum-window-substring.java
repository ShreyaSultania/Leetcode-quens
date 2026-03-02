class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=t.length();
        int c=t.length();
        String ans="";
        int length=Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
        }
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                if(freq>0){
                    c--;
                } 
                map.put(ch,freq-1);
            }
            while(c==0){
                if(length>j-i+1){
                    length=j-i+1;
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