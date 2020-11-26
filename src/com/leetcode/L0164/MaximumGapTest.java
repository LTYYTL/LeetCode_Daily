package com.leetcode.L0164;

public class MaximumGapTest {
    public static void main(String[] args) {
        MaximumGap maximumGap = new MaximumGap();
        /**示例 1:
         * 输入: [3,6,9,1]
         * 输出: 3
         * 解释: 排序后的数组是 [1,3,6,9], 其中相邻元素 (3,6) 和 (6,9) 之间都存在最大差值 3。
         */
        System.out.println(maximumGap.maximumGap(new int[]{3,6,9,1}));
        System.out.println(maximumGap.maximumGap_barrel(new int[]{3,6,9,1}));
    }
}
