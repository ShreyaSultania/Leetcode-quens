class Solution {
    public int compress(char[] chars) {
        String s="";
        int i=0;
        int j=0;
        int k=0;
        while(j<chars.length){
            if(chars[i]==chars[j]) j++;
            else{
                int dis=j-i;
                chars[k++]=chars[i];
               if (dis > 1) {
                    String num = String.valueOf(dis);
                    for (char c : num.toCharArray()) {
                        chars[k++] = c;
                    }
                }
                i=j;
            }
        }
               int dis=j-i;
                chars[k++]=chars[i];
                if (dis > 1) {
                    String num = String.valueOf(dis);
                    for (char c : num.toCharArray()) {
                        chars[k++] = c;
                    }
                }
        return k;
    }
}