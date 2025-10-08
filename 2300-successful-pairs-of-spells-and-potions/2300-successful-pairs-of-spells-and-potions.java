class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int m=potions.length;
        Arrays.sort(potions);
        ArrayList<Integer>res=new ArrayList<>();
        int i=0;
        while(i<n){
           int low=0;
           int high=m-1;
           int ans=0;
           while(low<=high){
            int mid=(low+high)/2;
            if((long)spells[i]*potions[mid]>=success){
                ans=m-mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
           }
            res.add(ans);
           i++;
        }
        int[]arr=new int[res.size()];
        for(int k=0;k<res.size();k++){
            arr[k]=res.get(k);
        }
        return arr;
    }
}