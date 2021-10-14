import java.util.Stack;

public class ReverseLinkedListStack {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        stack.add(null);
        while(head != null){
            stack.add(head);
            head = head.next;
        }

        ListNode start = new ListNode(-1);
        ListNode curr = start;
        while(curr != null){
            ListNode newNode = stack.pop();
            curr.next = newNode;
            curr = curr.next;
        }

        return start.next;
    }
}
