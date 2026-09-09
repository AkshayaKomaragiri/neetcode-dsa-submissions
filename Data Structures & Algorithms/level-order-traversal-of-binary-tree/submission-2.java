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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> line = new ArrayDeque<>();
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) return list;
        line.add(root);
        while (!line.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            for (int i = line.size(); i > 0; i--) {
                TreeNode node = line.poll();
               // System.out.println(node.val);
                level.add(node.val);
                if (node.left != null)
                    line.add(node.left);
                if (node.right != null)
                    line.add(node.right);
            }
            if (level.size()>0){
                list.add(level);
            }
        }
        return list;
    }
}
