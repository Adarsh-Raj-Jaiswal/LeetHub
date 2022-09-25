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
    public static void listMake(TreeNode root,int sum,List<Integer>list,List<List<Integer>>res){
        if(root==null)return;
        list.add(root.val);
        if(root.left==null&&root.right==null&&sum-root.val==0)res.add(new ArrayList(list));
        listMake(root.left,sum-root.val,list,res);
        listMake(root.right,sum-root.val,list,res);
        list.remove(list.size() - 1);
        // list.remove(new Integer(root.val));
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        listMake(root,targetSum,list,res);
        return res;
    }
}