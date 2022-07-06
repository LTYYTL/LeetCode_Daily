package com.leetcode.L501_600.L0556;

import java.util.Arrays;

/**
 * 556. 下一个更大元素 III
 * 给你一个正整数 n ，请你找出符合条件的最小整数，其由重新排列 n 中存在的每位数字组成，并且其值大于 n 。如果不存在这样的正整数，则返回 -1 。
 * 注意 ，返回的整数应当是一个 32 位整数 ，如果存在满足题意的答案，但不是 32 位整数 ，同样返回 -1 。
 * <p>
 * 示例 1：
 * 输入：n = 12
 * 输出：21
 * <p>
 * 示例 2：
 * 输入：n = 21
 * 输出：-1
 * <p>
 * 提示：
 * 1 <= n <= 231 - 1
 */
public class NextGreaterElementIII {
    /**
     * 方法：双指针
     *
     * @param n
     * @return
     */
    public int nextGreaterElement(int n) {
        //转换成数组
        char[] arr = Integer.toString(n).toCharArray();
        //记录最小索引
        int index = -1;
        //从后往前遍历寻找升序
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                index = i - 1;
                break;
            }
        }
        //就是最大数
        if (index == -1)
            return -1;
        //从后往前寻找第一个比num[index]大的数
        for (int i = arr.length - 1; i >= 0; i--) {
            //交换
            if (arr[i] > arr[index]) {
                char c = arr[i];
                arr[i] = arr[index];
                arr[index] = c;
                break;
            }
        }

        //排序
        Arrays.sort(arr, index + 1, arr.length);
        //计算长度
        long ans = Long.parseLong(new String(arr));
        if (ans > Integer.MAX_VALUE)
            return -1;
        return (int) ans;

    }

}
