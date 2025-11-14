class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer>rows=new ArrayList<>();
        List<Integer>cols=new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i=0;i<rows.size();i++){
            for(int j=0;j<col;j++){
                matrix[rows.get(i)][j]=0;
            }
        }
        for(int i=0;i<cols.size();i++){
            for(int j=0;j<row;j++){
                matrix[j][cols.get(i)]=0;
            }
        }
    }
}