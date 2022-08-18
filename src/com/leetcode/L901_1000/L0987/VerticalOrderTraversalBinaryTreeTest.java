package com.leetcode.L901_1000.L0987;

import com.util.TreeNode;

import java.util.List;

public class VerticalOrderTraversalBinaryTreeTest {
    public static void main(String[] args) {
        VerticalOrderTraversalBinaryTree verticalOrderTraversalBinaryTree = new VerticalOrderTraversalBinaryTree();
        /**
         * 示例 1：
         * 输入：root = [3,9,20,null,null,15,7]
         * 输出：[[9],[3,15],[20],[7]]
         * 解释：
         * 列 -1 ：只有结点 9 在此列中。
         * 列  0 ：只有结点 3 和 15 在此列中，按从上到下顺序。
         * 列  1 ：只有结点 20 在此列中。
         * 列  2 ：只有结点 7 在此列中。
         */
        TreeNode<Integer> root = new TreeNode<>(3);

        TreeNode<Integer> rrl = new TreeNode<>(15);
        TreeNode<Integer> rrr = new TreeNode<>(7);
        TreeNode<Integer> rr = new TreeNode<>(20,rrl,rrr);

        TreeNode<Integer> rl = new TreeNode<>(9);

        root.left = rl;
        root.right = rr;

        System.out.println(root);

        for (List<Integer> list : verticalOrderTraversalBinaryTree.verticalTraversal(root)) {
            System.out.println(list.toString());
        }
    }
}
