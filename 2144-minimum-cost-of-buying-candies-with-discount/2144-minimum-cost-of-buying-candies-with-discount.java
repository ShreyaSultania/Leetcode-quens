class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int buyCost=0;
        int n=cost.length;
        if(n==1) return cost[0];
        for(int i=n-1;i>=0;i-=3){
            buyCost+=cost[i];
            if(i>0) buyCost+=cost[i-1];
        }
        return buyCost;
    }
}