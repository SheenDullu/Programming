package com.practice.code.tree;

import javafx.util.Pair;

import java.util.Stack;

/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * Find the total sum of all root-to-leaf numbers.
 **/
public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        int sum = 0;
        int value = 0;
        stack.push(new Pair<>(root, 1));
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> curr = stack.pop();
            TreeNode node = curr.getKey();
            value = value * 10 + node.val;
            if (node.left != null) stack.push(new Pair<>(node.left, curr.getValue() + 1));
            if (node.right != null) stack.push(new Pair<>(node.right, curr.getValue() + 1));
            if (node != null && node.left == null && node.right == null) {
                sum = sum + value;
                if (!stack.isEmpty()) {
                    int p = curr.getValue() - stack.peek().getValue() + 1;
                    value = value / (int) Math.pow(10, p);
                }
            }
        }
        return sum;
    }
}
