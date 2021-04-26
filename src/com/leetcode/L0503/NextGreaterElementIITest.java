package com.leetcode.L0503;

import java.util.Arrays;

public class NextGreaterElementIITest {
    public static void main(String[] args) {
        NextGreaterElementII nextGreaterElementII = new NextGreaterElementII();
        /**
         * 示例 1:
         * 输入: [1,2,1]
         * 输出: [2,-1,2]
         * 解释: 第一个 1 的下一个更大的数是 2；
         * 数字 2 找不到下一个更大的数；
         * 第二个 1 的下一个最大的数需要循环搜索，结果也是 2。
         */
        System.out.println(Arrays.toString(nextGreaterElementII.nextGreaterElements(new int[]{1, 2, 1})));
    }
}
