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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ls = new ArrayList<>();

        if(root == null){
            return ls;
        }

        findPath(root,"",ls);
        return ls;
    }

    private void findPath(TreeNode root , String path , List<String> ls){
        if(root.left == null && root.right == null){
            ls.add(path+root.val);
        }

        if(root.left != null){
            findPath(root.left,path+root.val+"->",ls);
        }
        if(root.right != null){
            findPath(root.right,path+root.val+"->",ls);
        }
    }
}