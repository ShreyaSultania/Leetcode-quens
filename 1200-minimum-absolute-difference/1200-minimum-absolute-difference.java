class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>>ans=new ArrayList<>();
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int val=Math.abs(arr[i]-arr[i+1]);
            if(val<=min){
                min=val;
                ArrayList<Integer>temp=new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                ans.add(temp);
            }
            
        }
        return ans;
    }
}