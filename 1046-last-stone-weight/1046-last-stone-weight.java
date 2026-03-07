class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int p=pq.remove();
            int q=pq.remove();
            if(p!=q) pq.add(Math.abs(p-q));
        }
        if(pq.size()==0) return 0;
        else return pq.peek();
    }
}