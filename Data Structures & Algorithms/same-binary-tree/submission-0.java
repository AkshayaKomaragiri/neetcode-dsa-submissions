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

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q== null) return true;
        if (p== null ^ q==null) return false;

        //System.out.println("p: " + p.val + ", q: " + q.val);
        
        if (p.val != q.val){
           // System.out.println("found inconsistency");
            return false;
        }
      
        if (!isSameTree(p.left, q.left)){
          //  System.out.println("retreived inconsistency on left");
            return false;
        }
       if (!isSameTree(p.right, q.right)){
          //  System.out.println("retreived inconsistency on right");

        return false;
       }
        
        return true;
    }
    

}
