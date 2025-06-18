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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {

        List<Integer> list = new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();

        inorder(root, list);

        for(int q: queries){

            List<Integer> l1 = new ArrayList<>();

            int t1=lb(list, q);
            int t2=ub(list, q);

            if(t2 == list.size()){
                l1.add(-1);
            }else{
                l1.add(list.get(t2));
            }

            if(t1 == list.size()){
                l1.add(-1);
            }else{
                l1.add(list.get(t1));
            }
            res.add(l1);
        }
        return res;
    }

    public void inorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    //finding lower bound

    public int lb(List<Integer> l, int x){
        int i=0;
        int j=l.size()-1;
        int ans= l.size();

        while(i <= j){
            int mid = (i + j) / 2;

            if(l.get(mid) >=  x){
                ans=mid;
                j=mid-1;
            }else{
                i = mid+1;
            }
        }
        return ans;
    }

    //finding upper bound

    public int ub(List<Integer> l, int x){
        int i=0;
        int j=l.size()-1;

        int ans = l.size();

        while(i <= j){
            int mid = (i + j)/2;

            if(l.get(mid) <= x){
                i = mid+1;
                ans= mid;
            }else{
                j = mid - 1;
            }
        }
        return ans;
    }
}