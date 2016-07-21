public class Solution {
    /**
     * @param root the root of binary tree.
     * @return an integer
     */
    public int maxPathSum2(TreeNode root) {
        // Write your code here
        
        if(root == null){
            return Integer.MIN_VALUE; //返回值是整数的最小值
        }
        
        int left = maxPathSum2(root.left);
        int right = maxPathSum2(root.right);
        return root.val+(Math.max(0,Math.max(left,right)));
        //我想写Math.max(left,right)+1但是自己没有领会到本质，因为root.val就相当于一个迭代，就不用加1了
        
    }
}
