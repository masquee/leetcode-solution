import core.ListNode;

public class Solution019V2 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || n < 1) return null; // null list or illegal `n`

        if (head.next == null) {                // list has only one node
            if (n == 1) return null;
            else return head;
        }

        // p1 moves n steps first, , then p1 and p2 move together
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 0; i < n - 1; i++) {       // note: i<n-1, not i<n
            p1 = p1.next;
            if (p1 == null) return head;
        }


        // 在写出下面这几行代码之前，一开始想到的是还要增加一个指针，指向p2的前一个节点；
        // 后来想到，可以直接使用p1.next.next来判断是否p1的下个节点是否尾节点
        // 这样就不需要维护第三个指针

        if (p1.next == null) {
            return head.next;
        }

        while (true) {
            if (p1.next.next == null) {             // if p1.next is tail node
                ListNode nodeToRemove = p2.next;    // when p1.next is tail node, p2.next need to remove
                p2.next = nodeToRemove.next;
                nodeToRemove.next = null;
                return head;
            } else {
                p1 = p1.next;
                p2 = p2.next;
            }
        }

    }
}
