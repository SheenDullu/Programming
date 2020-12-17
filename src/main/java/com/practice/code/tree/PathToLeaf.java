package com.practice.code.tree;

import java.util.Stack;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the
 * values along the path equals the given sum.
 **/

public class PathToLeaf {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> leftSum = new Stack<>();
        stack.push(root);
        leftSum.push(sum - root.val);

        TreeNode curr;
        int currSum;

        while (!stack.isEmpty()) {
            curr = stack.pop();
            currSum = leftSum.pop();

            if (curr.right == null && curr.left == null && currSum == 0) return true;

            if (curr.right != null) {
                stack.push(curr.right);
                leftSum.push(currSum - curr.right.val);
            }
            if (curr.left != null) {
                stack.add(curr.left);
                leftSum.add(currSum - curr.left.val);
            }

        }
        return false;
    }
}
