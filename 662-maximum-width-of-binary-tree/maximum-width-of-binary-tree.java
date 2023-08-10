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
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth = 0;
        Map<TreeNode,Integer> m = new HashMap<>();
        m.put(root,0);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            int left = m.get(q.peek());

            while(size-- > 0){
                TreeNode curr = q.poll();
                maxWidth = Math.max(maxWidth, m.get(curr) - left + 1);

                if(curr.left != null){
                    q.offer(curr.left);
                    m.put(curr.left,m.get(curr)*2);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                    m.put(curr.right,m.get(curr)*2 + 1);
                }
            }

        }
        return maxWidth;
    }
}