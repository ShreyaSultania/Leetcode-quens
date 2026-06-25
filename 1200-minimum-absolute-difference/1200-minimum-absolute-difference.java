class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int a=arr[i];
            int b=arr[i+1];
            int diff=Math.abs(b-a);
            minDiff=Math.min(diff,minDiff);
        }
        for(int i=0;i<n-1;i++){
            int a=arr[i];
            int b=arr[i+1];
            int diff=Math.abs(b-a);
            if(diff==minDiff){
                ArrayList<Integer>temp=new ArrayList<>();
                temp.add(a);
                temp.add(b);
                ans.add(temp);
            }
        }
        
        return ans;
    }
}