package com.practice.code.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PathToLeafTest {
    TreeNode root = new TreeNode();

    @Before
    public void setUp() throws Exception {
        root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.right = new TreeNode(2);
        root.left.left.left = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
    }

    @Test
    public void hasPathSum() {
        assertTrue(PathToLeaf.hasPathSum(root, 22));
    }
}