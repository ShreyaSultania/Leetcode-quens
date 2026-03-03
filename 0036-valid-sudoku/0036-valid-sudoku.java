class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < col; j++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j]))
                        return false;
                    else
                        set.add(board[i][j]);
                }
            }
        }
        for (int i = 0; i < col; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < row; j++) {
                if (board[j][i] != '.') {
                    if (set.contains(board[j][i]))
                        return false;
                    else
                        set.add(board[j][i]);
                }
            }
        }
        for(int i=0;i<row;i+=3){
            for(int j=0;j<col;j+=3){
                HashSet<Character>set=new HashSet<>();
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        if(board[i+k][j+l]!='.'){
                         if (set.contains(board[i+k][j+l]))
                            return false;
                        else
                            set.add(board[i+k][j+l]);
                            }
                    }
                }
            }
        }
        return true;
    }
}