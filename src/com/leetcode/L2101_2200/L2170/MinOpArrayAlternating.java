package com.leetcode.L2101_2200.L2170;

import java.util.HashMap;
import java.util.Map;

/**
 * 2170. 使数组变成交替数组的最少操作数
 * 给你一个下标从 0 开始的数组 nums ，该数组由 n 个正整数组成。
 * 如果满足下述条件，则数组 nums 是一个 交替数组 ：
 * (1)nums[i - 2] == nums[i] ，其中 2 <= i <= n - 1 。
 * (2)nums[i - 1] != nums[i] ，其中 1 <= i <= n - 1 。
 * 在一步 操作 中，你可以选择下标 i 并将 nums[i] 更改 为 任一 正整数。
 * 返回使数组变成交替数组的 最少操作数 。
 *
 * 示例 1：
 * 输入：nums = [3,1,3,2,4,3]
 * 输出：3
 * 解释：
 * 使数组变成交替数组的方法之一是将该数组转换为 [3,1,3,1,3,1] 。
 * 在这种情况下，操作数为 3 。
 * 可以证明，操作数少于 3 的情况下，无法使数组变成交替数组。
 *
 * 示例 2：
 * 输入：nums = [1,2,2,2,2]
 * 输出：2
 * 解释：
 * 使数组变成交替数组的方法之一是将该数组转换为 [1,2,1,2,1].
 * 在这种情况下，操作数为 2 。
 * 注意，数组不能转换成 [2,2,2,2,2] 。因为在这种情况下，nums[0] == nums[1]，不满足交替数组的条件。
 *
 * 提示：
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 */
public class MinOpArrayAlternating {
    /**
     * 方法 ：map映射
     * @param nums
     * @return
     */
    public int minimumOperations(int[] nums) {
        //长度
        int n = nums.length;

        //记录奇数位的数出现的次数
        Map<Integer,Integer> oddMap = new HashMap<>();
        for (int i = 0; i < n; i+=2) {
            int num = nums[i];
            oddMap.put(num,oddMap.getOrDefault(num,0)+1);
        }

        //记录偶数位的数出现的次数
        Map<Integer,Integer> evenMap = new HashMap<>();
        for (int i = 1; i < n; i+=2) {
            int num = nums[i];
            evenMap.put(num,evenMap.getOrDefault(num,0)+1);
        }

        //奇数位次数最多和次多的两个数
        int[][] oddMax = check(oddMap);
        //偶数位次数最多和次多的两个数
        int[][] evenMax = check(evenMap);

        //奇偶位最多的数不相同，操作次数：长度n - 两个数次数的和
        if (oddMax[0][0] != evenMax[0][0]){
            n -= oddMax[0][1];
            n -= evenMax[0][1];
        }else {//奇偶位最多的数相同，操作次数：长度n - 两个数次数的最大和
            n -= Math.max(oddMax[0][1] + evenMax[1][1],oddMax[1][1] + evenMax[0][1]);
        }

        return n;

    }

    /**
     * 获取最多的数和次多的数
     * @param map
     * @return
     */
    private int[][] check(Map<Integer, Integer> map) {
        //结果
        int[][] res = new int[2][2];
        //遍历
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //数字
            int key = entry.getKey();
            //次数
            int value = entry.getValue();
            //当前数的次数比最多的还多，就改变最多和次多
            if (value > res[0][1]){
                res[1][0] = res[0][0];
                res[1][1] = res[0][1];
                res[0][0] = key;
                res[0][1] = value;
            }else if (value > res[1][1]){//当前数的次数比次多的还多但比最多的少，就改变次多
                res[1][0] = key;
                res[1][1] = value;
            }
        }
        return res;
    }
}
