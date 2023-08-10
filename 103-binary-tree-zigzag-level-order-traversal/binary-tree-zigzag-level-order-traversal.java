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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();

        if(root == null){
            return l;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean ltr = true;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> sub = new ArrayList<>();

            while(size-- > 0){
                TreeNode curr = q.poll();

                if(ltr == true){
                    sub.add(curr.val);
                }else{
                    sub.add(0,curr.val);
                }

                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            ltr = !ltr;
            l.add(sub);
        }

        return l;
    }
}