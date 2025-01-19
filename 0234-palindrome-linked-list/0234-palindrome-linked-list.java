import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList <Integer> temp = new ArrayList<>();
        ListNode curr = head;

        while (curr != null){
            temp.add(curr.val);
            curr = curr.next;
        }

        int start = 0;
        int end = temp.size() - 1;

        while (start <= end){
            if (!temp.get(start).equals(temp.get(end)))
                return false;
            start++;
            end--;
        }
        return true;
    }
}