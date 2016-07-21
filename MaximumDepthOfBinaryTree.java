public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        // write your code hered
        if(root == null){//首先上来就判断根节点是不是空
            return 0;
        }
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left,right)+1;//加1的目的是为了递归不进入死循环
    }
}
