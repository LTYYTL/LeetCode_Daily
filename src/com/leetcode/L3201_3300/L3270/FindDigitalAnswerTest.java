package com.leetcode.L3201_3300.L3270;

public class FindDigitalAnswerTest {
    public static void main(String[] args) {
        FindDigitalAnswer findDigitalAnswer = new FindDigitalAnswer();
        /*
         * 示例 1：
         * 输入：num1 = 1, num2 = 10, num3 = 1000
         * 输出：0
         * 解释：
         * 补前导 0 后，num1 变为 "0001" ，num2 变为 "0010" ，num3 保持不变，为 "1000" 。
         * 数字答案 key 的第 1 个数位为 min(0, 0, 1) 。
         * 数字答案 key 的第 2 个数位为 min(0, 0, 0) 。
         * 数字答案 key 的第 3 个数位为 min(0, 1, 0) 。
         * 数字答案 key 的第 4 个数位为 min(1, 0, 0) 。
         * 所以数字答案为 "0000" ，也就是 0 。
         */
        System.out.println(findDigitalAnswer.generateKey(1, 10, 1000));
        /*
         * 示例 2：
         * 输入： num1 = 987, num2 = 879, num3 = 798
         * 输出：777
         */
        System.out.println(findDigitalAnswer.generateKey(987, 879, 798));
        /*
         * 示例 3：
         * 输入：num1 = 1, num2 = 2, num3 = 3
         * 输出：1
         */
        System.out.println(findDigitalAnswer.generateKey(1, 2, 3));
    }
}
