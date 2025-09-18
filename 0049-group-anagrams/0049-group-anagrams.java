class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>arr=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(!map.containsKey(s)){
                ArrayList<String>list=new ArrayList<>();
                list.add(str);
                map.put(s,list);
            }
            else{
                map.get(s).add(str);
            }
        }
        for(String s:map.keySet()){
            arr.add(map.get(s));
        }
        return arr;
    }
}