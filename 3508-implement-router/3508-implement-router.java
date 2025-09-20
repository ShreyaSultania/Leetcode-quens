class Triplet{
    int source;
    int destination;
    int timestamp;
  Triplet(int source,int destination,int timestamp){
    this.source=source;
    this.destination=destination;
    this.timestamp=timestamp;
  }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triplet)) return false;
        Triplet t = (Triplet) o;
        return source == t.source && destination == t.destination && timestamp == t.timestamp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destination, timestamp);
    }
}
class Router {
   int memoryLimit;
    public Router(int memoryLimit) {
        this.memoryLimit=memoryLimit;
    }
     Deque<Triplet>queue=new LinkedList<>();
     HashSet<Triplet>set=new HashSet<>();
    public boolean addPacket(int source, int destination, int timestamp) {
        Triplet t=new Triplet(source,destination,timestamp);
        if(!set.contains(t)){
        queue.addLast(t);
        set.add(t);
        if(memoryLimit<queue.size()){
           Triplet r= queue.removeFirst();
           set.remove(r);
        }
        return true;
        }
        else{
            return false;
        }
    }
    
    public int[] forwardPacket() {
        if(queue.size()==0) return new int[0];
        int arr[]=new int[3];
        Triplet t=queue.removeFirst();
        set.remove(t);
        arr[0]=t.source;
        arr[1]=t.destination;
        arr[2]=t.timestamp;
        return arr;
    }
    
    public int getCount(int destination, int startTime, int endTime) {
        int c=0;
        for(Triplet t:queue){
            if(t.destination==destination && t.timestamp>=startTime && t.timestamp<=endTime){
                c++;
            }
        }
        return c;
    }
}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */