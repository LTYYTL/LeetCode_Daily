package com.leetcode.L1501_1600.L1512;

/**
 * 1512. 好数对的数目
 * 给你一个整数数组 nums 。
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 * 返回好数对的数目。
 *
 * 示例 1：
 * 输入：nums = [1,2,3,1,1,3]
 * 输出：4
 * 解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
 *
 * 示例 2：
 * 输入：nums = [1,1,1,1]
 * 输出：6
 * 解释：数组中的每组数字都是好数对
 *
 * 示例 3：
 * 输入：nums = [1,2,3]
 * 输出：0
 *
 * 提示：
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 */
public class NumberGoodPairs {
    /**
     * 方法：map映射
     * @param nums
     * @return
     */
    public int numIdenticalPairs(int[] nums) {
        //记录每个数出现的次数
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num]++;
        }
        //结果
        int count = 0;
        //遍历
        for (int num : arr) {
            //不为0
            if (num != 0)
                //计算当前数字可组成的数字对
                count += num * (num - 1)/2;
        }

        return count;
    }
}
