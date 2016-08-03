public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list,
                    using constant space complexity.
     */
    public ListNode sortList(ListNode head) {  
        // write your code here
        if(head == null||head.next ==null){
            return head;//不要忘记判断这个
        }
        ListNode middle = findMiddle(head);
        ListNode right = sortList(middle.next);
        middle.next = null;
        ListNode left = sortList(head);//之所以上面把middle.next设置为null就是为了让这个left能停下来
        return merge(left,right);
    }
    
    private ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null&&fast.next!=null){//写成了fast.next!=null&&fast!=null，不能写反因为如果fast已经是null了fast.next就没有意义了，如果fast.next是空但是fast不是空，会把它短路，就少判断了一个值
            fast=fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
    
    private ListNode merge(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(head1!=null&&head2!=null){//放在while循环中，因为两个不一定是一样长的，如果有一个完了就把指针直接连到下一个
            //是与不是或
            if(head1.val< head2.val){
                tail.next = head1;
                head1 = head1.next;
            }
        
            else{
                tail.next = head2;
                head2 = head2.next;
            }
        
            tail=tail.next;
        }
        
        if(head1!=null){
            tail.next = head1;
        }
        else{
            tail.next = head2;
        }
        
        return dummy.next;
    }
}  
