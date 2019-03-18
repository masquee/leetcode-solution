import core.ListNode;

import java.util.Stack;

public class Solution019 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 1) return null;
        Stack<ListNode> stack = new Stack<>();

        int nodeNum = 0;
        ListNode node = head;
        while (node != null) {
            nodeNum = nodeNum + 1;
            stack.push(node);
            node = node.next;
        }

        if (n > nodeNum) return head;
        if (n == nodeNum) return head.next;

        for (int i = 1; i < n; i++) stack.pop();

        ListNode nodeToRemove = stack.pop();
        ListNode prevNode = stack.pop();
        prevNode.next = nodeToRemove.next;
        nodeToRemove.next = null;

        return head;
    }

}
