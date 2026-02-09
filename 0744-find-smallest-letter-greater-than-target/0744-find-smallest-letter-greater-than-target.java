class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
        char ans=letters[0];
        while(low<high){
            int mid=(low+high)/2;
            if(letters[mid]>target){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        if(letters[low]<=target) return letters[0];
        return letters[low];
    }
}