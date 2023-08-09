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
    TreeNode root = null;
    int indexInPreorder = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        root = buildTreeHelper(preorder,inorder,0,inorder.length-1);
        return root;
    }

    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int startInOrder, int endInOrder){
        if(indexInPreorder >= preorder.length){
            return null;
        }

        TreeNode newNode = new TreeNode(preorder[indexInPreorder]);

        int indexinInorder = findIndex(preorder[indexInPreorder], inorder, startInOrder, endInOrder);

        if(indexinInorder == -1){
            return null;
        }

        indexInPreorder++;
 
        newNode.left = buildTreeHelper(preorder, inorder, startInOrder, indexinInorder-1);
        newNode.right = buildTreeHelper(preorder, inorder, indexinInorder, endInOrder);

        return newNode;
    }

    private int findIndex(int search, int[] inorder, int startInOrder, int endInOrder){
            while(startInOrder <= endInOrder){
                if(search == inorder[startInOrder]){
                    return startInOrder;
                }else{
                    startInOrder++;
                }
            }
            return -1;
        }
}