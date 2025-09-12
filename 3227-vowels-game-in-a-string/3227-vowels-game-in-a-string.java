class Solution {
    public boolean doesAliceWin(String s) {
        ArrayList<Character>arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'){
                return true;
            }
        }
        return false;
       
        
    }
}