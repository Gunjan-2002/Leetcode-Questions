/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }

        // To understand this question only think about root node and solve for root node

        // if we get element on the root
        if(root.val == p.val || root.val == q.val){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        // if both roots are in right sub tree
        if(left == null){
            return right;
        }

        // if both roots are in left sub tree
        if(right == null){
            return left;
        }

        // If one is present in left and other in right sub tree then return root
        return root;
    }
}