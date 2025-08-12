class Solution {
    public List<Integer> getRow(int row) {
        ArrayList<Integer>arr=new ArrayList<>();
        // arr.add(1);
        long res=1;
        for(int i=0;i<=row;i++){
            arr.add((int)res);
            res=res*(row-i);
            res=res/(i+1);
            
        }
        return arr;
    }
}