package com.practice.code.tree;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int node) {
        this.value = node;
    }

    public TreeNode(int node, TreeNode left, TreeNode right) {
        this.value = node;
        this.left = left;
        this.right = right;
    }
}
