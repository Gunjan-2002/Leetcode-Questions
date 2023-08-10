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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // if(root == null){
        //     return new TreeNode(val);
        // }

        // if(val < root.val){
        //     root.left = insertIntoBST(root.left,val);
        // }else{
        //     root.right = insertIntoBST(root.right,val);
        // }

        // return root;

        TreeNode newNode = new TreeNode(val);

        TreeNode parent = null;
        TreeNode curr = root;

        while(curr != null){
            parent = curr;
            if(val < curr.val){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }

        if(parent == null){
            return newNode;
        }

        if(val < parent.val){
            parent.left = newNode;
        }else{
            parent.right = newNode;
        }

        return root;
    }
}