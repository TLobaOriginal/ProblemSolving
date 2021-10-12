import java.util.HashSet;

public class DuplicateLinkedListII {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> hashSet = new HashSet<>();
        ListNode node = head;

        while (node != null) {
            hashSet.add(node.val);
            node = node.next;
        }

       node = head;
        //We need to find the current head
        while(hashSet.contains(node))
            node = node.next;

        ListNode temp = node;
        if(temp != null){
            while(node != null){
                if(hashSet.contains(node)){
                    node = node;
                }
            }
        }

        return null;
    }
}
