package com.leetcode.L801_900.L0872;

import com.util.TreeNode;

public class Leaf_SimilarTreesTest {
    public static void main(String[] args) {
        Leaf_SimilarTrees leaf_similarTrees = new Leaf_SimilarTrees();
        /**
         * 示例 2：
         * 输入：root1 = [1], root2 = [1]
         * 输出：true
         */
        TreeNode<Integer> root1 = new TreeNode<>(1);
        TreeNode<Integer> root2 = new TreeNode<>(1);
        System.out.println(leaf_similarTrees.leafSimilar(root1 ,root2));
        /**
         * 示例 3：
         * 输入：root1 = [1], root2 = [2]
         * 输出：false
         */
        TreeNode<Integer> root3 = new TreeNode<>(1);
        TreeNode<Integer> root4 = new TreeNode<>(2);
        System.out.println(leaf_similarTrees.leafSimilar(root3 ,root4));

    }
}
