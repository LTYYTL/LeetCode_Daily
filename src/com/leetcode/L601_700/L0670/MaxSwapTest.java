package com.leetcode.L601_700.L0670;

public class MaxSwapTest {
    public static void main(String[] args) {
        MaxSwap maxSwap = new MaxSwap();
        /*
          示例 1 :
          输入: 2736
          输出: 7236
          解释: 交换数字2和数字7。
         */
        System.out.println(maxSwap.maximumSwap(2736));
        /*
          示例 2 :
          输入: 9973
          输出: 9973
          解释: 不需要交换。
         */
        System.out.println(maxSwap.maximumSwap(9973));
    }
}
