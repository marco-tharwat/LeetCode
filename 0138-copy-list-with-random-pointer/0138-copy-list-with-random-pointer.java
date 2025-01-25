class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node cur1 = head;
        Node head2 = new Node(head.val);
        Node cur2 = head2;

        while (cur1.next != null) {
            cur2.next = new Node(cur1.next.val);
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        cur1 = head;
        cur2 = head2;

        while (cur1 != null) {
            if (cur1.random != null) {
                Node temp = head;
                Node tempCopy = head2;

                int index = 0;
                while (temp != cur1.random) {
                    temp = temp.next;
                    index++;
                }
                
                for (int i = 0; i < index; i++) {
                    tempCopy = tempCopy.next;
                }
                cur2.random = tempCopy;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return head2;
    }
}
