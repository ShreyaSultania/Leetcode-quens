class Solution {
    int length(int n){
        int size=0;
        int temp=n;
        while(temp!=0){
            int rem=temp%10;
            size++;
            temp=temp/10;
        }
        return size;
    }
    public int countCommas(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            int l=length(i);
            if(l>3){
                c+=(l-1)/3;
            }
//   System.out.print(l/3);
        }
        return c;
    }
}