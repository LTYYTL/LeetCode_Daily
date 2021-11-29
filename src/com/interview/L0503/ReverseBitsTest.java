package com.interview.L0503;

public class ReverseBitsTest {
    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        /**
         * 示例 1：
         * 输入: num = 1775(110111011112)
         * 输出: 8
         */
        System.out.println(reverseBits.reverseBits(1775));
        /**
         * 示例 2：
         * 输入: num = 7(01112)
         * 输出: 4
         */
        System.out.println(reverseBits.reverseBits(7));
    }
}
