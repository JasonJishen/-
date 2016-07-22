/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        ResultType result = helper(root);
        return result.is_bst;
    }

    private ResultType helper(TreeNode root){
        if(root == null){
            return new ResultType(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
            //当根节点为空时，我们得到的返回值应该是true
        }
        
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        
        if(!left.is_bst||!right.is_bst){
            return new ResultType(false, 0, 0);
        }
        
        if((root.left!=null && left.maxValue>=root.val) || (root.right!=null&&root.val>=right.minValue)){
            return new ResultType(false, 0, 0);
        }
        
        return new ResultType(true,Math.max(right.maxValue,root.val),Math.min(root.val, left.minValue));
        //return new ResultType(true, Math.max(left.maxValue,root.val), Math.min(right.minValue, root.val));
        //这是我的版本，我并没有完成迭代，并且left的maxvalue和root value比较是没有意义的。我们应该取出right最大值和root相比较
        
    }
    
    
}

class ResultType{
    boolean is_bst;
    int maxValue;
    int minValue;
    
    ResultType(boolean is_bst, int maxValue, int minValue){
        this.is_bst = is_bst;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }
}
