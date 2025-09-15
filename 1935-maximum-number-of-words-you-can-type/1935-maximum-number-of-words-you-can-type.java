class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            char ch=brokenLetters.charAt(i);
            set.add(ch);
        }
        String[] arr=text.split(" ");
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            boolean found=false;
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                if(set.contains(ch)) {
                    found=true;
                    break;
                }
            }
            if(!found) c++;
        }
        return c;
    }
}