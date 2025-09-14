class Solution {
    boolean vowelcheck(String s,String t){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char lowerCh = Character.toLowerCase(ch);
            char ch1=t.charAt(i);
            char lowerCh1 = Character.toLowerCase(ch1);
            if(lowerCh==lowerCh1) continue;
            if((lowerCh=='a' || lowerCh=='e' ||lowerCh=='i' ||lowerCh=='o' ||lowerCh=='u') &&(lowerCh1=='a' ||lowerCh1=='e' ||lowerCh1=='i' ||lowerCh1=='o' ||lowerCh1=='u')){
               continue;
            }
           else if(lowerCh!=lowerCh1) return false;
           
        }
        return true;
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        String []res=new String[queries.length];
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<wordlist.length;i++){
            set.add(wordlist[i]);
        }
    
        for(int i=0;i<queries.length;i++){
            String str=queries[i];
            if(set.contains(str)){
                res[i]=str;
            }
            else if(!set.contains(str)){
                boolean found=false;
                for(int j=0;j<wordlist.length;j++){
                     String w=wordlist[j];
                    if(w.equalsIgnoreCase(str)){
                        res[i]=w;
                        found=true;
                        break;
                    }
                }
                if(!found){
                    //vowel check
                    boolean found1=false;
                    for(int k=0;k<wordlist.length;k++){
                        String p=wordlist[k];
                        if(vowelcheck(p,str)){
                            res[i]=p;
                            found1=true;
                            break;
                        }
                    }
                    if(!found1){
                        res[i]="";
                    }
                }

            }
        }
        return res;
    }
}