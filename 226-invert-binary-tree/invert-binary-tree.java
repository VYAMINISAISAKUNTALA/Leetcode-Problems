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

    public void swap(TreeNode left, TreeNode right){
        TreeNode temp=null;
        temp.val=left.val;
        left.val=right.val;
        right.val=temp.val;
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode leftSubTree = invertTree(root.left);
        TreeNode rightSubTree= invertTree(root.right);

        root.left= rightSubTree;
        root.right = leftSubTree;

        //swap(address1,address2);

        return root;
    }
}