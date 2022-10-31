package com.leetcode.L901_1000.L0907;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 907. 子数组的最小值之和
 * 给定一个整数数组 arr，找到 min(b) 的总和，其中 b 的范围为 arr 的每个（连续）子数组。
 * 由于答案可能很大，因此 返回答案模 10^9 + 7 。
 * <p>
 * 示例 1：
 * 输入：arr = [3,1,2,4]
 * 输出：17
 * 解释：
 * 子数组为 [3]，[1]，[2]，[4]，[3,1]，[1,2]，[2,4]，[3,1,2]，[1,2,4]，[3,1,2,4]。
 * 最小值为 3，1，2，4，1，1，2，1，1，1，和为 17。
 * <p>
 * 示例 2：
 * 输入：arr = [11,81,94,43,3]
 * 输出：444
 * <p>
 * 提示：
 * 1 <= arr.length <= 3 * 104
 * 1 <= arr[i] <= 3 * 104
 */
public class SumSubarrayMin {
    /**
     * 方法：单调栈
     */
    public int sumSubarrayMins(int[] arr) {
        // 结果
        long result = 0;
        // 栈
        Deque<Integer> stack = new LinkedList<>();
        // 模
        int mod = (int) (1e9 + 7);
        // 遍历
        for (int i = 0; i <= arr.length; i++) {
            // 保证最后栈为空
            int num = (i == arr.length) ? 0 : arr[i];
            // 比栈顶值小，出栈
            while (!stack.isEmpty() && arr[stack.peek()] > num) {
                // 栈顶元素索引
                int n = stack.pop();
                // 当前栈顶索引，及向前辐射的区域大小（开区间）
                int h = !stack.isEmpty() ? stack.peek() : -1;
                // 向后辐射的区域索引大小（开区间）
                int t = i;
                // 计算结果
                result = (result + (long) (n - h) * (t - n) * arr[n]) % mod;
            }
            // 入栈
            stack.push(i);
        }
        return (int) result;
    }

}
