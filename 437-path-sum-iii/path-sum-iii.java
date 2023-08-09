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
    int ans = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }

        findPath(root,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);

        return ans;
    }

    private void findPath(TreeNode root, int target){
        if(root == null || root.val == Math.pow(10,9)){
            return;
        }

        if(target == root.val){
            ans++;
        }

        findPath(root.left,target-root.val);
        findPath(root.right,target-root.val);
    }
}