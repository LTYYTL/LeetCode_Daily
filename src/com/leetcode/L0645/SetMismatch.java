package com.leetcode.L0645;

import java.util.HashSet;
import java.util.Set;

/**
 * 645. 错误的集合
 * 集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 丢失了一个数字并且有一个数字重复 。
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。
 * 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 *
 * 示例 1：
 * 输入：nums = [1,2,2,4]
 * 输出：[2,3]
 *
 * 示例 2：
 * 输入：nums = [1,1]
 * 输出：[1,2]
 *
 * 提示：
 * 2 <= nums.length <= 104
 * 1 <= nums[i] <= 104
 */
public class SetMismatch {
    /**
     * 方法一：set集合
     * @param nums
     * @return
     */
    public int[] findErrorNums(int[] nums) {
        //结果变量
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();
        //寻找重复数字
        for (int num : nums) {
            //已经存在set中为重复数字
            if (set.contains(num))
                res[0] = num;
            set.add(num);
        }
        //寻找丢失数字
        for (int i = 1; i <= nums.length; i++) {
            //在set中不存在，就是丢失数字
            if (!set.contains(i)){
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
