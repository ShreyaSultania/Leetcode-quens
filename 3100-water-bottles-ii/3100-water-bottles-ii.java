class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int Empty=numBottles;
        int res=numBottles;
        while(Empty>=numExchange){
            Empty=Empty-numExchange;
            res++;
            numExchange+=1;
            Empty=Empty+1;
        }
        return res;
    }
}