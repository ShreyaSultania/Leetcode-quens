class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum=0;
        for(int i=0;i<triangle.size();i++){
              int min=Integer.MAX_VALUE;
            for(int j=0;j<triangle.get(i).size();j++){
                min=Math.min(min,triangle.get(i).get(j));
              
            }
              sum=sum+min;
        }
        return sum;
    }
}