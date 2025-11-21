class Pair implements Comparable <Pair>{
   int a;
   int b;
   Pair(int a,int b){
    this.a=a;
    this.b=b;
   }
   public int compareTo(Pair p){
    return this.a-p.a;
   }
}
class Solution {
    public int[][] merge(int[][] nums) {
        List<Pair>intervals=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i][0];
            int b=nums[i][1];
            intervals.add(new Pair(a,b));
        }
        Collections.sort(intervals);

        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<intervals.size();i++){
            int a=intervals.get(i).a;
            int b=intervals.get(i).b;
          
            for(int j=i+1;j<intervals.size();j++){
                int x=intervals.get(j).a;
                int y=intervals.get(j).b;
                if(b>=x){
                    b=Math.max(b,y);
                    i++;
                }
                else{
                    break;
                }
            }
            List<Integer> temp=new ArrayList<>();
            temp.add(a);
            temp.add(b);

            ans.add(temp);
        }

        int[][] m=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            m[i][0]=ans.get(i).get(0);
            System.out.print(ans.get(i).get(0) +" " +ans.get(i).get(1));
            m[i][1]=ans.get(i).get(1);
        }
        return m;
    }
}