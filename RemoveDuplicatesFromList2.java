public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if(head == null|| head.next==null){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        while(head.next!=null&&head.next.next!=null){
            if(head.next.val==head.next.next.val){//记住这几个判断条件
                int val = head.next.val;
                while(head.next!=null&&head.next.val==val){//这个while循环为了查下一个不是空而且val==val
                    head.next=head.next.next;
                }
            }
            else{
                head=head.next;
            }
        }
        
        return dummy.next;
    }
}
