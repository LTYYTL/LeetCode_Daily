package com.leetcode.L201_300.L0268;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 268. 丢失的数字
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 *
 * 示例 1：
 * 输入：nums = [3,0,1]
 * 输出：2
 * 解释：n = 3，因为有 3 个数字，所以所有的数字都在范围 [0,3] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 *
 * 示例 2：
 * 输入：nums = [0,1]
 * 输出：2
 * 解释：n = 2，因为有 2 个数字，所以所有的数字都在范围 [0,2] 内。2 是丢失的数字，因为它没有出现在 nums 中。
 *
 * 示例 3：
 * 输入：nums = [9,6,4,2,3,5,7,0,1]
 * 输出：8
 * 解释：n = 9，因为有 9 个数字，所以所有的数字都在范围 [0,9] 内。8 是丢失的数字，因为它没有出现在 nums 中。
 *
 * 示例 4：
 * 输入：nums = [0]
 * 输出：1
 * 解释：n = 1，因为有 1 个数字，所以所有的数字都在范围 [0,1] 内。1 是丢失的数字，因为它没有出现在 nums 中。
 *
 * 提示：
 * n == nums.length
 * 1 <= n <= 104
 * 0 <= nums[i] <= n
 * nums 中的所有数字都 独一无二
 *
 * 进阶：你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 */
public class MissingNumber {
    /**
     * 方法一：排序
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        //排序
        Arrays.sort(nums);
        //遍历
        for (int i = 0; i < nums.length; i++) {
            //当前数不存在
            if (i != nums[i])
                return i;
        }
        return nums.length;
    }

    /**
     * 方法二：set集合
     * @param nums
     * @return
     */
    public int missingNumber_set(int[] nums) {
        Set<Integer> set = new HashSet<>();
        //存入数组元素
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        //遍历0~n不存在的直接返回
        for (int i = 0; i <= nums.length ; i++) {
            if (!set.contains(i))
                return i;
        }
        return -1;
    }

    /**
     * 方法三：位运算
     * @param nums
     * @return
     */
    public int missingNumber_bit(int[] nums) {
        int res = 0;
        //将数组中中数异或
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        //利用 x^x = 0， x^0 = x的特性，将0~n在异或一边，除了结果所有数都出现一次
        for (int i = 0; i <= nums.length ; i++) {
            res ^= i;
        }
        return res;
    }

    /**
     * 方法四：数学
     * @param nums
     * @return
     */
    public int missingNumber_math(int[] nums) {
        int sum = 0;
        //0~n的和
        for (int i = 0; i <= nums.length; i++) {
            sum += i;
        }
        //Arrays.stream(nums).sum()数组内数字和，差值为确实数字
        return sum - Arrays.stream(nums).sum();
    }

}
