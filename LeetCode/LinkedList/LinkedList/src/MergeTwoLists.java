class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr = new ListNode(Integer.MIN_VALUE);
        ListNode head = new ListNode(Integer.MIN_VALUE, curr);

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                curr.next = list2;
                list2 = list2.next;
            }
            else{
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }

        while(list1 != null){
            curr.next = list1;
            list1 = list1.next;
            curr = curr.next;
        }

        while(list2 != null){
            curr.next = list2;
            list2 = list2.next;
            curr = curr.next;
        }

        curr = head.next.next;
        return curr;
    }
}
