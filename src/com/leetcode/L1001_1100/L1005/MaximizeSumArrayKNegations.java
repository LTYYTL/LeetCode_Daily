package com.leetcode.L1001_1100.L1005;

import java.util.Arrays;

/**
 * 1005. K 次取反后最大化的数组和
 * 给定一个整数数组 A，我们只能用以下方法修改该数组：我们选择某个索引 i 并将 A[i] 替换为 -A[i]，然后总共重复这个过程 K 次。（我们可以多次选择同一个索引 i。）
 * 以这种方式修改数组后，返回数组可能的最大和。
 *
 * 示例 1：
 * 输入：A = [4,2,3], K = 1
 * 输出：5
 * 解释：选择索引 (1,) ，然后 A 变为 [4,-2,3]。
 *
 * 示例 2：
 * 输入：A = [3,-1,0,2], K = 3
 * 输出：6
 * 解释：选择索引 (1, 2, 2) ，然后 A 变为 [3,1,0,2]。
 *
 * 示例 3：
 * 输入：A = [2,-3,-1,5,-4], K = 2
 * 输出：13
 * 解释：选择索引 (1, 4) ，然后 A 变为 [2,3,-1,5,4]。
 *
 * 提示：
 * 1 <= A.length <= 10000
 * 1 <= K <= 10000
 * -100 <= A[i] <= 100
 */
public class MaximizeSumArrayKNegations {
    /**
     * 方法：贪心算法
     * @param nums
     * @param k
     * @return
     */
    public int largestSumAfterKNegations(int[] nums, int k) {
        //计算和
        int sum = 0;
        //最小值
        int min = Integer.MAX_VALUE;
        //排序，负数最小的变成正数最大的
        Arrays.sort(nums);
        //遍历
        for (int num : nums) {
            //当前值
            int temp = num;
            //如果小于0，改变符号
            if (temp < 0 && k > 0) {
                temp = -temp;
                k--;
            }
            //存储最小值
            min = Math.min(temp, min);
            //计算和
            sum += temp;
        }
        //k有剩余，一直反转最小的数，偶数次无论怎么反转都是正数，奇数次反转后为负数
        sum = k % 2 == 0 ? sum : sum - 2*min;
        return sum;
    }
}
