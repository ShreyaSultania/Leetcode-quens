class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character,Integer>map=new HashMap<>();
           HashMap<Integer,Character>map1=new HashMap<>();
                map1.put(25,'a');
                map1.put(24,'b');
                map1.put(23,'c');
                map1.put(22,'d');
                map1.put(21,'e');
                map1.put(20,'f');
                map1.put(19,'g'); 
                map1.put(18,'h');
                map1.put(17,'i');
                map1.put(16,'j');
                map1.put(15,'k');
                map1.put(14,'l');
                map1.put(13,'m');
                map1.put(12,'n');
                map1.put(11,'o'); 
                map1.put(10,'p');
                map1.put(9,'q');
                map1.put(8,'r');
                map1.put(7,'s');
                map1.put(6,'t');
                map1.put(5,'u');
                map1.put(4,'v');
                map1.put(3,'w'); 
                map1.put(2,'x');
                map1.put(1,'y');
                map1.put(0,'z');
        String ans="";
        for(int i=0;i<26;i++){
            if(!map.containsKey((char)(97+i))){
                map.put((char)(97+i),weights[i]);
            }
        }
       for(int i=0;i<words.length;i++){
        String s=words[i];
        int sum=0;
        for(int j=0;j<s.length();j++){
            sum+=map.get(s.charAt(j));
        }
        sum=sum%26;
        ans+=map1.get(sum);
       }
       return ans;
    }
}