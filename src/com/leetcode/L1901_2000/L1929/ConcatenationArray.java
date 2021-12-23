package com.leetcode.L1901_2000.L1929;

/**
 * 1929. 数组串联
 * 给你一个长度为 n 的整数数组 nums 。请你构建一个长度为 2n 的答案数组 ans ，数组下标 从 0 开始计数 ，对于所有 0 <= i < n 的 i ，满足下述所有要求：
 * (1)ans[i] == nums[i]
 * (2)ans[i + n] == nums[i]
 * 具体而言，ans 由两个 nums 数组 串联 形成。
 * 返回数组 ans 。
 *
 * 示例 1：
 * 输入：nums = [1,2,1]
 * 输出：[1,2,1,1,2,1]
 * 解释：数组 ans 按下述方式形成：
 * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 * - ans = [1,2,1,1,2,1]
 *
 * 示例 2：
 * 输入：nums = [1,3,2,1]
 * 输出：[1,3,2,1,1,3,2,1]
 * 解释：数组 ans 按下述方式形成：
 * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
 * - ans = [1,3,2,1,1,3,2,1]
 *
 * 提示：
 * n == nums.length
 * 1 <= n <= 1000
 * 1 <= nums[i] <= 1000
 */
public class ConcatenationArray {
    /**
     * 方法：模拟
     * @param nums
     * @return
     */
    public int[] getConcatenation(int[] nums) {
        //长度
        int n = nums.length;
        //结果
        int[] res = new int[2*n];
        //遍历
        for (int i = 0; i < res.length; i++) {
            res[i] = nums[i%n];
        }

        return res;
    }
}
