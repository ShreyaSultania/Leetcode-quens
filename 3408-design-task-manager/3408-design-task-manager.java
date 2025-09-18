class Pair implements Comparable<Pair>{
    int userId;
    int taskId;
    int priority;

    Pair(int userId,int taskId,int priority){
        this.userId=userId;
        this.taskId=taskId;
        this.priority=priority;
    }
        public int compareTo(Pair p){
            if( p.priority!=this.priority) return p.priority-this.priority;
            else return p.taskId-this.taskId;
        }
}
class TaskManager {
  PriorityQueue<Pair>pq=new PriorityQueue<>();
  HashMap<Integer,Pair>map=new HashMap<>();
    public TaskManager(List<List<Integer>> tasks) {
        for(int i=0;i<tasks.size();i++){
            int userId=tasks.get(i).get(0);
            int taskId=tasks.get(i).get(1);
            int priority=tasks.get(i).get(2);
            add(userId,taskId,priority);
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        Pair p=new Pair(userId,taskId,priority);
        pq.add(p);
        map.put(taskId,p);

    }
    
    public void edit(int taskId, int newPriority) {
        if(map.containsKey(taskId)){
            Pair old=map.get(taskId);
    
            Pair upd=new Pair(old.userId,taskId,newPriority);
            pq.add(upd);
            map.put(taskId,upd);
        }
    }
    
    public void rmv(int taskId) {
       
            map.remove(taskId);
        
    }
    
    public int execTop() {
    while (!pq.isEmpty()) {
        Pair top = pq.poll();
        Pair cur = map.get(top.taskId);
        if (cur != null && cur.priority == top.priority) {
            map.remove(top.taskId);
            return top.userId;
        }
    }
    return -1;
}

    
    }


/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */