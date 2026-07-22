/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Triplet implements Comparable<Triplet>{
     TreeNode node;
    int level;
    int idx;
    Triplet(TreeNode node,int level,int idx){
        this.node=node;
        this.level=level;
        this.idx=idx;
    }
     public int compareTo(Triplet p){
        if(p.idx!=this.idx){
            return this.idx-p.idx;
        }
        if(p.level!=this.level){
            return this.level-p.level;
        }
        return this.node.val-p.node.val;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<Triplet>q=new LinkedList<>();
        PriorityQueue<Triplet>pq=new PriorityQueue<>();
        q.add(new Triplet(root,0,0));
        while(q.size()>0){
            Triplet p=q.remove();
            pq.add(p);
            if(p.node.left!=null){
                q.add(new Triplet(p.node.left,p.level+1,p.idx-1));
            }
            if(p.node.right!=null){
                q.add(new Triplet(p.node.right,p.level+1,p.idx+1));
            }
        }
        while(pq.size()>0){
            ArrayList<Integer>temp=new ArrayList<>();
            Triplet t=pq.remove();
            temp.add(t.node.val);
            while(pq.size()>0 && t.idx==pq.peek().idx){
               Triplet x=pq.remove();
               temp.add(x.node.val);
            }
            ans.add(temp);
        }
        return ans;
    }
}