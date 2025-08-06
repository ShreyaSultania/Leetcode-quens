class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        HashMap<Integer,Integer>map1=new HashMap<>();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i],1);
            }
            else{
                int freq=map.get(nums1[i]);
                map.put(nums1[i],freq+1);
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(!map1.containsKey(nums2[i])){
                map1.put(nums2[i],1);
            }
            else{
                int freq=map1.get(nums2[i]);
                map1.put(nums2[i],freq+1);
            }
        }
        for(int i=0;i<nums1.length;i++){
            if(map1.containsKey(nums1[i])){
                int freq=map1.get(nums1[i]);
                if(freq==0) map1.remove(nums1[i]);
               else{
                map1.put(nums1[i],freq-1);
                 arr.add(nums1[i]);
               } 
            }
        }
        int a[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i]=arr.get(i);
        }
        return a;
    }
}