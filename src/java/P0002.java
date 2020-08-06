//2. Add Two Numbers

package java;

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
class P0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode a = l1;
        ListNode b = l2;
        ListNode node = head;
        int carry = 0;
        while (a != null || b != null) {
            int x = 0;
            int y = 0;
            if (a != null) {
                x = a.val;
            }
            if (b != null) {
                y = b.val;
            }
            int sum = carry + x + y;
            carry = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }
        if (carry > 0) {
            node.next = new ListNode(carry);
        }
        return head.next;
    }
}
