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

    List<Integer> resultList= new ArrayList<>();
    public List<Integer> inOrderTraversal(TreeNode root){
        if(root == null){
            return resultList;
        }
        inOrderTraversal(root.left);
        resultList.add(root.val);
        inOrderTraversal(root.right);
        return resultList;
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result= inOrderTraversal(root);
        return result.get(k-1);
        
    }
}