class Pair implements Comparable<Pair>{
    int val;
    int freq;
    Pair(int val,int freq){
        this.val=val;
        this.freq=freq;
    }
    public int compareTo(Pair p){
        return this.freq-p.freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
        }
        for(int ele:map.keySet()){
            pq.add(new Pair(ele,map.get(ele)));
            if(pq.size()>k){
                pq.remove();
            }
        }
        int i=0;
        int []arr=new int[k];
        while(pq.size()>0){
            Pair p=pq.remove();
            arr[i++]=p.val;
        }
        return arr;
    }
}