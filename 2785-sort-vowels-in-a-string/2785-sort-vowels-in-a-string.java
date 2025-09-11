class Solution {
    public String sortVowels(String s) {
        ArrayList<Character>arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'||ch=='A' 
            || ch=='E' || ch=='I' || ch=='O' ||ch=='U'){
                arr.add(ch);
            }
        }
        Collections.sort(arr);
        String t="";
        int k=0;
        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'||ch=='A' 
            || ch=='E' || ch=='I' || ch=='O' ||ch=='U'){
                t+=(arr.get(k));
                k++;
            }
            else{
                t+=(ch);
            }
        }
        return t;
    }
}