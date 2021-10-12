public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start = new ListNode(-1); //A node that points to the start of our list
        ListNode prev = start;
        ListNode head1 = l1, head2 = l2;

        int sum = 0, res = 0;
        int i = 0;

        while(l1 != null && l2 != null){
            int tempSum = l1.val + l2.val + res;
            res = 0;                         //We've set the carry to 0 as we've used it in our tempSum
            if(tempSum > 9){                //If our tempSum is greater than 10 we then know we have a new carry
                res = (int)Math.floor(tempSum/ 10.0);
            }
            sum = tempSum % 10;
            ListNode sumNode = new ListNode(sum);
            prev.next = sumNode;
            prev = prev.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        //If there are numbers we haven't added left we can just add them on to the end of our list
        while(l1 != null){
            int temp = l1.val + res;
            res = 0;
            if(temp > 0){
                res = (int)Math.floor(temp/10.0);
            }
            sum = temp % 10;
            ListNode sumNode = new ListNode(sum);
            prev.next = sumNode;
            prev = prev.next;
            l1 = l1.next;
        }
        while(l2 != null){
            int temp = l2.val + res;
            res = 0;
            if(temp > 0){
                res = (int)Math.floor(temp/10.0);
            }
            sum = temp % 10;
            ListNode sumNode = new ListNode(sum);
            prev.next = sumNode;
            prev = prev.next;
            l2 = l2.next;
        }
        if(res != 0){ //If there is a carry left we append it to the end
            prev.next = new ListNode(res);
        }
        return start.next;
    }
}
