/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: void
     */
    public void reorderList(ListNode head) {  
        // write your code here
        if(head == null){
            return;//不要忘记判断
        }
        ListNode mid = findMiddle(head);
        ListNode tail = reverse(mid.next);
        mid.next = null;
        merge(head,tail);
    }
    
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
    
    public void merge(ListNode head1, ListNode head2){//没有返回值
        ListNode dummy = new ListNode(0);
        int index = 0;
        while(head1!=null&&head2!=null){
            if(index%2==0){
                dummy.next = head1;
                head1=head1.next;
            }
            else if(index%2==1){
                dummy.next = head2;
                head2 = head2.next;
            }
            dummy=dummy.next;
            index = index + 1;
        }
        
        if(head1!=null){
            dummy.next = head1;
        }
        
        if(head2!=null){
            dummy.next = head2;
        }
    }
    
    public ListNode reverse(ListNode head){
        ListNode dummy = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = dummy;
            dummy = head;
            head = temp;
        }
        
        return dummy;
    }
}
//这个题目用到了三个辅助函数，reverse，返回一个ListNode类型的值，merge直接可以返回空值，findMiddle返回一个listNode，merge的过程注意和普通比大小的区别，是用了2取余

