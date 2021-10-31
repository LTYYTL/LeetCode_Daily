package com.leetcode.L201_300.L0260;

import java.util.HashMap;
import java.util.Map;

/**
 * 260. 只出现一次的数字 III
 * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。你可以按 任意顺序 返回答案。
 *
 * 进阶：你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？
 *
 * 示例 1：
 * 输入：nums = [1,2,1,3,2,5]
 * 输出：[3,5]
 * 解释：[5, 3] 也是有效的答案。
 *
 * 示例 2：
 * 输入：nums = [-1,0]
 * 输出：[-1,0]
 *
 * 示例 3：
 * 输入：nums = [0,1]
 * 输出：[1,0]
 *
 * 提示：
 * 2 <= nums.length <= 3 * 104
 * -231 <= nums[i] <= 231 - 1
 * 除两个只出现一次的整数外，nums 中的其他数字都出现两次
 */
public class SingleNumberIII {
    /**
     * 方法一：map映射
     * @param nums
     * @return
     */
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        //记录出现次数
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //结果集
        int[] res = new int[2];
        //索引
        int index = 0;
        //遍历map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            //只出现一次
            if (value == 1)
                res[index++] = key;
        }
        return res;
    }

    /**
     * 方法二：位运算
     * @param nums
     * @return
     */
    public int[] singleNumber_bit(int[] nums) {
        int x = 0;
        int y = 0;
        int m = 0;
        //异或结果
        for (int num : nums) {
            m ^= num;
        }
        //不同的最低位
        int n = Integer.lowestOneBit(m);
        //根据最低位，将数组分成两部分
        for (int num : nums) {
            if ((num&n) == 0)
                x ^= num;
            else
                y ^= num;
        }
        return new int[]{x,y};
    }
}
