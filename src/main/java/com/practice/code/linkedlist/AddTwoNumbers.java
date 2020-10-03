package com.practice.code.linkedlist;

/***Leetcode 2. Add two Numbers**/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        else if (l2 == null) return l1;
        else if (l1 == null) return l2;
        int carry = 0;
        int sum = 0;
        ListNode result = new ListNode(-1);
        ListNode node = result;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            node.next = new ListNode(sum % 10);
            node = node.next;
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = l1.val + carry;
            node.next = new ListNode(sum % 10);
            node = node.next;
            carry = sum / 10;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = l2.val + carry;
            node.next = new ListNode(sum % 10);
            node = node.next;
            carry = sum / 10;
            l2 = l2.next;
        }
        if (carry != 0) {
            node.next = new ListNode(carry);
        }
        return result.next;
    }
}
