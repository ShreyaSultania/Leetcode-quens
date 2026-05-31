class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        boolean flag=false;
        long mas=mass;
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]<=mas){
                mas+=asteroids[i];
                flag=true;
                // asteroid destroy
            }
            // planet destroy
            else{
                flag=false;
            }
        }
        return flag;
    }
}