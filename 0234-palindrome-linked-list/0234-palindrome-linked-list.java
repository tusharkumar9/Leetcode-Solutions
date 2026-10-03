import java.util.Stack;

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode p = head;

        // Put all values into stack
        while (p != null) {
            s.push(p.val);
            p = p.next;
        }

        // Compare stack values with linked list
        while (head != null && !s.isEmpty()) {
            if (s.peek() != head.val) {
                return false;
            }

            s.pop();
            head = head.next;
        }

        return true;
    }
}