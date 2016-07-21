public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
     
    private int depth;//为什么depth要拿到这里来赋值？因为两个函数都用到了depth，是一个成员变量
    public int maxDepth(TreeNode root) {
        // write your code here
        depth = 0;
        helper(root,1);
        return depth;
    }
    
    public void helper(TreeNode root, int curtDepth){
        if(root == null){
            return;
        }
        
        if(curtDepth>depth){
            depth = curtDepth;
        }
        
        helper(root.left, curtDepth+1);//因为往下深了一层，所以必须要加1
        helper(root.right, curtDepth+1);
    }
}
