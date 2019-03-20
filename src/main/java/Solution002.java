import core.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode node1 = l1;
        ListNode node2 = l2;

        int carry = 0;
        ListNode head = new ListNode((node1.val + node2.val) % 10);
        carry = (node1.val + node2.val) / 10;

        ListNode currentNode = head;

        node1 = node1.next;
        node2 = node2.next;

        while (node1 != null || node2 != null) {
            if (node1 == null) node1 = new ListNode(0);
            if (node2 == null) node2 = new ListNode(0);
            ListNode newNode = new ListNode((carry + node1.val + node2.val) % 10);
            carry = (carry + node1.val + node2.val) / 10;
            currentNode.next = newNode;
            currentNode = newNode;
            node1 = node1.next;
            node2 = node2.next;
        }

        if (carry > 0) currentNode.next = new ListNode(carry);

        return head;

    }

}
