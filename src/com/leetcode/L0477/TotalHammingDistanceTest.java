package com.leetcode.L0477;

public class TotalHammingDistanceTest {
    public static void main(String[] args) {
        TotalHammingDistance totalHammingDistance = new TotalHammingDistance();
        /**
         * 示例:
         * 输入: 4, 14, 2
         * 输出: 6
         * 解释: 在二进制表示中，4表示为0100，14表示为1110，2表示为0010。（这样表示是为了体现后四位之间关系）
         * 所以答案为：
         * HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
         */
        System.out.println(totalHammingDistance.totalHammingDistance(new int[]{4, 14, 2}));
        System.out.println(totalHammingDistance.totalHammingDistance_bit(new int[]{4, 14, 2}));
    }
}
