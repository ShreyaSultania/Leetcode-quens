class Solution {
    public int numberOfPairs(int[][] points) {
        int c=0;
        for(int i=0;i<points.length;i++){
            int x1=points[i][0];
            int y1=points[i][1];
            for(int j=0;j<points.length;j++){
                int x2=points[j][0];
                int y2=points[j][1];
                if(i!=j && x1>=x2 && y2>=y1){
                int maxx=Math.max(x1,x2);
                int maxy=Math.max(y1,y2);
                int minx=Math.min(x1,x2);
                int miny=Math.min(y1,y2);
                boolean inside=false;
                for(int k=0;k<points.length;k++){
                    if(k==i || k==j) continue;
                    int x=points[k][0];
                    int y=points[k][1];
                   
                    if(((minx<=x)&&(x<=maxx)) && ((miny<=y)&&(y<=maxy))){
                        inside=true;
                        break;
                    }
                }
                
                if(!inside) c++;
            }
            }
            
        }
        return c;
    }
}