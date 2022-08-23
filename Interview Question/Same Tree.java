//https://leetcode.com/problems/same-tree/
// T - O(n) and S - O(h)--> h is height of tree

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)  return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        
        return left && right;
    }
}
