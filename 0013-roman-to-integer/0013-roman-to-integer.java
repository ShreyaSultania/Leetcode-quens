class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=0;
        int n=s.length();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i<n-1){
            char ch1=s.charAt(i+1);
            if(map.get(ch)<map.get(ch1)){
                sum+=(map.get(ch1)-map.get(ch));
                i++;
            }
            else{
                sum+=map.get(ch);
            }
            }
            else sum+=map.get(ch);
        }
        return sum;
    }
}