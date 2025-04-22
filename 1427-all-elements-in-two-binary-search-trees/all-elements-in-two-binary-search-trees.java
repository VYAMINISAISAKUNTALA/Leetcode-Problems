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

    public void inOrderTraversal(TreeNode node,List<Integer> list){

        if (node == null) return;

        inOrderTraversal(node.left, list);
        list.add(node.val);
        inOrderTraversal(node.right, list);   
    }


    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> resultList= new ArrayList<>();
        List<Integer> list1=new ArrayList<>();;
        inOrderTraversal(root1,list1);
        List<Integer> list2=new ArrayList<>();;
        inOrderTraversal(root2,list2);

        int list1Pointer = 0, list2Pointer=0;
        int n1 = list1.size(), n2 = list2.size();

        while(list1Pointer < n1  && list2Pointer < n2){
            if(list1.get(list1Pointer) <= list2.get(list2Pointer)){
                resultList.add(list1.get(list1Pointer));
                list1Pointer++;
            }else{
                resultList.add(list2.get(list2Pointer));
                list2Pointer++;
            }
        }
        while(list1Pointer < n1){
            resultList.add(list1.get(list1Pointer++));
        }

        while(list2Pointer < n2){
            resultList.add(list2.get(list2Pointer++));
        }
        return resultList;
    }
}