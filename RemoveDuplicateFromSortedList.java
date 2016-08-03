public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
        if(head==null||head.next==null){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head=dummy;
        
        while(head.next!=null&&head.next.next!=null){
            if(head.next.val==head.next.next.val){
                head.next=head.next.next;//相对于全部移除相同的，这个不用保存val的值
            }
            else{
                head=head.next;
            }
        }
        
        return dummy.next;
    }  
}
