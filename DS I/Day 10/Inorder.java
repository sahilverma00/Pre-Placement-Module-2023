class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();    
    Stack<TreeNode> stack = new Stack<>();
 
    TreeNode p = root;
    while(p!=null){
        stack.push(p);
        p=p.left;
    }
 
    while(!stack.isEmpty()){            
        TreeNode t = stack.pop();
        result.add(t.val);
 
        t = t.right;
        while(t!=null){
            stack.push(t);
            t = t.left;
        }
    }
 
    return result;
        
    }
}