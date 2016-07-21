public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();//递归不用stack
        traverse(root,list);
        return list;
    }
    
    private void traverse(TreeNode root, ArrayList<Integer> result){//第一遍的时候没想到用一个辅助的函数
        if(root == null){
            return;
        }
        
        result.add(root.val);
        traverse(root.left,result);
        traverse(root.right,result);//错误：写成了root.left
    }
}
