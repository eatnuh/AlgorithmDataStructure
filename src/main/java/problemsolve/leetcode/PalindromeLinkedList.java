package problemsolve.leetcode;

// https://leetcode.com/problems/palindrome-linked-list/

import java.util.ArrayList;
import java.util.Objects;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode curNode = head;
        while (curNode != null) {
            values.add(curNode.val);
            curNode = curNode.next;
        }

        int start = 0;
        int end = values.size() - 1;

        while (start < end) {
            if (!Objects.equals(values.get(start), values.get(end))) return false;
            start++;
            end--;
        }

        return true;
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
