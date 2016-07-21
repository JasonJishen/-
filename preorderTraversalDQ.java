public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        //分治法
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(root == null){
            return list;
        }
        
        ArrayList<Integer> left = preorderTraversal(root.left);
        ArrayList<Integer> right = preorderTraversal(root.right);
        
        list.add(root.val);
        list.addAll(left);//错：写成了left.val，因为你创建的就是一个list里面肯定都是integer
        list.addAll(right);
        return list;
    }
}
