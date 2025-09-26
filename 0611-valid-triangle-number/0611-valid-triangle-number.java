class Solution {
    public int triangleNumber(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        //condition for triangle there r 3 side of triangle where
        // a+b>c && b+c>a && a+c>b
        // here if we fix one at max(c) then we dont need to check 2nd and third contion because if we add any no. in c it will automatically increase
        // solution
        // here fix c at max;
        for(int c=nums.length-1;c>=2;c--){
             int a=0;
             int b=c-1;
             while(a<b){
                if(nums[a]+nums[b]>nums[c]){
                    count+=(b-a);
                    b--;
                }
                else a++;
             }
        }
        return count;
       
        }
    
}