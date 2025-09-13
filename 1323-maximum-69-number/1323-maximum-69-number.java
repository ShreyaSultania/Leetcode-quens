class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer>arr=new ArrayList<>();
        int temp=num;
        int max=num;
        int c=-1;
        while(num!=0){
            c++;
            int rem=num%10;
            if(rem==6){
              double p=Math.pow(10,c);
              int n=temp+(int)p*3;
              max=Math.max(max,n);
            }
            num=num/10;
            
        }
       return max;

    }
}