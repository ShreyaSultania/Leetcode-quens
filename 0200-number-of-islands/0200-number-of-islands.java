class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class Solution {
    void bfs(char[][] grid,boolean [][]visited,int i, int j){
        Queue<Pair>q=new LinkedList<>();
        if(grid[i][j]=='1'){
        q.add(new Pair(i,j));
        visited[i][j]=true;
        }
        while(!q.isEmpty()){
            Pair ele=q.remove();
            int row=ele.a;
            int col=ele.b;
            //   no need to check left and top if it return then we cant reach there and no calls of bfs
            //  right
            if(col+1<grid[0].length){
            if(grid[row][col+1]=='1' && visited[row][col+1]==false){
                q.add(new Pair(row,col+1));
                visited[row][col+1]=true;
            }
            }
            // down
             if(row+1<grid.length){
           if( grid[row+1][col]=='1' && visited[row+1][col]==false){
                q.add(new Pair(row+1,col));
                visited[row+1][col]=true;
            }
            }
            // top
            if(row-1>=0){
           if( grid[row-1][col]=='1' && visited[row-1][col]==false){
                q.add(new Pair(row-1,col));
                visited[row-1][col]=true;
            }
            }
            // left
            if(col-1>=0){
           if( grid[row][col-1]=='1' && visited[row][col-1]==false){
                q.add(new Pair(row,col-1));
                visited[row][col-1]=true;
            }
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        boolean [][]visited=new boolean[grid.length][grid[0].length];
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    // bfs(grid,visited,i,j);
                       dfs(grid,visited,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    void dfs(char[][] grid,boolean [][]visited,int i, int j){
        visited[i][j]=true;
        if(i-1>=0 && grid[i-1][j]=='1' && visited[i-1][j]==false)dfs(grid,visited,i-1,j);
        if(i+1<grid.length && grid[i+1][j]=='1' && visited[i+1][j]==false)dfs(grid,visited,i+1,j);
        if(j-1>=0 && grid[i][j-1]=='1' && visited[i][j-1]==false)dfs(grid,visited,i,j-1);
        if(j+1<grid[0].length && grid[i][j+1]=='1' && visited[i][j+1]==false)dfs(grid,visited,i,j+1);
    }

}