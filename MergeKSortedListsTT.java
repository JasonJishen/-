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
        if (lists == null || lists.length == 0) {
            return null;
        }
        List<ListNode> lists2 = new ArrayList<ListNode>();
        for(int i = 0; i < lists.length; i++) {
            lists2.add(lists[i]);
        }
        while(lists2.size() > 1) {
            List<ListNode> newLists = new ArrayList<ListNode>();
            for(int i = 0; i + 1 < lists2.size(); i += 2) {
                ListNode mergedList = merge(lists2.get(i), lists2.get(i+1));
                newLists.add(mergedList);
            }
            if (lists2.size() % 2 == 1) {
                newLists.add(lists2.get(lists2.size() - 1));
            }
            lists2 = newLists;
        }
        
        return lists2.get(0);
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
