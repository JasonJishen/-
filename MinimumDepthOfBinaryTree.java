public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int minDepth(TreeNode root) {
        // write your code here
        if(root == null) {
            return 0;
        }
        
        return getMin(root);//用到了辅助函数
    }
    
    public int getMin(TreeNode root){
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        
        if(root.left == null && root.right == null){
            return 1;//这里的1是自己的1
        }
        
        return Math.min(getMin(root.left),getMin(root.right))+1;//+1加在了min括号里面min(getMin(root.left),getMin(root.right)+1),这个加1很重要不然没法完成递归
    }
}
