package problemsolve.leetcode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        if (head.val != head.next.val) {
            head.next = deleteDuplicates(head.next);
            return head;
        } else {
            head.next = head.next.next;
            return deleteDuplicates(head);
        }

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
