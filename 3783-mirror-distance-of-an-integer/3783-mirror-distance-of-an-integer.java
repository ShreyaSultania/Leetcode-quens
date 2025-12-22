class Solution {
    public int mirrorDistance(int n) {
        int reverseNum=0;
        int temp=n;
        while(temp!=0){
            int rem=temp%10;
            reverseNum=reverseNum*10+rem;
            temp=temp/10;
        }
        System.out.println(reverseNum);
        return Math.abs(n-reverseNum);
    }
}