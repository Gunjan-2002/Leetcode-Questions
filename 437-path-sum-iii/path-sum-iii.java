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
    int ans=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }

        numberOfPathFromRoot(root,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);

        return ans;
    }

    private void numberOfPathFromRoot(TreeNode root, int targetSum){
        // if(root == null){
        //     return;
        // }
        if (root == null || root.val == Math.pow(10,9)) return;


        if(root.val == targetSum){
            ans++;
        }
        targetSum = targetSum - root.val;
        numberOfPathFromRoot(root.left,targetSum);
        numberOfPathFromRoot(root.right,targetSum);
    }
}