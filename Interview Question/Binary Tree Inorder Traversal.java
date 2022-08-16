// https://leetcode.com/problems/binary-tree-inorder-traversal/
//TC- O(n)

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    public void helper(TreeNode root, List<Integer> res) {
        if(root == null){
            return;
        }
        else{
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
    }
  }
}
