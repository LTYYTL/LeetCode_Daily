package com.leetcode.L801_900.L0890;

public class FindReplacePatternTest {
    public static void main(String[] args) {
        FindReplacePattern findReplacePattern = new FindReplacePattern();
        /**
         * 示例：
         * 输入：words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
         * 输出：["mee","aqq"]
         * 解释：
         * "mee" 与模式匹配，因为存在排列 {a -> m, b -> e, ...}。
         * "ccc" 与模式不匹配，因为 {a -> c, b -> c, ...} 不是排列。
         * 因为 a 和 b 映射到同一个字母。
         */
        System.out.println(findReplacePattern.findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb"));
    }
}
