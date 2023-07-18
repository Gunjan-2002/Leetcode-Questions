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
    int preIndex = 0;
    TreeNode root = null;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if(preorder.length == 0 || postorder.length == 0){
            return null;
        }

        root = createTree(preorder, postorder, 0, postorder.length-1);

        return root;
    }

    private TreeNode createTree(int[] preorder, int[] postorder, int startPost, int endPost){
        if(startPost > endPost){
            return null;
        }

        TreeNode node = new TreeNode(preorder[preIndex]);

        ++preIndex;

        if(startPost == endPost){
            return node;
        }

        int postIndex = indexPostorder(postorder, startPost, endPost, preorder[preIndex]);

        if(postIndex == -1){
            return null;
        }

        node.left = createTree(preorder, postorder, startPost, postIndex);
        node.right = createTree(preorder, postorder, postIndex+1, endPost-1);

        return node;
    }

    private int indexPostorder(int postOrder[], int startIn, int endIn, int value){
        while(startIn <= endIn){
            if(value == postOrder[startIn]){
                return startIn;
            }
            startIn++;
        }
        return -1;
    }
}