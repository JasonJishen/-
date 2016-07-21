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
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> preorder = new ArrayList<Integer>();
        
        if(root == null){
            return preorder;
        }
        
        stack.push(root);
        while(!stack.empty()){//自己的版本：stack!=null;
            TreeNode node = stack.pop();
            preorder.add(node.val);
            
            if(node.right!=null){//错：root.right
                stack.push(node.right);    
            }
            if(node.left!=null){//错：root.left
                stack.push(node.left);//出了问题，自己写的是stack.push(root.left)
            }
        }
        
        return preorder;
        
    }
}
