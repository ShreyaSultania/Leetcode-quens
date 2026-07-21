class Solution {
    void bfs(List<List<Integer>> rooms, boolean []visited,int ele){
        Queue<Integer>q=new LinkedList<>();
        visited[ele]=true;
        q.add(ele);
        while(q.size()>0){
            int e=q.remove();
            for(int i=0;i<rooms.get(e).size();i++){
                if(!visited[rooms.get(e).get(i)]){
                q.add(rooms.get(e).get(i));
                visited[rooms.get(e).get(i)]=true;
                }
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean []visited=new boolean[n+1];
        bfs(rooms,visited,0);
        for(int i=0;i<n;i++){
            if(!visited[i]) return false;
        }
        return true;
    }
}