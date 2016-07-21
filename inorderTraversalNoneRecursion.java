public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        /*if(root == null){
            return list;
        }*/
        
        ////////////不要这个，在下面判断了
        
        TreeNode curt = root;//先把root加入curt，然后curt一步步往左
        while(!stack.empty()||curt!=null){
            while(curt!=null){//错：写成了=!null
                stack.add(curt);
                curt = curt.left;
            }
            
            curt = stack.peek();
            stack.pop();
            list.add(curt.val);
            curt = curt.right;
        }
        
        return list;
        
    }
}
