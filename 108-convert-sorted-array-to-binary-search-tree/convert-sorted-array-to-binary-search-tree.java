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
    // TreeNode root = null;
    public TreeNode sortedArrayToBST(int[] nums) {
        return tree(nums,0,nums.length-1);
    }

    private TreeNode tree(int[] nums, int low, int high){
        if(low > high){
            return null;
        }

        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = tree(nums,low,mid-1);
        root.right = tree(nums,mid+1,high);

        return root;
    }
}