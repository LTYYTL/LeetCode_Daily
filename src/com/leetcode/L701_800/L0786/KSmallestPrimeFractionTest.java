package com.leetcode.L701_800.L0786;

import java.util.Arrays;

public class KSmallestPrimeFractionTest {
    public static void main(String[] args) {
        KSmallestPrimeFraction kSmallestPrimeFraction = new KSmallestPrimeFraction();
        /*
          示例 1：
          输入：arr = [1,2,3,5], k = 3
          输出：[2,5]
          解释：已构造好的分数,排序后如下所示:
          1/5, 1/3, 2/5, 1/2, 3/5, 2/3
          很明显第三个最小的分数是 2/5
         */
        System.out.println(Arrays.toString(kSmallestPrimeFraction.kthSmallestPrimeFraction(new int[]{1, 2, 3, 5}, 3)));
        /*
          示例 2：
          输入：arr = [1,7], k = 1
          输出：[1,7]
         */
        System.out.println(Arrays.toString(kSmallestPrimeFraction.kthSmallestPrimeFraction(new int[]{1, 7}, 1)));
    }
}
