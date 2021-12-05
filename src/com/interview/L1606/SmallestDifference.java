package com.interview.L1606;

import java.util.Arrays;

/**
 * 面试题 16.06. 最小差
 * 给定两个整数数组a和b，计算具有最小差绝对值的一对数值（每个数组中取一个值），并返回该对数值的差
 *
 * 示例：
 * 输入：{1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}
 * 输出：3，即数值对(11, 8)
 *
 * 提示：
 * 1 <= a.length, b.length <= 100000
 * -2147483648 <= a[i], b[i] <= 2147483647
 * 正确结果在区间 [0, 2147483647] 内
 */
public class SmallestDifference {
    /**
     * 方法：排序+双指针
     * @param a
     * @param b
     * @return
     */
    public int smallestDifference(int[] a, int[] b) {
        //两个数组都只有一个
        if (a.length == 1 && b.length == 1)
            return Math.abs(a[0] - b[0]);
        //排序
        Arrays.sort(a);
        Arrays.sort(b);
        //最小值
        long min = Math.abs((long)a[0]-b[0]);
        //索引
        int i = 0;
        int j = 0;
        //遍历
        while (i < a.length && j < b.length){
            //获取差值的绝对值
            long temp = Math.abs((long)a[i] - b[j]);
            //获取最小的
            min = Math.min(min,temp);
            //小的数字指针向后移
            if (a[i] > b[j])
                j++;
            else
                i++;
        }
        return (int) min;
    }
}
