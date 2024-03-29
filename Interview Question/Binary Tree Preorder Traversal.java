//https://leetcode.com/problems/binary-tree-preorder-traversal/
//TC - O(n)

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
        
    }
    public void helper(TreeNode root, List<Integer> res){
        if(root==null){
            return;
        }
        else{
            res.add(root.val);
            helper(root.left, res);
            helper(root.right, res);
        }
    }
}
