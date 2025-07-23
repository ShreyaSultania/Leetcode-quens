class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int idx=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums1[i])){
                int freq=map.get(nums1[i]);
                map.put(nums1[i],freq);
            }
            else{
                map.put(nums1[i],1);
            }
        }
        HashMap<Integer,Integer>mapCheck=new HashMap<>();
        for(int i=0;i<m;i++){
            if(map.containsKey(nums2[i]) && !mapCheck.containsKey(nums2[i])){
              mapCheck.put(nums2[i],1);
            }
        }
        ArrayList<Integer>arr=new ArrayList<>();
       for(int ele: mapCheck.keySet()){
           arr.add(ele);
       }
       int brr[]=new int[arr.size()];
       for(int i=0;i<arr.size();i++){
        brr[i]=arr.get(i);
       }
       return brr;
    }
}