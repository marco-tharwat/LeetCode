class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dum = new ListNode(0, head);

        ListNode r = dum;
        ListNode f = dum;
        int count = 0;

        while (f.next != null){
            f = f.next;
            if (!(count < n))
                r = r.next;
            count++;
        }
        r.next = r.next.next;

        return dum.next;
    }
}