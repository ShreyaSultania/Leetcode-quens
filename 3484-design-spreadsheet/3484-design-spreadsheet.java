class Spreadsheet {
   HashMap<String,Integer>map=new HashMap<>();
    public Spreadsheet(int rows) {
    }
    
    public void setCell(String cell, int value) {
        map.put(cell,value);
    }
    
    public void resetCell(String cell) {
        map.remove(cell);
    }
    
    public int getValue(String formula) {
        int sum=0;
       String[] s=formula.substring(1).split("\\+");
       for(int i=0;i<s.length;i++){
        String str=s[i];
        char ch=str.charAt(0);
        if(Character.isDigit(ch)){
            sum=sum+(Integer.parseInt(str));
        }
        else{
            sum+=map.getOrDefault(str,0);
        }
       }
       return sum;

       }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */