class Solution {
    public int closestTarget(String[] words, String target, int s) {
        int i=s;
        int j=s;
        int k=0;
        int n=words.length;
        while(k<n){
            if(words[i].equals(target) || words[j].equals(target)){
                return k;
            }
            k++;
            i=(i+1)%n;
            j=(j-1+n)%n;
        }
        return -1;
    }
}