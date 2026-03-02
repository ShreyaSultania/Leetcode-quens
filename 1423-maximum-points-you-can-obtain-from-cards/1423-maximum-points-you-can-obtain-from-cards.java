class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i=0;
        int j=i+k-1;
        int n=cardPoints.length;
        int last=n-1;
        int leftSum=0;
        int rightSum=0;
        int maxSum=0;
        while(i<=j){
            leftSum+=cardPoints[i];
            i++;
        }
        maxSum=Math.max(maxSum,leftSum);
        while(j>=0){
            leftSum-=cardPoints[j];
            rightSum+=cardPoints[last];
            last--;
            maxSum=Math.max(maxSum,leftSum+rightSum);
            j--;
        }
        return maxSum;
    }
}