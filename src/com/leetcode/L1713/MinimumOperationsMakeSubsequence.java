package com.leetcode.L1713;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1713. 得到子序列的最少操作次数
 * 给你一个数组 target ，包含若干 互不相同 的整数，以及另一个整数数组 arr ，arr 可能 包含重复元素。
 * 每一次操作中，你可以在 arr 的任意位置插入任一整数。比方说，如果 arr = [1,4,1,2] ，那么你可以在中间添加 3 得到 [1,4,3,1,2] 。你可以在数组最开始或最后面添加整数。
 * 请你返回 最少 操作次数，使得 target 成为 arr 的一个子序列。
 *
 * 一个数组的 子序列 指的是删除原数组的某些元素（可能一个元素都不删除），同时不改变其余元素的相对顺序得到的数组。
 * 比方说，[2,7,4] 是 [4,2,3,7,2,1,4] 的子序列（加粗元素），但 [2,4,2] 不是子序列。
 *
 * 示例 1：
 * 输入：target = [5,1,3], arr = [9,4,2,3,4]
 * 输出：2
 * 解释：你可以添加 5 和 1 ，使得 arr 变为 [5,9,4,1,2,3,4] ，target 为 arr 的子序列。
 *
 * 示例 2：
 * 输入：target = [6,4,8,1,3,2], arr = [4,7,6,2,3,8,6,1]
 * 输出：3
 *
 * 提示：
 * 1 <= target.length, arr.length <= 105
 * 1 <= target[i], arr[i] <= 109
 * target 不包含任何重复元素。
 */
public class MinimumOperationsMakeSubsequence {
    /**
     * 方法：二分查找
     * @param target
     * @param arr
     * @return
     */
    public int minOperations(int[] target, int[] arr) {
        // 第一步，把target中的所有值对应的索引存到哈希表中
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            hashMap.put(target[i], i);
        }
        // 第二步，把arr中在target数组存在的数字的索引按顺序排列到新的数组中
        int index = 0;
        int[] indexArray = new int[arr.length];
        Arrays.fill(indexArray, -1); // 初始填充-1
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                indexArray[index++] = hashMap.get(arr[i]);
            }
        }
        // 如果都为-1，代码arr中没有target中的整数，返回target长度
        if (indexArray[0] == -1) return target.length;
        // 第三步，计算indexArray中的最长递增子序列，这里直接套用 300. 最长递增子序列 题目的官方解法；
        int num = lengthOfLIS(indexArray);

        return target.length - num;
    }

    private int lengthOfLIS(int[] nums) {
        int len = 1, n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] d = new int[n + 1];
        d[len] = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] > d[len]) {
                d[++len] = nums[i];
            } else {
                int l = 1, r = len, pos = 0;
                while (l <= r) {
                    int mid = (l + r) >> 1;
                    if (d[mid] < nums[i]) {
                        pos = mid;
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
                d[pos + 1] = nums[i];
            }
        }
        return len;
    }
}
