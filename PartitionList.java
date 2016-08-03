public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param x: an integer
     * @return: a ListNode 
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if(head==null){
            return head;
        }
        
        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy = new ListNode(0);
        ListNode left = leftDummy;
        ListNode right = rightDummy;//创建四个，为的是两个虚拟的，两个随着动的
        
        while(head!=null){//只要head不为空就可以
            if(head.val<x){
                left.next = head;
                left = head;//把left的值向后移
            }
            
            else if(head.val >=x){
                right.next = head;
                right = head;
            }
            head = head.next;
        }
        
        right.next = null;
        left.next = rightDummy.next;//因为right的值一直在往后推变化，所以要把rightDummy.next赋过去
        return leftDummy.next;//返回left虚拟点的next
    }
}
