public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        postorder(root,result);
        return result;
        
    }
    
    
    public void postorder(TreeNode root, ArrayList<Integer> result){
        
        //ArrayList<Integer> result = new ArrayList<Integer>();//不用这个，参数中已经创建了
        
        
        if(root == null){
            return;
        }
        
        postorder(root.left,result);//错：写成了postorderTraversal这个是主函数，不能这样写，而且参数一开始只传入了root.left，result没有传进来
        postorder(root.right,result);
        result.add(root.val);
        
    }
}
