
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
         int brr[]=new int[n];
         HashMap<Integer,Integer>map=new HashMap<>();
         for(int i=0;i<n;i++){
            brr[i]=arr[i];
         }
         Arrays.sort(brr);
         int c=1;
        for(int i=0;i<n;i++){
           if(!map.containsKey(brr[i])){
            map.put(brr[i],c++);
           }
        }
         int ans[]=new int[n];

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                ans[i]=map.get(arr[i]);
            }
        }
        return ans;
    }
}