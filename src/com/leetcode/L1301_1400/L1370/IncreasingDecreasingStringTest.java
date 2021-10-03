package com.leetcode.L1301_1400.L1370;

public class IncreasingDecreasingStringTest {
    public static void main(String[] args) {
        IncreasingDecreasingString increasingDecreasingString = new IncreasingDecreasingString();
        /** * 示例 1：
         * 输入：s = "aaaabbbbcccc"
         * 输出："abccbaabccba"
         * 解释：第一轮的步骤 1，2，3 后，结果字符串为 result = "abc"
         * 第一轮的步骤 4，5，6 后，结果字符串为 result = "abccba"
         * 第一轮结束，现在 s = "aabbcc" ，我们再次回到步骤 1
         * 第二轮的步骤 1，2，3 后，结果字符串为 result = "abccbaabc"
         * 第二轮的步骤 4，5，6 后，结果字符串为 result = "abccbaabccba"
         */
        System.out.println(increasingDecreasingString.sortString("aaaabbbbcccc"));
        /**
         * 示例 2：
         * 输入：s = "rat"
         * 输出："art"
         * 解释：单词 "rat" 在上述算法重排序以后变成 "art"
         */
        System.out.println(increasingDecreasingString.sortString("rat"));
        /**
         * 示例 3：
         * 输入：s = "leetcode"
         * 输出："cdelotee"
         */
        System.out.println(increasingDecreasingString.sortString("leetcode"));
        /**
         * 示例 4：
         * 输入：s = "ggggggg"
         * 输出："ggggggg"
         */
        System.out.println(increasingDecreasingString.sortString("ggggggg"));
        /**
         * 示例 5：
         * 输入：s = "spo"
         * 输出："ops"
         */
        System.out.println(increasingDecreasingString.sortString("spo"));
    }
}
