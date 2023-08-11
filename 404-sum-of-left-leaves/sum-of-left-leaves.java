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
    int total=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }

        sumLeft(root,false);
        return total;
    }

    private void sumLeft(TreeNode root , boolean isLeft){
        if(root == null){
            return;
        }

        if(isLeft == true && root.left == null && root.right == null){
            total = total + root.val;
            // return;
        }

        sumLeft(root.left,true);
        sumLeft(root.right,false);
        // return;
    }
}