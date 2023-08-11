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
    // ASSUME THAT YOU ARE SOLVING FOR THE TREE WHICH CONTAINS ONLY TWO LEVEL
    // I.E ROOT NODE AND ITS TWO LEFT AND RIGHT CHILD.
    // THIS WILL HELP YOU TO UNDERSTAND THE RECURSIVE SOLUTION EASILY.
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }

        int sum = 0;

        // THIS IS FOR ROOT VALUE IF CONDITION SATISFIES
        if(root.val >= low && root.val <= high){
            sum += root.val;
        }

        // THIS WILL RECURSIVELY GIVE ME SUM FOR THE LEFT SUBTREE
        // IF LOW < ROOT.VALUE
        if(low < root.val){
            sum += rangeSumBST(root.left,low,high);
        }

        // THIS WILL RECURSIVELY GIVE ME SUM FOR THE RIGHT SUBTREE
        // IF HIGH > ROOT.VALUE
        if(high > root.val){
            sum += rangeSumBST(root.right,low,high);
        }

        return sum;
    }
}