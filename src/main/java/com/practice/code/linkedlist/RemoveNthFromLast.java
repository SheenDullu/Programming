package com.practice.code.linkedlist;

/**
 * Leetcode 19. Remove Nth Node From End of List.
 **/

public class RemoveNthFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        ListNode root = new ListNode(-1);
        ListNode fast = head;
        ListNode slow = head;
        root.next = head;
        while (fast != null && n > 0) {
            fast = fast.next;
            n--;
        }
        if (fast == null) return head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return root.next;
    }
}
