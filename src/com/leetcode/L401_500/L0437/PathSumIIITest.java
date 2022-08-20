package com.leetcode.L401_500.L0437;

import com.util.TreeNode;

public class PathSumIIITest {
    public static void main(String[] args) {
        PathSumIII pathSumIII = new PathSumIII();
        /*
          示例 1：
          输入：root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
          输出：3
          解释：和等于 8 的路径有 3 条，如图所示。
         */
        TreeNode<Integer> rlll = new TreeNode<>(3);
        TreeNode<Integer> rllr = new TreeNode<>(-2);
        TreeNode<Integer> rll = new TreeNode<>(3, rlll, rllr);

        TreeNode<Integer> rlrr = new TreeNode<>(1);
        TreeNode<Integer> rlr = new TreeNode<>(2, null, rlrr);

        TreeNode<Integer> rl = new TreeNode<>(5, rll, rlr);

        TreeNode<Integer> rrr = new TreeNode<>(11);
        TreeNode<Integer> rr = new TreeNode<>(-3, null, rrr);
        TreeNode<Integer> root = new TreeNode<>(10, rl, rr);

        System.out.println(pathSumIII.pathSum(root, 8));
        System.out.println(pathSumIII.pathSum_prefix(root, 8));
        /*
          示例 2：
          输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
          输出：3
         */
    }
}
