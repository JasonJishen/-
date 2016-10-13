/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root != null) {
            queue.add(root);
        }
        
        while(!queue.isEmpty()) {
            TreeNode curt = queue.poll();
            if(curt.left != null) {
                queue.add(curt.left);
            }
            if(curt.right != null) {
                queue.add(curt.right);
            }
            TreeNode temp = curt.left;
            curt.left = curt.right;
            curt.right = temp;
        }
        return root;
    }
    
}
