class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            String s=strs[i];
            char[]temp=s.toCharArray();
            Arrays.sort(temp);
            String st=new String(temp);
            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>());
            }
                map.get(st).add(s);
        }
        for(String ele:map.keySet()){
            ans.add(map.get(ele));
        }
        return ans;
    }
}