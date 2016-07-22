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
 * Example of iterate a tree:
 * BSTIterator iterator = new BSTIterator(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */
public class BSTIterator {
    //@param root: The root of binary tree.
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    private TreeNode curt;
    
    public BSTIterator(TreeNode root) {
        // write your code here
        curt = root;
    }

    //@return: True if there has next node, or false
    public boolean hasNext() {
        // write your code here
        return (curt!=null || !stack.empty());
    }
    
    //@return: return next node
    public TreeNode next() {
        // write your code here
        while(curt!=null){
            //写成了!stack.empty()，这里应该判断curt是否为空，因为即使是栈空了，
            //curt可能不是空，因为有种情况是curt==curt.right，但是这时候栈已经空了
            stack.push(curt);
            curt = curt.left;
        }
        
        curt = stack.pop();//这三句话一定要弄明白
        TreeNode node = curt;
        curt = curt.right;
        
        return node;
        
    }
}
