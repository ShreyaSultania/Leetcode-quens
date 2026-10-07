class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>>map=new HashMap<>();
        List<List<String>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=strs[i];
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sort = new String(charArray);
            if(!map.containsKey(sort)){
                List<String>temp=new ArrayList<>();
                temp.add(s);
                map.put(sort,temp);
            }
            else{
                map.get(sort).add(s);
            }
        }
        for(String s: map.keySet()){
            // System.out.print(s);
            List<String>t=new ArrayList<>();
            t=map.get(s);
            ans.add(t);
        }
        return ans;
    }
}