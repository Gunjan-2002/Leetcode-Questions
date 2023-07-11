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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int sum = 0;
        if (root.val >= low && root.val <= high) sum += root.val;
        if (root.val > low) sum += rangeSumBST(root.left, low, high);
        if (root.val < high) sum += rangeSumBST(root.right, low, high);

        return sum;
    }

    public int rangeSum(TreeNode root, int low, int high) {
        if(root == null) return 0;

        int leftS = rangeSum(root.left,low,high);
        int rightS = rangeSum(root.right,low,high);
        int rootS = root.val;

        if((leftS >= low && leftS <= high)){
            ans += leftS;
        }

        if((rightS >= low && rightS <= high)){
            ans += rightS;
        }
        
        if((rootS >= low && rootS <= high)){
            ans += rootS;
        }

        return ans;
    }
}