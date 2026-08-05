class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            set.add(arr[i]);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}