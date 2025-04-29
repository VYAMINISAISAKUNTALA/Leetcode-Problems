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

    public void inOrderTraversal(TreeNode root, List<Integer> result){
        if(root == null) return;
        inOrderTraversal(root.left, result);
        result.add(root.val);
        inOrderTraversal(root.right, result);
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;

        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i: result){
            if(hm.containsKey(k-i)){
                return true;
            }
            hm.put(i, Math.abs(i-k));
        }
        
        return false;
    }
}