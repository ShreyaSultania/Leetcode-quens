class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=numBottles;
        int res=numBottles;
        int c=0;
        while(empty>=numExchange){
           empty=empty-numExchange;
           res++;
           empty+=1;
        }
        return res;
    

    }
}
