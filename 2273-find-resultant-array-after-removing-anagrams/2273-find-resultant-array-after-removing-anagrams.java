class Solution {
    public List<String> removeAnagrams(String[] words) {
        HashMap<Character,Integer>map=new HashMap<>();
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String str=words[i];
            boolean flag=false;
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                    flag=true;
                }
                else{
                    int freq=map.get(ch);
                    map.put(ch,freq+1);
                }
            }
            if(flag==true) ans.add(str);
        }
        return ans;
    }
}