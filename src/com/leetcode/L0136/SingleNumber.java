package com.leetcode.L0136;

import java.util.HashMap;
import java.util.Map;

/**
 * 136. 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 *
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class SingleNumber {
    /**
     * 方法一：Map映射
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        //记录出现的次数
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //寻找出现一次的数字
        for (Integer integer : map.keySet()) {
            if (map.get(integer) == 1)
                return integer;
        }
        return -1;
    }

    /**
     * 方法二：位运算
     * @param nums
     * @return
     */
    public int singleNumber_bit(int[] nums) {
        int single = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            single ^= nums[i];
        }
        return single;
    }
}
