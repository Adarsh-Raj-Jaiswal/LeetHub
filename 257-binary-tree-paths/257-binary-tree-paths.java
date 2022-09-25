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
    public void paths(TreeNode root,String m,List<String>res){
        if(root==null)return;
        if (root.left == null && root.right == null) res.add(m + root.val);
        paths(root.left, m + root.val + "->", res);
        paths(root.right, m + root.val + "->", res);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        paths(root,"",res);
        return res;
    }
}