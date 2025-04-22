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

    public TreeNode array(int[] nums, int begin, int end){
        
        if(begin > end){
            return null;
        }
        int mid = (begin + end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=array(nums,begin, mid-1);
        root.right=array(nums,mid+1, end);
        return root;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        int begin=0, end=n-1;

        return array(nums, begin,end); 
    }
}