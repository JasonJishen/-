/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        return mergeHelper(lists, 0, lists.length - 1);
    }
    
    public ListNode mergeHelper(ListNode[] lists, int start, int end) {
        if(start == end) {
            return lists[start];
        }
        int mid = (start + end) / 2;
        ListNode left = mergeHelper(lists, start, mid);
        ListNode right = mergeHelper(lists, mid + 1, end);
        return merge(left, right);
    }
    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(head1 != null && head2 != null) {
            if(head1.val < head2.val) {
                tail.next = head1;
                head1 = head1.next;
            }
            else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if(head1 != null) {
             tail.next = head1;
        }
        if(head2 != null) {
             tail.next = head2;
        }
        return dummy.next;
    }
}
