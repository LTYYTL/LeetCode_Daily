package com.leetcode.L901_1000.L0961;

import java.util.HashSet;
import java.util.Set;

/**
 * 961. 在长度 2N 的数组中找出重复 N 次的元素
 * 给你一个整数数组 nums ，该数组具有以下属性：
 * <p>
 * (1)nums.length == 2 * n.
 * (2)nums 包含 n + 1 个 不同的 元素
 * (3)nums 中恰有一个元素重复 n 次
 * 找出并返回重复了 n 次的那个元素。
 * <p>
 * 示例 1：
 * 输入：nums = [1,2,3,3]
 * 输出：3
 * <p>
 * 示例 2：
 * 输入：nums = [2,1,2,5,3,2]
 * 输出：2
 * <p>
 * 示例 3：
 * 输入：nums = [5,1,5,2,5,3,5,4]
 * 输出：5
 * <p>
 * 提示：
 * 2 <= n <= 5000
 * nums.length == 2 * n
 * 0 <= nums[i] <= 104
 * nums 由 n + 1 个 不同的 元素组成，且其中一个元素恰好重复 n 次
 */
public class RepeatedElementArray {
    /**
     * 方法：set集合
     *
     * @param nums
     * @return
     */
    public int repeatedNTimes(int[] nums) {
        //set集合
        Set<Integer> set = new HashSet<>();
        //遍历
        for (int num : nums) {
            //是否已经存在
            if (set.contains(num)) {
                return num;
            }
            //加入集合
            set.add(num);
        }
        return -1;
    }
}
