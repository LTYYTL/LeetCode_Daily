package com.leetcode.L601_700.L0670;

import java.util.Arrays;

/**
 * 670. 最大交换
 * 给定一个非负整数，你至多可以交换一次数字中的任意两位。返回你能得到的最大值。
 * <p>
 * 示例 1 :
 * 输入: 2736
 * 输出: 7236
 * 解释: 交换数字2和数字7。
 * <p>
 * 示例 2 :
 * 输入: 9973
 * 输出: 9973
 * 解释: 不需要交换。
 * <p>
 * 注意:
 * 给定数字的范围是 [0, 108]
 */
public class MaxSwap {
    /**
     * 方法：排序
     */
    public int maximumSwap(int num) {
        // 转换成数组
        char[] arr = String.valueOf(num).toCharArray();
        // 降序排序
        char[] sort = sort(String.valueOf(num).toCharArray());

        // 长度
        int n = sort.length;
        //
        char val = 0;
        // 被替换的字符
        char old = 0;
        // 正序遍历
        for (int i = 0; i < n; i++) {
            // 与排序数组不同的字符
            if (arr[i] != sort[i]) {
                // 被替换的字符
                old = arr[i];
                // 替换
                arr[i] = sort[i];
                // 替换的字符
                val = sort[i];
                break;
            }
        }

        // 倒序遍历
        for (int i = sort.length - 1; i >= 0; i--) {
            // 寻找倒序的字符
            if (arr[i] == val) {
                arr[i] = old;
                break;
            }
        }

        return Integer.parseInt(new String(arr));
    }

    /**
     * 将数组升序数组
     */
    private char[] sort(char[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char c = arr[left];
            arr[left] = arr[right];
            arr[right] = c;
            left++;
            right--;
        }
        return arr;
    }
}
