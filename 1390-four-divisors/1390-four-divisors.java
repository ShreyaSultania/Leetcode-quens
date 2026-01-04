class Solution {
    public int countDivisor(int n){
        int c=0;
        int sum=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){
                    sum+=i;
                    c++;
                }
                else{
                sum+=i;
                sum+=(n/i);
                System.out.println(sum);
                c+=2;
                }
                // System.out.println(c);
                if(c>4){
                    return 0;
                }
            }
        }
        if(c==4) return sum;
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+= countDivisor(nums[i]);
        }
        return sum;
    }
}