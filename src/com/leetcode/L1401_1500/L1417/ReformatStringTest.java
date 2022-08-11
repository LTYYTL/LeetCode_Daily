package com.leetcode.L1401_1500.L1417;

public class ReformatStringTest {
    public static void main(String[] args) {
        ReformatString reformatString = new ReformatString();
        /**
         * 示例 1：
         * 输入：s = "a0b1c2"
         * 输出："0a1b2c"
         * 解释："0a1b2c" 中任意两个相邻字符的类型都不同。 "a0b1c2", "0a1b2c", "0c2a1b" 也是满足题目要求的答案。
         */
        System.out.println(reformatString.reformat("a0b1c2"));
        /**
         * 示例 2：
         * 输入：s = "leetcode"
         * 输出：""
         * 解释："leetcode" 中只有字母，所以无法满足重新格式化的条件。
         */
        System.out.println(reformatString.reformat("leetcode"));
        /**
         * 示例 3：
         * 输入：s = "1229857369"
         * 输出：""
         * 解释："1229857369" 中只有数字，所以无法满足重新格式化的条件。
         */
        System.out.println(reformatString.reformat("1229857369"));
        /**
         * 示例 4：
         * 输入：s = "covid2019"
         * 输出："c2o0v1i9d"
         */
        System.out.println(reformatString.reformat("covid2019"));
        /**
         * 示例 5：
         * 输入：s = "ab123"
         * 输出："1a2b3"
         */
        System.out.println(reformatString.reformat("ab123"));
    }
}
