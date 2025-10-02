class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int Empty=numBottles;
        int res=numBottles;
        while(Empty>=numExchange){
            int newBottles=Empty/numExchange;
            res+=newBottles;
            Empty=Empty%numExchange+newBottles;
        }
        return res;
    

    }
}
