class Solution {
    TreeNode helper(int[]arr,int low,int high){
       if(low>high) return null;
        int mid=(low+high)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=helper(arr,low,mid-1);
        node.right=helper(arr,mid+1,high);
       return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return helper(nums,0,n-1);
    }
}