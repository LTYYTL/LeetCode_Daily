package com.leetcode.L601_700.L0654;

import com.util.TreeNode;

import java.util.Arrays;

/**
 * 654. 最大二叉树
 * 给定一个不重复的整数数组 nums 。 最大二叉树 可以用下面的算法从 nums 递归地构建:
 * (1)创建一个根节点，其值为 nums 中的最大值。
 * (2)递归地在最大值 左边 的 子数组前缀上 构建左子树。
 * (3)递归地在最大值 右边 的 子数组后缀上 构建右子树。
 * 返回 nums 构建的 最大二叉树 。
 * <p>
 * 示例 1：
 * 输入：nums = [3,2,1,6,0,5]
 * 输出：[6,3,5,null,2,0,null,null,1]
 * 解释：递归调用如下所示：
 * - [3,2,1,6,0,5] 中的最大值是 6 ，左边部分是 [3,2,1] ，右边部分是 [0,5] 。
 * - [3,2,1] 中的最大值是 3 ，左边部分是 [] ，右边部分是 [2,1] 。
 * - 空数组，无子节点。
 * - [2,1] 中的最大值是 2 ，左边部分是 [] ，右边部分是 [1] 。
 * - 空数组，无子节点。
 * - 只有一个元素，所以子节点是一个值为 1 的节点。
 * - [0,5] 中的最大值是 5 ，左边部分是 [0] ，右边部分是 [] 。
 * - 只有一个元素，所以子节点是一个值为 0 的节点。
 * - 空数组，无子节点。
 * <p>
 * 示例 2：
 * 输入：nums = [3,2,1]
 * 输出：[3,null,2,null,1]
 * <p>
 * 提示：
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 1000
 * nums 中的所有整数 互不相同
 */
public class MaxBinaryTree {
    /**
     * 方法：递归
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        // 长度
        int n = nums.length;
        // 数组不存在或者没有数
        if (n == 0)
            return null;
        // 获取最大数的索引
        int index = getMaxIndex(nums);
        // 最大数
        int max = nums[index];
        // 创建节点
        TreeNode node = new TreeNode(max);
        // 最大数左边数组
        int[] left = Arrays.copyOfRange(nums, 0, index);
        // 最大数右边数组
        int[] right = Arrays.copyOfRange(nums, index + 1, n);
        // 递归左子树
        node.left = constructMaximumBinaryTree(left);
        // 递归右子树
        node.right = constructMaximumBinaryTree(right);

        return node;
    }

    /**
     * 最大数索引
     */
    private int getMaxIndex(int[] nums) {
        int index = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
}
