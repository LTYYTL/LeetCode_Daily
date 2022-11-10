package com.leetcode.L2401_2500.L2455;

/**
 * 2455. 可被三整除的偶数的平均值
 * 给你一个由正整数组成的整数数组 nums ，返回其中可被 3 整除的所有偶数的平均值。
 * 注意：n 个元素的平均值等于 n 个元素 求和 再除以 n ，结果 向下取整 到最接近的整数。
 * <p>
 * 示例 1：
 * 输入：nums = [1,3,6,10,12,15]
 * 输出：9
 * 解释：6 和 12 是可以被 3 整除的偶数。(6 + 12) / 2 = 9 。
 * <p>
 * 示例 2：
 * 输入：nums = [1,2,4,7,10]
 * 输出：0
 * 解释：不存在满足题目要求的整数，所以返回 0 。
 * <p>
 * 提示：
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 1000
 */
public class AverageValueThree {
    /**
     * 方法：数学
     */
    public int averageValue(int[] nums) {
        // 和
        int res = 0;
        // 个数
        int n = 0;
        // 遍历
        for (int num : nums) {
            // 能整除3的偶数 == 能整除6
            if (num % 6 == 0) {
                res += num;
                n++;
            }
        }
        // 没有满足条件的
        if (n == 0) {
            return 0;
        }
        // 计算平均值
        return res / n;
    }
}
