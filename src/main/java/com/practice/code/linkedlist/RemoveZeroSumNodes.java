package com.practice.code.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode 1171. Remove Zero Sum Consecutive Nodes from Linked List
 **/

public class RemoveZeroSumNodes {
    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode iter = new ListNode(0);
        iter.next = head;

        Map<Integer, ListNode> uptoSum = new HashMap<>();
        int sum = 0;
        for (ListNode node = iter; node != null; node = node.next) {
            sum += node.val;
            uptoSum.put(sum, node);
        }
        sum = 0;
        for (ListNode node = iter; node != null; node = node.next) {
            sum += node.val;
            node.next = uptoSum.get(sum).next;
        }
        return iter.next;
    }

}
