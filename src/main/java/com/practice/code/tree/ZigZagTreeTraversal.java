package com.practice.code.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Leetcode 103. Binary Tree Zigzag Level Order Traversal
 **/

public class ZigZagTreeTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> output = new ArrayList<>();
        queue.offer(root);
        int height = 1;
        int nodeToVisit = 1;
        int numOfNode = 0;
        LinkedList<Integer> result = new LinkedList<>();
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (height % 2 == 0) result.addFirst(curr.val);
            else result.add(curr.val);
            nodeToVisit--;
            if (curr.left != null) {
                queue.offer(curr.left);
                numOfNode++;
            }
            if (curr.right != null) {
                queue.offer(curr.right);
                numOfNode++;
            }
            if (nodeToVisit == 0) {
                nodeToVisit = numOfNode;
                numOfNode = 0;
                height++;
                output.add(new ArrayList<>(result));
                result = new LinkedList<>();
            }
        }
        return output;
    }
}
