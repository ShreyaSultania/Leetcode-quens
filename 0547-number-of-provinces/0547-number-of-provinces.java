class Solution {
    void bfs(int ele,int[][]mat,boolean[]visited){
        Queue<Integer>q=new LinkedList<>();
        visited[ele]=true;
        q.add(ele);
        while(q.size()>0){
            int top=q.remove();
            for(int i=0;i<mat.length;i++){
                if(mat[top][i]==1 && !visited[i]){
                     visited[i]=true;
                     q.add(i);
                }
            }
        }
    }
    public int findCircleNum(int[][] mat) {
        int n=mat.length;
        int c=0;
        boolean []visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i,mat,visited);
                c++;
            }
        }
        return c;
    }
}