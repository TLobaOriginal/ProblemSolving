import java.util.HashSet;

public class LLCycleI {
    private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            HashSet<ListNode> hs = new HashSet<>();
            while (head != null) { //We can go to the end of the list and store any node we come across in the hashset
                if (!hs.contains(head)) { //If duplicate not present there is no cycle found
                    hs.add(head);
                    head = head.next;
                } else {                    //If duplicate present then we've found a cycle
                    return true;
                }
            }
            return false;
        }
    }
}
