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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode temp = root;
        Stack<TreeNode>st = new Stack<>();
        st.push(root);
        for(int i= 1;i<preorder.length;i++){
            TreeNode node = new TreeNode(preorder[i]);
            if(node.val < st.peek().val){
                temp = st.peek();
                temp.left = node;
                temp = node;
                st.push(node);
            }
            if(node.val >  st.peek().val){
                while( !st.isEmpty() && st.peek().val < node.val ){
                    temp= st.pop();
                }
    temp.right = node;
                st.push(node);
            }
            
        }
        return root;
    }
}