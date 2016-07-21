public class Solution {
    /**
     * @param root: The root of the binary search tree.
     * @param A and B: two nodes in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
        if(root == null || root == A || root == B){
            return root;
        }
        //下面两行是divide
        TreeNode left = lowestCommonAncestor(root.left,A,B);
        TreeNode right = lowestCommonAncestor(root.right,A,B);
        //如果两边都有，返回root
        if(left!=null&&right!=null){
            return root;
        }
        //左边有返回左边
        if(left!=null){
            return left;
        }
        //右边有返回右边
        if(right!=null){
            return right;
        }
        //都没有返回空
        return null;
    }
}
