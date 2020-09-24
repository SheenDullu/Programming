package com.practice.code.linkedlist;

/**
 * Leet Code 1474. Delete N Nodes After M Nodes of a Linked List.
 **/

public class DeleteNAfterM {

    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode root = new ListNode(-1);
        root.next = head;
        while (head != null) {
            int k = 1;
            while (k != m && head.next != null) {
                head = head.next;
                k++;
            }
            int r = 0;
            while (r != n && head.next != null) {
                head.next = head.next.next;
                r++;
            }
            head = head.next;
        }
        return root.next;
    }
}
