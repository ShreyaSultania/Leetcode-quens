 class Pair implements Comparable <Pair>{
    int ele;
    int frequency;
    Pair(int ele,int frequency){
        this.ele=ele;
        this.frequency=frequency;
    }
    public int compareTo(Pair p){
        if(this.frequency==p.frequency) return this.ele-p.ele;
        return this.frequency-p.frequency;
    }

}
class Solution {
    public long[] findXSum(int[] nums, int k, int x){
        int n=nums.length;
        long []ans=new long[n-k+1];
        for(int i=0;i<n-k+1;i++){
            HashMap<Integer,Integer>map=new HashMap<>();
            int a=x;
            for(int j=i;j<i+k;j++){
                if(!map.containsKey(nums[j])){
                    map.put(nums[j],1);
                }
                else{
                    int freq=map.get(nums[j]);
                    map.put(nums[j],freq+1);
                }
            }
            PriorityQueue<Pair>pq=new PriorityQueue<>(Collections.reverseOrder());
            for(int e:map.keySet()){
                int freq=map.get(e);
                pq.add(new Pair(e,freq));
            }
            while(!pq.isEmpty() && a>0){
                Pair p=pq.remove();
                long c=p.ele;
                long d=p.frequency;
                ans[i]+=c*d;
                a--;
            }
        }
        return ans;
    }
}
    
