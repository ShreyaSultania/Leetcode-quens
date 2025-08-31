class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String result = paragraph.replaceAll("[^a-zA-Z]", " ");
        String s=result.toLowerCase();
        String[]arr=s.split("\\s+");
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String ch=arr[i];
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int frq=map.get(ch);
                map.put(ch,frq+1);
            }
        }
        for(int i=0;i<banned.length;i++){
            String check=banned[i];
            String p=check.toLowerCase();
            if(map.containsKey(p)){
                map.remove(p);
            }
        }
        String ans="";
        int max=Integer.MIN_VALUE;
        for(String key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                ans=key;
            }
        }

        return ans;
    }
}