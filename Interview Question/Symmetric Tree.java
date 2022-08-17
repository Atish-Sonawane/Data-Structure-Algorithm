//https://leetcode.com/problems/symmetric-tree/
//
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
       return helper(root.left,root.right);
    }
    public boolean helper(TreeNode lt, TreeNode rt){
        if(lt==null && rt==null) return true;
        if(lt!= null && rt==null) return false;
        if(lt==null && rt!=null) return false;
        if(lt.val!=rt.val) return false;
        return helper(lt.left,rt.right) && helper(lt.right,rt.left);
    }
}
