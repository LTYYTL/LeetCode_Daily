package com.leetcode.L1501_1600.L1573;

public class SplitStringNumTest {
    public static void main(String[] args) {
        SplitStringNum solution5492_splitStringNum = new SplitStringNum();
        /*
          示例 1：
          输入：s = "10101"
          输出：4
          解释：总共有 4 种方法将 s 分割成含有 '1' 数目相同的三个子字符串。
          "1|010|1"
          "1|01|01"
          "10|10|1"
          "10|1|01"
         */
        System.out.println(solution5492_splitStringNum.numWays("10101"));

        /*
          示例 2：
          输入：s = "1001"
          输出：0
         */
        System.out.println(solution5492_splitStringNum.numWays("1001"));

        /*
          示例 3：
          输入：s = "0000"
          输出：3
          解释：总共有 3 种分割 s 的方法。
          "0|0|00"
          "0|00|0"
          "00|0|0"
         */
        System.out.println(solution5492_splitStringNum.numWays("0000"));

        /*
          示例 4：
          输入：s = "100100010100110"
          输出：12
         */
        System.out.println(solution5492_splitStringNum.numWays("100100010100110"));
    }
}
