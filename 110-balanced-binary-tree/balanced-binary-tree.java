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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int leftD = depth(root.left);
        int rightD = depth(root.right);

        if(Math.abs(leftD-rightD) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }

        return Math.max(depth(root.left),depth(root.right)) + 1;
    }
}