package com.leetcode.L2101_2200.L2109;

import com.leetcode.L2501_2600.L2506.SimilarStrPairCounter;

public class SpaceAdderToStrTest {
    public static void main(String[] args) {
        SpaceAdderToStr spaceAdderToStr = new SpaceAdderToStr();
        /*
         * 示例 1：
         * 输入：s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
         * 输出："Leetcode Helps Me Learn"
         * 解释：
         * 下标 8、13 和 15 对应 "LeetcodeHelpsMeLearn" 中加粗斜体字符。
         * 接着在这些字符前添加空格。
         */
        System.out.println(spaceAdderToStr.addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15}));
        /*
         * 示例 2：
         * 输入：s = "icodeinpython", spaces = [1,5,7,9]
         * 输出："i code in py thon"
         * 解释：
         * 下标 1、5、7 和 9 对应 "icodeinpython" 中加粗斜体字符。
         * 接着在这些字符前添加空格。
         */
        System.out.println(spaceAdderToStr.addSpaces("icodeinpython", new int[]{1, 5, 7, 9}));
        /*
         * 示例 3：
         * 输入：s = "spacing", spaces = [0,1,2,3,4,5,6]
         * 输出：" s p a c i n g"
         * 解释：
         * 字符串的第一个字符前可以添加空格。
         */
        System.out.println(spaceAdderToStr.addSpaces("spacing", new int[]{0, 1, 2, 3, 4, 5, 6}));

    }
}
