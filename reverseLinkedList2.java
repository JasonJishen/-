public class Solution {
    /**
     * @param ListNode head is the head of the linked list 
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
        if(head==null||m>=n){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        for(int i = 1; i<m; i++){
            if(head == null){
                return null;
            }
            head=head.next;
        }
        
        ListNode premNode = head;
        ListNode mNode = head.next;
        ListNode nNode = mNode;
        ListNode postnNode = nNode.next;
        
        for(int i = m; i < n;i++){
            ListNode temp = postnNode.next;//没有加next
            postnNode.next = nNode;
            nNode = postnNode;
            postnNode = temp;
        }
        
        mNode.next = postnNode;
        premNode.next=nNode;//写成了prenNode
        //这两句话的意思是在反转之后中间变成432，要把1指向4,2指向5,2就是mNode，1就是premNode
        
        return dummy.next;
    }
}
