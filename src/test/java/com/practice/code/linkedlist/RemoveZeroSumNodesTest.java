package com.practice.code.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveZeroSumNodesTest {

    @Test
    public void removeZeroSumSublistsTest() {
        ListNode head = new ListNode(6);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(-3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(1);

        ListNode root = new ListNode(6);
        root.next = new ListNode(3);
        root.next.next = new ListNode(1);
        assertTrue(compare(RemoveZeroSumNodes.removeZeroSumSublists(head), root));
    }

    private boolean compare(ListNode output, ListNode expected) {
        while (output != null && expected != null) {
            if (output.val != expected.val) {
                return false;
            }
            output = output.next;
            expected = expected.next;
        }
        return output == null && expected == null;
    }

    @Test
    public void test() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(-1);
        ListNode root = null;
        assertTrue(compare(RemoveZeroSumNodes.removeZeroSumSublists(head), root));
    }
}