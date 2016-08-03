public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head == null){
            return head;
        }
        
        ListNode curt = head;
        ListNode prev = null;
        
        while(curt!=null){
            ListNode temp = curt.next;
            curt.next=prev;
            prev = curt;
            curt = temp;
        }
        
        return prev;//返回值为prev，注意
    }
}
