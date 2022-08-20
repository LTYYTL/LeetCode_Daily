package com.leetcode.L1_100.L0038;

public class CountSayTest {
    public static void main(String[] args) {
        CountSay countSay = new CountSay();
        /*
          示例 1：
          输入：n = 1
          输出："1"
          解释：这是一个基本样例。
         */
        System.out.println(countSay.countAndSay(1));
        /*
          示例 2：
          输入：n = 4
          输出："1211"
          解释：
          countAndSay(1) = "1"
          countAndSay(2) = 读 "1" = 一 个 1 = "11"
          countAndSay(3) = 读 "11" = 二 个 1 = "21"
          countAndSay(4) = 读 "21" = 一 个 2 + 一 个 1 = "12" + "11" = "1211"
         */
        System.out.println(countSay.countAndSay(4));
    }
}
