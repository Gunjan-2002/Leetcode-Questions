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
    public List<Integer> rightSideView(TreeNode root) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      left(root,list,0);
      
      return list;
    }

    private void left(TreeNode node , ArrayList<Integer> list , int level){
        if(node == null){
            return;
        }
        
        if(list.size() == level){
            list.add(node.val);
        }
        
        left(node.right,list,level+1);
        left(node.left,list,level+1);

    }
}