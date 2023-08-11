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
    Integer pre;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        pre=null;
        inOrder(root);
        return ans;
    }

    private void inOrder(TreeNode root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        if(pre != null){
            ans = Math.min(ans , Math.abs(root.val-pre));
        }
        pre = root.val;
        inOrder(root.right);
    }
}