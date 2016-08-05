public class Solution {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    private Comparator<ListNode> ListNodeComparator = new Comparator<ListNode>(){
      public int compare(ListNode left, ListNode right){
          if(left == null){
              return -1;
          }
          else if(right == null){
              return 1;
          }
          
          return left.val-right.val;
      }  
    }; 
    
    public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
         if (lists == null || lists.size() == 0) {
            return null;//不要忘了检查是否为空
        }
        Queue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), ListNodeComparator);
        for(int i = 0;i < lists.size(); i++){//lists不是list
            if(lists.get(i)!=null){
                heap.add(lists.get(i));
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while(!heap.isEmpty()){//
            ListNode head = heap.poll();
            tail.next = head;
            tail = head;
            if(head.next!=null){
                heap.add(head.next);//因为只是拿出了一个头结点，剩下的要放回堆里面，继续比较
            }
        }
        
        return dummy.next;
        
    }
}
