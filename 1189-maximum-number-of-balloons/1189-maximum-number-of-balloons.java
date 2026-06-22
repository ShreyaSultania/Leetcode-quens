class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=text.length();
        for(int i=0;i<n;i++){
            char ch=text.charAt(i);
            if(!map.containsKey(ch)) map.put(ch,1);
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
        }
        int c=0;
           while(map.containsKey('b') && map.containsKey('a') &&map.containsKey('l') && map.containsKey('o') && map.containsKey('n')){
            int freq=map.get('b');
            int freq1=map.get('a');
            int freq2=map.get('l');
            int freq3=map.get('o');
            int freq4=map.get('n');
            if(freq>=1 && freq1>=1 && freq2>=2 && freq3>=2 && freq4>=1){
                c++;
            }
            if(freq==1) map.remove('b');
            else{
                map.put('b',freq-1);
            }
            if(freq1==1) map.remove('a');
             else{
                map.put('a',freq1-1);
            }
            if(freq2==2) map.remove('l');
             else{
                map.put('l',freq2-2);
            }
            if(freq3==2) map.remove('o');
             else{
                map.put('o',freq3-2);
            }
            if(freq4==1) map.remove('n');
             else{
                map.put('n',freq4-1);
            }
           }
        return c;
    }
}