class Solution {
    public int numSpecial(int[][] mat) {
       int row=mat.length;
       int col=mat[0].length;
       int c=0;
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(mat[i][j]==1){
                int a=i;
                int b=j;
                boolean flag=true;
                boolean flag1=true;
                for(int k=0;k<row;k++){
                    if(mat[k][b]==1 && k!=a) {
                        flag=false;
                        break;
                    }
                }
                for(int l=0;l<col;l++){
                      if(mat[a][l]==1 && l!=b) {
                        flag1=false;
                        break;
                    }
                }
                if(flag && flag1) c++;

            }
        }
       }
       return c;
    }
}