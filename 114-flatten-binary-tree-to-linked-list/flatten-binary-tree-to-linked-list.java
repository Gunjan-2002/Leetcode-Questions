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
    public void flatten(TreeNode root) {
        toLL(root);
    }

    private TreeNode toLL(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode leftChild = toLL(root.left);
        TreeNode rightChild = toLL(root.right);

        TreeNode extremeRightOfLC = leftChild;

        while(extremeRightOfLC != null && extremeRightOfLC.right != null){
            extremeRightOfLC = extremeRightOfLC.right;
        }

        if(extremeRightOfLC != null){
            extremeRightOfLC.right = rightChild;
            root.right = leftChild;
        }

        root.left = null;
        return root;
    }
}