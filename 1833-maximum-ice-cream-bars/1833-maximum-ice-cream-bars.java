class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n=costs.length;
        int noOfice=0;
        long totalCost=0;
        for(int i=0;i<n;i++){
            totalCost+=costs[i];
            if(totalCost<=coins) noOfice++;
        }
        return noOfice;
    }
}