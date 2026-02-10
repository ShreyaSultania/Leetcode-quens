class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=gifts.length;
    long total=0;
        for(int i=0;i<n;i++){
            pq.add(gifts[i]);
        }
        while(k-->0){
            int p=pq.remove();
            int q=(int)Math.sqrt(p);
            pq.add(q);
        }
        while(pq.size()>0){
            total+=pq.remove();
        }
        return total;
    }
}