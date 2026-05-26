class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        int score=0;
        int max=0;
        Arrays.sort(tokens);
        int i=0;
        int j=n-1;
        while(i<=j){
            if(tokens[i]<=power){
                score++;
                max=Math.max(score,max);
                power=power-tokens[i];
                i++;
            }
            else if(score>=1){
                power=power+tokens[j];
                score--;
                max=Math.max(score,max);
                j--;
            }
            else break;
        }
        return max;
    }
}