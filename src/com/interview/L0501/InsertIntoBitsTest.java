package com.interview.L0501;

public class InsertIntoBitsTest {
    public static void main(String[] args) {
        InsertIntoBits insertIntoBits = new InsertIntoBits();
        /**
         * 示例1:
         *  输入：N = 1024(10000000000), M = 19(10011), i = 2, j = 6
         *  输出：N = 1100(10001001100)
         */
        System.out.println(insertIntoBits.insertBits(1024, 19, 2, 6));
        /**
         * 示例2:
         *  输入： N = 0, M = 31(11111), i = 0, j = 4
         *  输出：N = 31(11111)
         */
        System.out.println(insertIntoBits.insertBits(0, 31, 0, 4));
    }
}
