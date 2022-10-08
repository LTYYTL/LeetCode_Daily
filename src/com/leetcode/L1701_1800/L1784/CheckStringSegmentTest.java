package com.leetcode.L1701_1800.L1784;

public class CheckStringSegmentTest {
    public static void main(String[] args) {
        CheckStringSegment checkStringSegment = new CheckStringSegment();
        /*
          示例 1：
          输入：s = "1001"
          输出：false
          解释：由连续若干个 '1' 组成的字段数量为 2，返回 false
         */
        System.out.println(checkStringSegment.checkOnesSegment("1001"));
        /*
          示例 2：
          输入：s = "110"
          输出：true
         */
        System.out.println(checkStringSegment.checkOnesSegment("110"));
    }
}
