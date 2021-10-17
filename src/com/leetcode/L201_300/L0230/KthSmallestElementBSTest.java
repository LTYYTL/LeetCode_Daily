package com.leetcode.L201_300.L0230;

import com.util.TreeNode;

public class KthSmallestElementBSTest {
    public static void main(String[] args) {
        KthSmallestElementBST kthSmallestElementBST = new KthSmallestElementBST();
        /**
         * 示例 1：
         * 输入：root = [3,1,4,null,2], k = 1
         * 输出：1
         */
        TreeNode<Integer> rlr = new TreeNode<>(2);
        TreeNode<Integer> rl = new TreeNode<>(1,null,rlr);
        TreeNode<Integer> rr = new TreeNode<>(4);
        TreeNode<Integer> root = new TreeNode<>(3,rl,rr);
        System.out.println(kthSmallestElementBST.kthSmallest(root, 1));
        /**
         * 示例 2：
         * 输入：root = [5,3,6,2,4,null,null,1], k = 3
         * 输出：3
         */
    }
}
