/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = getListLength(head);
        int nFromFirst = length - n + 1;
        if(nFromFirst < 0) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        for(int i = 1; i < nFromFirst; i++) {
            head = head.next;
        }
        head.next = head.next.next;
        return dummy.next;
    }
    public int getListLength(ListNode head) {
        int length = 0;
        while(head != null) {
            length = length + 1;
            head = head.next;
        }
        return length;
    }
}
