class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int c=0;
        for(int i=1;i<=1000;i++){
            if(!set.contains(i)){
                c++;
            }
            if(c==k) return i;
        }
        return -1;
    }
}