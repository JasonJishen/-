public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {  
        // write your code here
        if(head == null||head.next == null){//判断head是否为空和head.next是否为空，返回
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast!=slow){
            if(fast==null||fast.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return true;
    }
}
