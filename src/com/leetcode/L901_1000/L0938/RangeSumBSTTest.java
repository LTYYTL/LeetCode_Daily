package com.leetcode.L901_1000.L0938;

import com.util.TreeNode;

public class RangeSumBSTTest {
    public static void main(String[] args) {
        RangeSumBST rangeSumBST = new RangeSumBST();
        /*** 示例 1：
         * 输入：root = [10,5,15,3,7,null,18], low = 7, high = 15
         * 输出：32
         */
        TreeNode<Integer> ll = new TreeNode<>(3);
        TreeNode<Integer> lr = new TreeNode<>(7);
        TreeNode<Integer> l = new TreeNode<>(5,ll,lr);

        TreeNode<Integer> rr = new TreeNode<>(18);
        TreeNode<Integer> r = new TreeNode<>(15,null,rr);

        TreeNode<Integer> root = new TreeNode<>(10,l,r);

        System.out.println(root.toString());
        System.out.println(rangeSumBST.rangeSumBST(root, 7, 15));
        /**
         * 示例 2：
         * 输入：root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
         * 输出：23
         */
        TreeNode<Integer> lll1 = new TreeNode<>(1);
        TreeNode<Integer> ll1 = new TreeNode<>(3,lll1,null);

        TreeNode<Integer> lrl1 = new TreeNode<>(6);
        TreeNode<Integer> lr1 = new TreeNode<>(7,null,lrl1);

        TreeNode<Integer> l1 = new TreeNode<>(5,ll1,lr1);

        TreeNode<Integer> rr1 = new TreeNode<>(18);
        TreeNode<Integer> rl1 = new TreeNode<>(13);
        TreeNode<Integer> r1 = new TreeNode<>(15,rl1,rr1);

        TreeNode<Integer> root1 = new TreeNode<>(10,l1,r1);

        System.out.println(root1.toString());
        System.out.println(rangeSumBST.rangeSumBST_it(root1, 6, 10));
    }
}
