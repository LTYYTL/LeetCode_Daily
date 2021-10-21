package com.offerII.L054;

import com.util.TreeNode;

public class ConvertBSTToGreaterTreeTest {
    public static void main(String[] args) {
        ConvertBSTToGreaterTree convertBSTToGreaterTree = new ConvertBSTToGreaterTree();

        /** * 例如：
         * 输入: 原始二叉搜索树:
         *               5
         *             /   \
         *            2     13
         *
         * 输出: 转换为累加树:
         *              18
         *             /   \
         *           20     13
         */
        TreeNode<Integer> root = new TreeNode<>(5);
        TreeNode<Integer> rl = new TreeNode<>(2);
        TreeNode<Integer> rr = new TreeNode<>(13);

        root.left = rl;
        root.right = rr;

        System.out.println(convertBSTToGreaterTree.convertBST(root));
        System.out.println(convertBSTToGreaterTree.convertBST_iteration(root));
    }
}
