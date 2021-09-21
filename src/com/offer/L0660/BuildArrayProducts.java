package com.offer.L0660;

import java.util.Arrays;

/**
 * 剑指 Offer 66. 构建乘积数组
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积,
 * 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 * 示例:
 * 输入: [1,2,3,4,5]
 * 输出: [120,60,40,30,24]
 *
 * 提示：
 * 所有元素乘积之和不会溢出 32 位整数
 * a.length <= 100000
 */
public class BuildArrayProducts {
    /**
     * 方法：数学
     * @param a
     * @return
     */
    public int[] constructArr(int[] a) {
        //长度
        int n = a.length;
        //结果
        int[] b = new int[n];
        //特殊情况
        if (n == 0)
            return b;
        //填充1
        Arrays.fill(b,1);
        //下三角（即i之前的元素积）
        for (int i = 1; i <n ; i++) {
            b[i] = b[i-1] * a[i-1];
        }
        //临时变量
        int temp = 1;
        //上三角（即i之后的元素积）
        for (int i = n-2; i >= 0; i--) {
            temp *= a[i+1];
            b[i] *= temp;
        }
        return b;
    }
}
