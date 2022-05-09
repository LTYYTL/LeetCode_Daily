package com.leetcode.L401_500.L0442;

import java.util.ArrayList;
import java.util.List;

/**
 * 442. 数组中重复的数据
 * 给你一个长度为 n 的整数数组 nums ，其中 nums 的所有整数都在范围 [1, n] 内，且每个整数出现 一次 或 两次 。请你找出所有出现两次的整数，并以数组形式返回。
 * 你必须设计并实现一个时间复杂度为 O(n) 且仅使用常量额外空间的算法解决此问题。
 * <p>
 * 示例 1：
 * 输入：nums = [4,3,2,7,8,2,3,1]
 * 输出：[2,3]
 * <p>
 * 示例 2：
 * 输入：nums = [1,1,2]
 * 输出：[1]
 * <p>
 * 示例 3：
 * 输入：nums = [1]
 * 输出：[]
 * <p>
 * 提示：
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 * nums 中的每个元素出现 一次 或 两次
 */
public class FindDuplicatesArray {
    /**
     * 方法：数学
     *
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {
        //结果
        List<Integer> res = new ArrayList<>();
        //遍历
        for (int i = 0; i < nums.length; i++) {
            //当前位置的数的绝对值
            int index = Math.abs(nums[i]);
            //当前索引下的值是否为负数，负数表示出现过
            if (nums[index - 1] < 0) {
                res.add(index);
            } else {
                //变成负数
                nums[index - 1] *= -1;
            }
        }

        return res;
    }
}
