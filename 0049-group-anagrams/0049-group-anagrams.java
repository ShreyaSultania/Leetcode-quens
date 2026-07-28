class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            String s=strs[i];
            char[]c=s.toCharArray();
            Arrays.sort(c);
            String s2=new String(c);
            if(!map.containsKey(s2)){
                List<String>t=new ArrayList<>();
                t.add(s);
                map.put(s2,t);
            }
            else{
                map.get(s2).add(s);
            }
        }
        for(String a:map.keySet()){
            List<String>s=map.get(a);
            ans.add(s);
        }
        return ans;
    }
}