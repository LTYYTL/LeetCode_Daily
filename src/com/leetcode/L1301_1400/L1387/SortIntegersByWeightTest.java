package com.leetcode.L1301_1400.L1387;

public class SortIntegersByWeightTest {
    public static void main(String[] args) {
        SortIntegersByWeight sortIntegersByWeight = new SortIntegersByWeight();
        /*
         * 示例 1：
         * 输入：lo = 12, hi = 15, k = 2
         * 输出：13
         * 解释：12 的权重为 9（12 --> 6 --> 3 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1）
         * 13 的权重为 9
         * 14 的权重为 17
         * 15 的权重为 17
         * 区间内的数按权重排序以后的结果为 [12,13,14,15] 。对于 k = 2 ，答案是第二个整数也就是 13 。
         * 注意，12 和 13 有相同的权重，所以我们按照它们本身升序排序。14 和 15 同理。
         */
        System.out.println(sortIntegersByWeight.getKth(12, 15, 2));
        /*
         * 示例 2：
         * 输入：lo = 7, hi = 11, k = 4
         * 输出：7
         * 解释：区间内整数 [7, 8, 9, 10, 11] 对应的权重为 [16, 3, 19, 6, 14] 。
         * 按权重排序后得到的结果为 [8, 10, 11, 7, 9] 。
         * 排序后数组中第 4 个数字为 7 。
         */
        System.out.println(sortIntegersByWeight.getKth(7, 11, 4));
    }
}
