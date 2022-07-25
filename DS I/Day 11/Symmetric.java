class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    
    public boolean isMirror(TreeNode p,TreeNode q){
        
        if(p==null && q==null)return true;
        if(p==null || q==null)return false;
        
        return (p.val == q.val)
            && isMirror(p.right,q.left)
            && isMirror(p.left,q.right);
        
    }
}