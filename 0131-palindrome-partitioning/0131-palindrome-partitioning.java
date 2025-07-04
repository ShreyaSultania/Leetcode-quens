class Solution {
    boolean palindrome(String temp,int i,int j){
        while(i<=j){
            char ch=temp.charAt(i);
            char ch1=temp.charAt(j);
            if(ch!=ch1) return false;
            i++;
            j--;
        }
        return true;
    }
    void fun(List<List<String>>res,ArrayList<String>temp,int start,String s){
        if(start==s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<s.length();i++){
            if(palindrome(s,start,i)){
            temp.add(s.substring(start,i+1));
            fun(res,temp,i+1,s);
            temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        ArrayList<String> temp=new ArrayList<>();
        fun(res,temp,0,s);
        return res;
    }
}