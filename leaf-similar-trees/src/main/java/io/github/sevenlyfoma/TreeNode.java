package io.github.sevenlyfoma;

public class TreeNode {
    @SuppressWarnings("unused")
    int val;
    @SuppressWarnings("unused")
    TreeNode left;
    @SuppressWarnings("unused")
    TreeNode right;
    @SuppressWarnings("unused")
    TreeNode() {}
    @SuppressWarnings("unused")
    TreeNode(int val) { this.val = val; }
    @SuppressWarnings("unused")
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}