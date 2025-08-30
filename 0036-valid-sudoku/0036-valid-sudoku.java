class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int j=0;j<col;j++){
                if(board[i][j]=='.') continue;
                int ele=board[i][j]-'0';
                if(!map.containsKey(ele)){
                    map.put(ele,1);
                }
                else{
                    int freq=map.get(ele);
                    map.put(ele,freq+1);
                }
            }
            for(int key:map.keySet()){
            int f=map.get(key);
            if(key<1 || key>9) return false;
            if(f>1) return false;
        }
        }

        // 
         for(int i=0;i<col;i++){
             HashMap<Integer,Integer>map1=new HashMap<>();
            for(int j=0;j<row;j++){
                if(board[j][i]=='.') continue;
                int ele=board[j][i]-'0';
                if(!map1.containsKey(ele)){
                    map1.put(ele,1);
                }
                else{
                    int freq=map1.get(ele);
                    map1.put(ele,freq+1);
                }
            }
             for(int key:map1.keySet()){
            int f=map1.get(key);
            if(key<1 || key>9) return false;
            if(f>1) return false;
        }
        }
        for(int i=0;i<row;i+=3){
            for(int j=0;j<col;j+=3){
                HashMap<Integer,Integer>map2=new HashMap<>();
                for(int k=0;k<=2;k++){
                    for(int l=0;l<=2;l++){
                         if(board[i+k][j+l]=='.') continue;
                         int ele=board[i+k][j+l]-'0';
                         if(!map2.containsKey(ele)){
                    map2.put(ele,1);
                }
                else{
                    int freq=map2.get(ele);
                    map2.put(ele,freq+1);
                }
                    }
                }
                for(int key:map2.keySet()){
            int f=map2.get(key);
            if(key<1 || key>9) return false;
            if(f>1) return false;
            }
        }
        }
        return true;
    }
}