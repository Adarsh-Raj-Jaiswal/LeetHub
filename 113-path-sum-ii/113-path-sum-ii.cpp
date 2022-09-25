/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void findPaths(TreeNode* root,int sum,vector<int>&list,vector<vector<int>>&res){
        if(root==NULL)return;
        list.push_back(root->val);
        if(root->left==NULL&&root->right==NULL&&root->val==sum)res.push_back(list);
        findPaths(root->left,sum-root->val,list,res);
        findPaths(root->right,sum-root->val,list,res);
        list.pop_back();
    }
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        vector<vector<int>> res;
        vector<int> list;
        findPaths(root,targetSum,list,res);
        return res;
    }
};