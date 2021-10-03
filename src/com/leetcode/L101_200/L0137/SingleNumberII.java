package com.leetcode.L101_200.L0137;

import java.util.HashMap;
import java.util.Map;

/**
 * 137. 只出现一次的数字 II
 * 给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
 *
 * 示例 1：
 * 输入：nums = [2,2,3,2]
 * 输出：3
 *
 * 示例 2：
 * 输入：nums = [0,1,0,1,0,1,99]
 * 输出：99
 *
 * 提示：
 * 1 <= nums.length <= 3 * 104
 * -231 <= nums[i] <= 231 - 1
 * nums 中，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次
 *
 * 进阶：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class SingleNumberII {
    /**
     * 方法一：map映射
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        //记录出现次数
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //遍历map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value != 3)
                return key;
        }
        return 0;
    }

    /**
     * 方法：位运算
     * @param nums
     * @return
     */
    public int singleNumber_bit(int[] nums) {
        //最终的结果值
        int res = 0;
        //int类型有32位，统计每一位1的个数
        for (int i = 0; i < 32; i++) {
            //统计第i位中1的个数
            int oneCount = 0;
            for (int j = 0; j < nums.length; j++) {
                oneCount += (nums[j] >>> i) & 1;
            }
            //如果1的个数不是3的倍数，说明那个只出现一次的数字
            //的二进制位中在这一位是1
            if (oneCount % 3 == 1)
                res |= 1 << i;
        }
        return res;
    }
}
