class ResultType{//一开始加了public，但是一个java文件只能有一个public class
    int maximumDepth;
    boolean isBalanced;
    public ResultType( boolean isBalanced,int maximumDepth){//两个参数写反了，后面编译通不过
        this.maximumDepth = maximumDepth;
        this.isBalanced = isBalanced;
    }
} 
 
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        return helper(root).isBalanced;
        
    }
    
    public ResultType helper(TreeNode root){
        if(root == null){
            return new ResultType(true,0);
        }
        
        ResultType left = helper(root.left);//创建left和right 两个result type用于后续递归
        ResultType right = helper(root.right);
        
        if(!left.isBalanced || !right.isBalanced){//检查左子树和右子树是否是balanced
            return new ResultType(false, -1);
        }
        
        if(Math.abs(left.maximumDepth-right.maximumDepth)>1){//检查根节点是不是balanced，这里用到了maximumDepth
            return new ResultType(false, -1);
        }
        
        return new ResultType(true, Math.max(left.maximumDepth,right.maximumDepth)+1);
        //写成了return new ResultType(true, 1);这个存在的问题是maximumDepth不会变，无法完成递归，maximumDepth加了1！！！！！
    }
    
}
