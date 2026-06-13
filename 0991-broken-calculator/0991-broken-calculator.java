class Solution {
    public int brokenCalc(int startValue, int target) {
        int op=0;
        while(startValue!=target){
            if(target<startValue){
                target+=1;
                op++;
            }
            else if(target%2!=0){
                target+=1;
                op++;
            }
            else{
                target=target/2;
                op++;
            }
        }
        return op;
    }
}