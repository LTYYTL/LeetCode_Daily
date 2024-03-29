package com.leetcode.L301_400.L0376;

/**
 * 376. 摆动序列
 * 如果连续数字之间的差严格地在正数和负数之间交替，则数字序列称为摆动序列。第一个差（如果存在的话）可能是正数或负数。少于两个元素的序列也是摆动序列。
 * 例如， [1,7,4,9,2,5] 是一个摆动序列，因为差值 (6,-3,5,-7,3) 是正负交替出现的。
 * 相反, [1,4,7,2,5] 和 [1,7,4,5,5] 不是摆动序列，第一个序列是因为它的前两个差值都是正数，第二个序列是因为它的最后一个差值为零。
 * 给定一个整数序列，返回作为摆动序列的最长子序列的长度。 通过从原始序列中删除一些（也可以不删除）元素来获得子序列，剩下的元素保持其原始顺序。
 *
 * 示例 1:
 * 输入: [1,7,4,9,2,5]
 * 输出: 6
 * 解释: 整个序列均为摆动序列。
 *
 * 示例 2:
 * 输入: [1,17,5,10,13,15,10,5,16,8]
 * 输出: 7
 * 解释: 这个序列包含几个长度为 7 摆动序列，其中一个可为[1,17,10,13,10,16,8]。
 *
 * 示例 3:
 * 输入: [1,2,3,4,5,6,7,8,9]
 * 输出: 2
 * 进阶:
 * 你能否用 O(n) 时间复杂度完成此题?
 */
public class WiggleSubsequence {
    /**
     * 方法：动态规划
     * 假设 up[i] 表示 nums[0:i] 中最后两个数字递增的最长摆动序列长度，down[i] 表示 nums[0:i] 中最后两个数字递减的最长摆动序列长度，只有一个数字时默认为 1。
     * 接下来我们进行分类讨论：
     * 1、nums[i+1] > nums[i]
     *  （1）假设 down[i] 表示的最长摆动序列的最远末尾元素下标正好为 i，遇到新的上升元素后，up[i+1] = down[i] + 1 ，这是因为 up 一定从 down 中产生（初始除外），并且 down[i] 此时最大。
     *  （2）假设 down[i] 表示的最长摆动序列的最远末尾元素下标小于 i，设为 j，那么 nums[j:i] 一定是递增的，因为若完全递减，最远元素下标等于 i，若波动，那么 down[i] > down[j]。
     *  由于 nums[j:i] 递增，down[j:i] 一直等于 down[j] ，依然满足 up[i+1] = down[i] + 1 。
     * 2、nums[i+1] < nums[i]，类似第一种情况
     * 3、nums[i+1] == nums[i]，新的元素不能用于任何序列，保持不变
     *
     * 作者：lgh18
     * 链接：<a href="https://leetcode-cn.com/problems/wiggle-subsequence/solution/tan-xin-si-lu-qing-xi-er-zheng-que-de-ti-jie-by-lg/">https://leetcode-cn.com/problems/wiggle-subsequence/solution/tan-xin-si-lu-qing-xi-er-zheng-que-de-ti-jie-by-lg/</a>
     * @param nums
     * @return
     */
    public int wiggleMaxLength(int[] nums) {
        int down = 1, up = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                up = down + 1;
            else if (nums[i] < nums[i - 1])
                down = up + 1;
        }
        return nums.length == 0 ? 0 : Math.max(down, up);
    }
}
