package com.leetcode.L701_800.L0709;

public class ToLowerCaseTest {
    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();
        /*
          示例 1：
          输入：s = "Hello"
          输出："hello"
         */
        System.out.println(toLowerCase.toLowerCase("Hello"));
        System.out.println(toLowerCase.toLowerCase_moni("Hello"));
        /*
          示例 2：
          输入：s = "here"
          输出："here"
         */
        System.out.println(toLowerCase.toLowerCase("here"));
        System.out.println(toLowerCase.toLowerCase_moni("here"));
        /*
          示例 3：
          输入：s = "LOVELY"
          输出："lovely"
         */
        System.out.println(toLowerCase.toLowerCase("LOVELY"));
        System.out.println(toLowerCase.toLowerCase_moni("LOVELY"));
    }
}
