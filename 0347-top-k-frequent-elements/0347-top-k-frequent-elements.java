class Pair implements Comparable<Pair>{
    int ele;
    int freq;
    Pair(int ele,int freq){
        this.ele=ele;
        this.freq=freq;
    }
    public int compareTo(Pair p){
        return p.freq-this.freq;
    }
}
 class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []arr=new int[k];
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
        }
        for(int ele:map.keySet()){
            int freq=map.get(ele);
            pq.add(new Pair(ele,freq));
        }
        int idx=0;
        while(k-->0){
            arr[idx++]=pq.remove().ele;
        }
        return arr;
    }
}