import java.util.HashMap;

public class LLCycleII {
    private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> hm = new HashMap<>(); //Maps the list onto                                                  //it's place in the list
        for(int i = 0; head != null; i++){
            if(hm.containsKey(head))
                return head;
            else{
                hm.put(head, i);
                head = head.next;
            }
        }
        return null;
    }
}
