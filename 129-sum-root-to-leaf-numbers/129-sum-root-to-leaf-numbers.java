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
    private int sum=0;
    public void func(TreeNode root,List<Integer>list){
        if(root==null)return;
        list.add(root.val);
        if(root.left==null&&root.right==null){
            int num=0;
            for(int i=0;i<list.size();i++){
                num=num*10+list.get(i);
            }
            sum+=num;
        }
        func(root.left,list);
        func(root.right,list);
        list.remove(list.size()-1);
    }
    public int sumNumbers(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        func(root,list);
        return sum;
    }
}