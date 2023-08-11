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
    List<Integer> inO = new ArrayList<>(); 
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        inOrder(root);
        List<List<Integer>> ls = new ArrayList<>();

        for(Integer i : queries){
            int min = getLargestInSmallest(i);
            int max = getSmallestInLargest(i);
            List<Integer> sub = new ArrayList<>();
            sub.add(min);
            sub.add(max);
            ls.add(sub);
        }
        return ls;
    }

    private int getSmallestInLargest(int val){
        int ans = -1;
        int first = 0;
        int last = inO.size()-1;

        while(first <= last){
            int mid = (first+last)/2;
            if(inO.get(mid) == val){
                return val;
            }

            if(inO.get(mid) > val){
                ans = inO.get(mid);
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return ans;
    }

    private int getLargestInSmallest(int val){
        int ans = -1;
        int first = 0;
        int last = inO.size()-1;

        while(first <= last){
            int mid = (first+last)/2;
            if(inO.get(mid) == val){
                return val;
            }

            if(inO.get(mid) > val){
                last = mid - 1;
            }else{
                ans = inO.get(mid);
                first = mid + 1;
            }
        }
        return ans;
    }

    private void inOrder(TreeNode root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        inO.add(root.val);
        inOrder(root.right);
    }
}