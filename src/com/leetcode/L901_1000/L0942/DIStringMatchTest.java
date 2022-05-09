package com.leetcode.L901_1000.L0942;

import java.util.Arrays;

public class DIStringMatchTest {
    public static void main(String[] args) {
        DIStringMatch diStringMatch = new DIStringMatch();
        /**
         * 示例 1：
         * 输入：s = "IDID"
         * 输出：[0,4,1,3,2]
         */
        System.out.println(Arrays.toString(diStringMatch.diStringMatch("IDID")));
        /**
         * 示例 2：
         * 输入：s = "III"
         * 输出：[0,1,2,3]
         */
        System.out.println(Arrays.toString(diStringMatch.diStringMatch("III")));
        /**
         * 示例 3：
         * 输入：s = "DDI"
         * 输出：[3,2,0,1]
         */
        System.out.println(Arrays.toString(diStringMatch.diStringMatch("DDI")));
    }
}
