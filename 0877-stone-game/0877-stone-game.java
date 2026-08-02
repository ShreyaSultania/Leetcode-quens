class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        Arrays.sort(piles);
        int alice=0;
        int bob=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                alice+=piles[i];
            }
            else{
                bob+=piles[i];
            }
        }
        if(alice<bob) return true;
        return false;
    }
}