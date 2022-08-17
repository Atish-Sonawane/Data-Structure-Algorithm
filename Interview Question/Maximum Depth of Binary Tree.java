//https://leetcode.com/problems/maximum-depth-of-binary-tree/
//

class Solution {
    public int maxDepth(TreeNode root) {
      if(root==null) 
          return 0;  
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        int ch=Math.max(lh,rh);
        
        return ch+1;
    }
}
