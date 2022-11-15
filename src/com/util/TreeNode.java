package com.util;

public class TreeNode {
    public TreeNode root;
    public Integer val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Integer e) {
        val = e;
    }

    public TreeNode(Integer e, TreeNode left, TreeNode right) {
        val = e;
        this.left = left;
        this.right = right;
    }

    /**
     * 通过数组构建树
     */
    public TreeNode(Integer[] nums) {
        root = createBinaryTree(nums, 0);
    }

    /**
     * 私有方法
     */
    private TreeNode createBinaryTree(Integer[] array, int index) {
        TreeNode tn = null;
        if (index < array.length) {
            Integer value = array[index];
            tn = new TreeNode(value);
            tn.left = createBinaryTree(array, 2 * index + 1);
            tn.right = createBinaryTree(array, 2 * index + 2);
            return tn;
        }
        return tn;
    }

        @Override
        public String toString() {
                return "TreeNode{" +
                        "val=" + val +
                        ", left=" + left +
                        ", right=" + right +
                        '}';
        }
}
