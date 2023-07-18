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
        Map<TreeNode, Integer> map = new HashMap<>();
        map.put(root,0);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            int left = map.get(q.peek());

            while(size-- > 0){
                TreeNode node = q.poll();
                maxWidth = Math.max(maxWidth, map.get(node) - left + 1);

                if(node.left != null){
                    q.offer(node.left);
                    map.put(node.left, map.get(node)*2);
                }

                if(node.right != null){
                    q.offer(node.right);
                    map.put(node.right, map.get(node)*2+1);
                }
            }
        }

        return maxWidth;
    }
}