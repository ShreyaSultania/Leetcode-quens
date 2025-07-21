class Solution {
    public int Squares(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
       TreeSet<Integer>set=new TreeSet<>();
       while(n!=1 && !set.contains(n)){
        set.add(n);
       n=Squares(n);
       }
       return n==1;
    }
}