package com.practice.code.tree;

import java.util.*;

public class BinaryLeaves {

    private static int getHeight(TreeNode root, Map<TreeNode, Integer> map) {
        if (root == null) return -1;
        int leftHeight = getHeight(root.left, map);
        int rightHeight = getHeight(root.right, map);
        int currHeight = Math.max(leftHeight, rightHeight) + 1;
        map.put(root, currHeight);
        return currHeight + 1;
    }

    public static List<List<Integer>> findLeaves(TreeNode root) {
        Map<TreeNode, Integer> map = new HashMap<>();
        getHeight(root, map);
        TreeMap<Integer, List<Integer>> reverseMap = new TreeMap<>();
        for (Map.Entry<TreeNode, Integer> entry : map.entrySet()) {
            List<Integer> nodeList = reverseMap.getOrDefault(entry.getValue(), new ArrayList<>());
            nodeList.add(entry.getKey().val);
            reverseMap.put(entry.getValue(), nodeList);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : reverseMap.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<List<Integer>> leaves = findLeaves(root);
    }
}
