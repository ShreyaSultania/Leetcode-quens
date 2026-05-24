class Solution {
    void dfs(int [][]mat,boolean []visited,int idx){
        visited[idx]=true;
        for(int j=0;j<mat.length;j++){
            if(mat[idx][j]==1 &&!visited[j]){
                dfs(mat,visited,j);
            }
        }
    }
    public int findCircleNum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        boolean []visited=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(mat,visited,i);
                c++;
            }
        }
        return c;
    }
}