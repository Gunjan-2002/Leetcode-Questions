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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> l = new ArrayList<>();

        if(root == null){
            return l;
        }

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();

            ArrayList<Integer> a = new ArrayList<>();

            for(int i=0;i<size;i++){
                root = q.poll();

                a.add(root.val);

                if(root.left != null){
                    q.offer(root.left);
                }

                if(root.right != null){
                    q.offer(root.right);
                }

            }

            l.add(a);
        }

        return l;
    }
}