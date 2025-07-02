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
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        return helper1(root , subroot);
    }
    public boolean helper1(TreeNode root , TreeNode sroot){
        if(root == null){
            return false;
        }
        if(helper2(root , sroot)){
            return true;
        }
        return helper1(root.left , sroot)||helper1(root.right , sroot);
    }
    public boolean helper2(TreeNode root , TreeNode sroot){
        if(root== null  && sroot == null){
            return true;
        }
        if(root == null || sroot == null){
            return false;
        }
        if(root.val != sroot.val){
            return false;
        }
        return helper2(root.left , sroot.left) && helper2(root.right  , sroot.right);
    }
}